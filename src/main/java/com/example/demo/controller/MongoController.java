package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.model.config.MongoDBConfig;

import java.util.List;

@Controller
public class MongoController {

    @Autowired
    MongoDBConfig db = new MongoDBConfig();

    @RequestMapping("/hello")
    @ResponseBody
    public List<User> helloGFG()
    {
        Query query = new Query(Criteria.where("firstname").is("Firstname"));
        return db.mongoTemplate().find(query,User.class);
    }
}