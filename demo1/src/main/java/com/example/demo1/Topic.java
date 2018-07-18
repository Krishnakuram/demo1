package com.example.demo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topics")
public class Topic {
    @Id
    private int id;
    @Column(name = "topicname")
    private String topicName;
    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

  public Topic(){

   }

    public Topic(int id, String topicName, String description) {
        this.id = id;
        this.topicName = topicName;
        this.description = description;
    }

}
