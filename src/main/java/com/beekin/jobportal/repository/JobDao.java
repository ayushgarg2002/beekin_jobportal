package com.beekin.jobportal.repository;


import com.beekin.jobportal.entity.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobDao  extends CrudRepository<Job, Long> {
}
