package com.test.demo.service;

import com.test.demo.entity.JobPostingEntity;
import com.test.demo.repository.JobPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingImpl implements JobPostingInterface {

    @Autowired
    JobPostingRepository jobPostingRepository;
    @Override
    public Integer postJobs(String employerNm,String jobName, String close_datetime,String userName) {

        JobPostingEntity jobPostingEntity=new JobPostingEntity();
        jobPostingEntity.setCrtdBy("System");
        jobPostingEntity.setEmployerNm(employerNm);
        jobPostingEntity.setJobDesc("Description");
        jobPostingEntity.setUserName(userName);

        jobPostingRepository.save(jobPostingEntity);
        return jobPostingEntity.getJobId();
    }

    @Override
    public List<JobPostingEntity> getPostedJobs(String jobName) {
        return null;
    }

    @Override
    public JobPostingEntity getPostedJobs(Integer jobId) {
        return null;
    }


}
