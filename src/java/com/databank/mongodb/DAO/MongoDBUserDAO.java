
package com.databank.mongodb.DAO;

/**
 *
 * @author ayprograms
 */


import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.databank.mongodb.converter.UserConverter;
import com.databank.mongodb.model.User;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

//DAO class for different MongoDB CRUD operations


public class MongoDBUserDAO {

	private DBCollection col;

	public MongoDBUserDAO(MongoClient mongo) {
		this.col = mongo.getDB("databank").getCollection("Users");
	}

        //create a user in the database
        
	public User createUser(User u) {
		DBObject doc = UserConverter.toDBObject(u);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		u.setID(id.toString());
		return u;
	}

        
        //update a user in the database
        
        
	public void updateUser(User u) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(u.getID())).get();
		this.col.update(query, UserConverter.toDBObject(u));
	}

        
        //read all users from the database
        
	public List<User> readAllUser() {
		List<User> data = new ArrayList<User>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			User u = UserConverter.toUser(doc);
			data.add(u);
		}
		return data;
	}

        //delete a user from the database
        
	public void deleteUser(User u) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(u.getID())).get();
		this.col.remove(query);
	}

        
        
        //read one user from the database
        
	public User readUser(User u) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(u.getID())).get();
		DBObject data = this.col.findOne(query);
		return UserConverter.toUser(data);
	}

        
        //check if username exist in the database
        
        public boolean checkUsername(String user){
            
           DBCursor cursor = col.find({username: {$in:[user]}});
           
           
           return true;
        }
        
        //check if email exist in the database
        
        public boolean checkEmail(){
            
            return true;
        }
        
}
