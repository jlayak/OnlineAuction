package com.test.demo.util;

import com.test.demo.entity.JobPostingEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigBeans {

    @Bean
    public List<JobPostingEntity> getJobPostings()
    {
        List<JobPostingEntity> postedJobs=new ArrayList<>();
        return postedJobs;
    }

    List<JobPostingEntity> cacheJobs;
}
