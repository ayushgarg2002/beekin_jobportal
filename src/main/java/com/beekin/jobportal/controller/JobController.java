package com.beekin.jobportal.controller;

import com.beekin.jobportal.entity.Job;
import com.beekin.jobportal.service.JobServiceD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobServiceD jobService; // Create and inject a JobService


    @GetMapping("/")
    public RedirectView redirectToJobs() {
        System.out.println("controll/////////////////");
        return new RedirectView("/listJobs");
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{jobId}")
    public Job getJobById(@PathVariable Long jobId) {
        return jobService.getJobById(jobId);
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.createJob(job);
    }

    @PutMapping("/{jobId}")
    public Job updateJob(@PathVariable Long jobId, @RequestBody Job job) {
        return jobService.updateJob(jobId, job);
    }

    @DeleteMapping("/{jobId}")
    public void deleteJob(@PathVariable Long jobId) {
        jobService.deleteJob(jobId);
    }
}
