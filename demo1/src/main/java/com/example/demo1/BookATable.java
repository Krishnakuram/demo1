package com.example.demo1;

import javax.persistence.*;

@Entity

@Table(name="bookatable")
public class BookATable {

        @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;
   @Column(name = "numberofpeople")
        private int numberofPeople;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNumberofPeople() {
            return numberofPeople;
        }

        public void setNumberofPeople(int numberofPeople) {
            this.numberofPeople = numberofPeople;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
