package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.model.MenuItem;
import com.example.ABC_Restaurant_Web_Application.repository.FeedbackRepository;
import com.example.ABC_Restaurant_Web_Application.repository.MenuItemRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class MenuItemService {
    @Autowired
    MenuItemRepository menuItemRepository;

    public MenuItem addMenuItem(MenuItem menuItem)
    {
        return menuItemRepository.save(menuItem);
    }

    public MenuItem getMenuItem(Long id)
    {
        return menuItemRepository.findById(id).orElse(null);
    }

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public String deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
        return "MenuItem Deleted Successfully!";
    }

    public MenuItem updateMenuItem(Long id, MenuItem menuItem)
    {
        menuItem.setId(id);
        return menuItemRepository.save(menuItem);
    }
}
