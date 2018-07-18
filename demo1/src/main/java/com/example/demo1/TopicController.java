package com.example.demo1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController{
    @Autowired
     TopicService topicService;

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

//                Arrays.asList(new Topic(101,"java","core java"),
//                new Topic (102,"java 2","advanced java"));

//
//    @RequestMapping(value="/topics/{id}", method= RequestMethod.GET)
//    public Topic getTopic(@PathVariable String id){
//        return topicService.getTopic(id);
//    }


    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void createTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
}

