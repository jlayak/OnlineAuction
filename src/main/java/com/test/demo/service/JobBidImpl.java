package com.test.demo.service;

import com.test.demo.entity.JobBidEntity;
import com.test.demo.entity.JobPostingEntity;
import com.test.demo.repository.JobBidRepository;
import com.test.demo.repository.JobPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class JobBidImpl implements JobBidInterface {

    @Autowired
    JobBidRepository jobBidRepository;

    @Autowired
    JobPostingRepository jobPostingRepository;

    @Override
    public Integer postJobBid(Integer jobId, BigDecimal bidValue,String bidderName) throws IllegalArgumentException{
        JobBidEntity jobBidEntity=new JobBidEntity();
        jobBidEntity.setBidDatetime(new Date());
        jobBidEntity.setJobId(jobId);
            JobPostingEntity jobPostingEntity=jobPostingRepository.findByJobId(jobId);
        if(jobPostingEntity.getUserName().equals(bidderName))
            throw new IllegalArgumentException();
        jobBidRepository.save(jobBidEntity);
        return jobBidEntity.getBidId();

    }

    @Override
    public List<JobBidEntity> getJobBids(String bidder_nm) {
        return null;
    }
}
