package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BookATableController {

@Autowired
    BookATableService bookATableService;


    @RequestMapping(value = "/booktable", method = RequestMethod.GET)
    public List<BookATable> getAllBookATable() {
        return bookATableService.getAllBookATable();
    }
    @RequestMapping(value = "/booktable", method = RequestMethod.POST)
    public void addBookATable(@RequestBody BookATable bookATable) {

         bookATableService.createBookATable(bookATable);
    }

}
