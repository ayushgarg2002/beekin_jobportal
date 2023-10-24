package com.beekin.jobportal.service;

import com.beekin.jobportal.entity.Job;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface JobServiceD {
    List<Job> getAllJobs();

    Job getJobById(Long jobId);

    Job createJob(Job job);

    Job updateJob(Long jobId, Job job);

    void deleteJob(Long jobId);
}
