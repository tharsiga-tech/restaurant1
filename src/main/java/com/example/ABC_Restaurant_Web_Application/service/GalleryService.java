package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.model.Gallery;
import com.example.ABC_Restaurant_Web_Application.repository.FeedbackRepository;
import com.example.ABC_Restaurant_Web_Application.repository.GalleryRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class GalleryService {
    @Autowired
    GalleryRepository galleryRepository;

    public Gallery addGallery(Gallery gallery)
    {
        return galleryRepository.save(gallery);
    }

    public Gallery getGallery(Long id)
    {
        return galleryRepository.findById(id).orElse(null);
    }

    public List<Gallery> getAllGalleries() {
        return galleryRepository.findAll();
    }

    public String deleteGallery(Long id) {
        galleryRepository.deleteById(id);
        return "Gallery Deleted Successfully!";
    }

    public Gallery updateGallery(Long id, Gallery gallery)
    {
        gallery.setId(id);
        return galleryRepository.save(gallery);
    }
}
