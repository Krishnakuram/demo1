package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MenuController {

    @Autowired
    MenuService menuService;


    @RequestMapping(value = "/Menu", method = RequestMethod.GET)
    public List<Menu> getAllMenu() {
        return menuService.getAllMenu();
    }
    @RequestMapping(value = "/Menu", method = RequestMethod.POST)
    public void addMenu(@RequestBody Menu menu) {
        System.out.println("inside add method");
        menuService.addMenu(menu);
    }

}
