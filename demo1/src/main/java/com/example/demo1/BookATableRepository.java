package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookATableRepository extends JpaRepository<BookATable,Integer> {


}