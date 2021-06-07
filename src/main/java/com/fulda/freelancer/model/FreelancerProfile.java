package com.fulda.freelancer.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FreelancerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String phoneNumber;
    private String emailId;
    private String imageLink;

    @OneToMany(targetEntity=Skills.class)
    private Set<Skills> skills;

    public FreelancerProfile(String name, String phoneNumber, String emailId, Set<Skills> skills,String imageLink) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.skills = skills;
        this.imageLink= imageLink;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skills> skills) {
        this.skills = skills;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
    @Override
    public String toString() {
        return "FreelancerProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", skills=" + skills +
                '}';
    }
}
