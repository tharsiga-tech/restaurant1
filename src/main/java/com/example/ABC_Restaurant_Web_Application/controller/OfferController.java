package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Offer;
import com.example.ABC_Restaurant_Web_Application.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class OfferController {
    @Autowired
    OfferService offerService;

    @PostMapping("/addOffer")
    public Offer addOffer(@RequestBody Offer offer)
    {
        return offerService.addOffer(offer);
    }

    @GetMapping("/getOffer/{id}")
    public Offer getOffer(@PathVariable Long id)
    {
        return offerService.getOffer(id);
    }

    @GetMapping("/getAllOffers")
    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    @DeleteMapping("/deleteOffer/{id}")
    public String deleteOffer(@PathVariable Long id) {
        return offerService.deleteOffer(id);
    }

    @PutMapping("/updateOffer/{id}")
    public Offer updateOffer(@PathVariable Long id, @RequestBody Offer offer) {
        return offerService.updateOffer(id, offer);
    }
}
