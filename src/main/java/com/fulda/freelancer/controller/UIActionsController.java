package com.fulda.freelancer.controller;

import com.fulda.freelancer.model.FreelancerProfile;
import com.fulda.freelancer.service.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class UIActionsController {

    @Autowired
    private FreelancerService service;

    @GetMapping("/profiles")
    public ResponseEntity<List<FreelancerProfile>> getProfiles(){
        List<FreelancerProfile> profiles = service.getProfiles();
        return new ResponseEntity<List<FreelancerProfile>>(profiles, HttpStatus.OK);
    }

    @GetMapping("/profiles/{id}")
    public ResponseEntity<FreelancerProfile> getBook(@PathVariable("id") Long id){
        Optional<FreelancerProfile> profile = service.getProfile(id);
        return new ResponseEntity<FreelancerProfile>(profile.get(), HttpStatus.OK);
    }

    @PostMapping("/profiles")
    public ResponseEntity<FreelancerProfile> createBook(@RequestBody FreelancerProfile freelancerProfile){
        FreelancerProfile profile = service.createProfile(freelancerProfile);
        return new ResponseEntity<FreelancerProfile>(profile, HttpStatus.OK);

    }

    @PutMapping("/profiles/{id}")
    public ResponseEntity<FreelancerProfile> updateBook(@RequestBody FreelancerProfile freelancerProfile)
    {
        FreelancerProfile profile = service.updateProfile(freelancerProfile);
        return new ResponseEntity<FreelancerProfile>(profile, HttpStatus.OK);
    }

    @DeleteMapping("/profiles/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id){
            String responseContent = "Profile removed successfully";
            return new ResponseEntity<String>(responseContent,HttpStatus.OK);
    }
}
