package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.model.Offer;
import com.example.ABC_Restaurant_Web_Application.repository.FeedbackRepository;
import com.example.ABC_Restaurant_Web_Application.repository.OfferRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class OfferService {
    @Autowired
    OfferRepository offerRepository;

    public Offer addOffer(Offer offer)
    {
        return offerRepository.save(offer);
    }

    public Offer getOffer(Long id)
    {
        return offerRepository.findById(id).orElse(null);
    }

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    public String deleteOffer(Long id) {
        offerRepository.deleteById(id);
        return "Offer Deleted Successfully!";
    }

    public Offer updateOffer(Long id, Offer offer)
    {
        offer.setId(id);
        return offerRepository.save(offer);
    }
}
