package com.fulda.freelancer.interfaces;

import com.fulda.freelancer.model.FreelancerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelanceProfileRepo extends JpaRepository<FreelancerProfile,Long> {
}
