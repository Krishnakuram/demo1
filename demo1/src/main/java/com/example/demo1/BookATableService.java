package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class BookATableService {

    @Autowired
    BookATableRepository bookATableRepository;

    public List<BookATable> getAllBookATable() {
        List<BookATable> list = new ArrayList<>();
        bookATableRepository.findAll().forEach(new Consumer<BookATable>() {
            @Override
            public void accept(BookATable bookATable) {
                list.add(bookATable);}
        });
        return list;
    }
    public BookATable createBookATable(BookATable bookATable) {
        return bookATableRepository.save(bookATable);
    }

    public void addBookATable(BookATable bookATable){

        bookATableRepository.save(bookATable);
    }
}
