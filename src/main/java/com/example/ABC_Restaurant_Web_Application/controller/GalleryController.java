package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Gallery;
import com.example.ABC_Restaurant_Web_Application.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GalleryController {
    @Autowired
    GalleryService galleryService;

    @PostMapping("/addGallery")
    public Gallery addGallery(@RequestBody Gallery gallery)
    {
        return galleryService.addGallery(gallery);
    }

    @GetMapping("/getGallery/{id}")
    public Gallery getGallery(@PathVariable Long id)
    {
        return galleryService.getGallery(id);
    }

    @GetMapping("/getAllGalleries")
    public List<Gallery> getAllGalleries() {
        return galleryService.getAllGalleries();
    }

    @DeleteMapping("/deleteGallery/{id}")
    public String deleteGallery(@PathVariable Long id) {
        return galleryService.deleteGallery(id);
    }

    @PutMapping("/updateGallery/{id}")
    public Gallery updateGallery(@PathVariable Long id, @RequestBody Gallery gallery) {
        return galleryService.updateGallery(id, gallery);
    }
}
