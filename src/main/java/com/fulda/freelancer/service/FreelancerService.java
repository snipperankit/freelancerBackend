package com.fulda.freelancer.service;

import com.fulda.freelancer.interfaces.FreelanceProfileRepo;
import com.fulda.freelancer.model.FreelancerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FreelancerService {

    @Autowired
    FreelanceProfileRepo repo;

    public List<FreelancerProfile> getProfiles() {
        return repo.findAll();
    }

    public Optional<FreelancerProfile> getProfile(Long id) {
        return repo.findById(id);
    }

    public FreelancerProfile createProfile(FreelancerProfile freelancerProfile) {
        return repo.save(freelancerProfile);
    }

    public FreelancerProfile updateProfile(FreelancerProfile freelancerProfile) {
        return repo.save(freelancerProfile);
    }

    public void deleteProfile(Long id) {
         repo.deleteById(id);
    }
}
