package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public class TopicService {
    @Autowired
     TopicRepository topicRepository;
//
//
// List<Topic> topics= Arrays.asList(new Topic(101,"java","core java"),
//                new Topic (102,"java 2","advanced java"));
//
//    public List<Topic>getAllTopics(){
//        return topics;
//    }


    public List<Topic> getAllTopics() {
        List<Topic> list = new ArrayList<>();
        topicRepository.findAll().forEach(new Consumer<Topic>() {
            @Override
            public void accept(Topic topic) {
                list.add(topic);
            }
        });
        return list;
    }

   /* public Topic getTopic(int id) {
        Optional<Topic> optionalTopic = topicRepository.findById(id);
        if (optionalTopic.isPresent()) {
            return optionalTopic.get();
        }

        return null;
    }*/

    public void createTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void addTopic(Topic topic){
        //topics.add(topic);

        topicRepository.save(topic);
    }
}
