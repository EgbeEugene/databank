/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.databank.mongodb.converter;

import org.bson.types.ObjectId;

import com.databank.mongodb.model.User;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

/**
 *
 * @author ayprograms
 */
public class UserConverter {

	// convert User Object to MongoDB DBObject
    // take special note of converting id String to ObjectId
    
    
    public static DBObject toDBObject(User u) {

        BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
                .append("firstname", u.getFirstname())
                .append("lastname", u.getLastname())
                .append("email", u.getEmail())
                .append("username", u.getUsername())
                .append("location", u.getLocation())
                .append("password1", u.getPassword1());
        if (u.getID() != null) {
            builder = builder.append("_id", new ObjectId(u.getID()));
        }
        return builder.get();
    }

	// convert DBObject Object to User
    // take special note of converting ObjectId to String
    
    public static User toUser(DBObject doc) {
        User u = new User();
        u.setFirstname((String) doc.get("firstname"));
        u.setLastname((String) doc.get("lastname"));
        u.setEmail((String) doc.get("Email"));
        u.setUsername((String) doc.get("Username"));
        u.setLocation((String) doc.get("location"));
        u.setPassword1((String) doc.get("password1"));
        ObjectId id = (ObjectId) doc.get("_id");
        u.setID(id.toString());
        return u;

    }

}
