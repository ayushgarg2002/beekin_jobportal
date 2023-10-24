package com.beekin.jobportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job {
    @Id
    @GeneratedValue()
    public Long id;
    public String title;
    public String description;
    public String company;
    public String location;
    public Long noOfApplicants;
    public JobType jobType;
    public JobMode jobMode;
    public String qualifications;
    public String skills;
    @ManyToMany(mappedBy = "appliedJobs")
    private Set<User> applicants = new HashSet<>();


    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", noOfApplicants=" + noOfApplicants +
                ", jobType=" + jobType +
                ", jobMode=" + jobMode +
                ", qualifications='" + qualifications + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}
