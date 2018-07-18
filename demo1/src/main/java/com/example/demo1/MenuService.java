package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;

    public List<Menu> getAllMenu() {
        List<Menu> list = new ArrayList<>();
        menuRepository.findAll().forEach(new Consumer<Menu>() {
            @Override
            public void accept(Menu menu) {
                list.add(menu);}
        });
        return list;
    }
    public void createMenu(Menu menu) {menuRepository.save(menu);
    }

    public void addMenu(Menu menu){
//        menu.save(menu);

        menuRepository.save(menu);
    }
}
