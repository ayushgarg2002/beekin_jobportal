package com.beekin.jobportal.service;

import com.beekin.jobportal.entity.Job;
import com.beekin.jobportal.repository.JobDao;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class JobServiceDImplementation implements JobServiceD{
    private JobDao jobDao; // Inject the JobRepository

    public List<Job> getAllJobs() {
        return (List<Job>) jobDao.findAll();
    }

    public Job getJobById(Long jobId) {
        return jobDao.findById(jobId).orElse(null);
    }

    public Job createJob(Job job) {
        System.out.println("create job hit///////////////////////////");
        return jobDao.save(job);
    }

    public Job updateJob(Long jobId, Job job) {
        if (jobDao.existsById(jobId)) {
            job.setId(jobId);
            return jobDao.save(job);
        }
        return null; // Job not found
    }

    public void deleteJob(Long jobId) {
        jobDao.deleteById(jobId);
    }
}
