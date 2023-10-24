package com.beekin.jobportal;

import com.beekin.jobportal.entity.Job;
import com.beekin.jobportal.entity.JobMode;
import com.beekin.jobportal.entity.JobType;
import com.beekin.jobportal.entity.User;
import com.beekin.jobportal.repository.JobDao;
import com.beekin.jobportal.repository.UserDao;
import com.beekin.jobportal.service.JobServiceD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class SpringBootCrudExample2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootCrudExample2Application.class, args);
//		Job job = new Job();
//		job.setId(11L);
//		job.setTitle("Software Development Engineer 1");
//		job.setDescription("should be a good developer");
//		job.setCompany("Microsoft");
//		job.setLocation("Noida");
//		job.setNoOfApplicants(1L);
//		job.setJobType(JobType.FullTime);
//		job.setJobMode(JobMode.Remote);
//		job.setQualifications("2+ yoe");
//		job.setSkills("DSA");
        JobDao jobServiceD = context.getBean(JobDao.class);
//		jobServiceD.save(job);
//		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");

//		User user1 = new User();
//		user1.setId(1L);
//		user1.setEmail("ayush@gmail.com");
//		user1.setPassword("1234");
//		User user2 = new User();
//		user2.setId(2L);
//		user2.setEmail("rajat@gmail.com");
//		user2.setPassword("321");
        UserDao userDao = context.getBean(UserDao.class);
//		userDao.save(user1);
//		userDao.save(user2);

//		Optional<Job> jobObject = jobServiceD.findById(11L);
//		Job job = jobObject.get();
//		job.setApplicants(new HashSet<>());
//		jobServiceD.save(job);

//        Optional<Job> jobObj = jobServiceD.findById(1L);
//        Job job = jobObj.get();
//        Optional<User> userObj = userDao.findById(2L);
//        User user = userObj.get();
//
//        job.getApplicants().add(user);
//        jobServiceD.save(job);
//        Optional<User> userObj2 = userDao.findById(1L);
//        User user2 = userObj2.get();
//        job.getApplicants().add(user2);
//        jobServiceD.save(job);
//
//        user.getAppliedJobs().add(job);
//        userDao.save(user);
//
//        Iterable<Job> job1 = jobServiceD.findAll();
//        System.out.println("job1 title is/////////////////////////////////////////////////// " + job1);
//        job1.forEach(x -> System.out.println(x.getCompany()));
//
//
//        Optional<Job> jobOb = jobServiceD.findById(1L);
//        if(jobOb.isPresent()){
//            Job jobx = jobOb.get();
//            Set<User> userLiST=jobx.getApplicants();
//
//            if (userLiST != null) {
//                System.out.println("Number of Applicants: " + userLiST.size());
//            } else {
//                System.out.println("No applicants for this job.");
//            }
//        } else {
//            System.out.println("not present");
//        }
//		userLiST.forEach(x-> System.out.println(x.username));
    }

}
