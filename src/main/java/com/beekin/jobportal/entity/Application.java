//package com.beekin.jobportal.entity;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name ="job_application")
//public class Application {
//    @Id
//    @GeneratedValue()
//    public Long id;
//
//    @ManyToMany
//    @JoinTable(
//            name = "application_users",
//            joinColumns = @JoinColumn(name = "application_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id")
//    )
//    private Set<User> applicants = new HashSet<>();
//
//    @ManyToOne
//    @JoinColumn(name = "job_id")
//    private Job job;
//
//
//    @Override
//    public String toString() {
//        return "Application{" +
//                "id=" + id +
//                ", applicants=" + applicants +
//                ", job=" + job +
//                '}';
//    }
//}
