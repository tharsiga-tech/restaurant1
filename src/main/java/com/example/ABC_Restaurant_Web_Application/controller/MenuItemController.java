package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.MenuItem;
import com.example.ABC_Restaurant_Web_Application.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MenuItemController {
    @Autowired
    MenuItemService menuItemService;

    @PostMapping("/addMenuItem")
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem)
    {
        return menuItemService.addMenuItem(menuItem);
    }

    @GetMapping("/getMenuItem/{id}")
    public MenuItem getMenuItem(@PathVariable Long id)
    {
        return menuItemService.getMenuItem(id);
    }

    @GetMapping("/getAllMenuItems")
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.getAllMenuItems();
    }

    @DeleteMapping("/deleteMenuItem/{id}")
    public String deleteMenuItem(@PathVariable Long id) {
        return menuItemService.deleteMenuItem(id);
    }

    @PutMapping("/updateMenuItem/{id}")
    public MenuItem updateMenuItem(@PathVariable Long id, @RequestBody MenuItem menuItem) {
        return menuItemService.updateMenuItem(id, menuItem);
    }
}
