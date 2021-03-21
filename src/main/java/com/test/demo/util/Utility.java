package com.test.demo.util;

import com.test.demo.entity.JobBidEntity;
import com.test.demo.entity.JobPostingEntity;
import com.test.demo.repository.JobBidRepository;
import com.test.demo.repository.JobPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class Utility {

    @Autowired
    JobPostingRepository jobPostingRepository;

    @Autowired
    JobBidRepository jobBidRepository;

    @Autowired
    ConfigBeans cb;

    @Scheduled()
    public void matchJobsToBid()
    {
        List<JobPostingEntity> postedjobsToExpire=jobPostingRepository.getjobsToExpire(new Date());

        for(JobPostingEntity jobPostingEntity: postedjobsToExpire)
        {
            List<JobBidEntity> jobList=jobBidRepository.getJobsApplied(jobPostingEntity.getJobId());


            JobBidEntity selectedBid=jobList.get(0);

            jobPostingEntity.setBidId(selectedBid.getBidId());
            jobPostingRepository.save(jobPostingEntity);
            //email notification triggered to respective employer and bidder.

        }

    }

    @Scheduled()
    public List<JobPostingEntity> getRecentJobs()
    {
        List<JobPostingEntity> postedjobsToExpire=jobPostingRepository.getMostRecentJobs();

        cb.getJobPostings();
       return postedjobsToExpire;

    }


}
