package com.test.demo.service;

import com.test.demo.entity.JobPostingEntity;

import java.util.Date;
import java.util.List;

public interface JobPostingInterface {
    Integer postJobs(String employerNm,String jobName, String close_datetime,String userName);
    List<JobPostingEntity> getPostedJobs(String jobName);
    JobPostingEntity getPostedJobs(Integer jobId);

}
