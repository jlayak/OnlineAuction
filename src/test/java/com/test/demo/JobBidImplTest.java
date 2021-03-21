package com.test.demo;

import com.test.demo.entity.JobBidEntity;
import com.test.demo.entity.JobPostingEntity;
import com.test.demo.repository.JobBidRepository;
import com.test.demo.repository.JobPostingRepository;
import com.test.demo.service.JobBidImpl;
import com.test.demo.service.JobPostingImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.math.BigDecimal;


public class JobBidImplTest {

    @Mock
    JobPostingRepository jobPostingRepository;


    JobPostingEntity jobPostingEntity;

    @Mock
    @InjectMocks
    JobBidImpl jobBid;




    @Test()
    public void test_Bidder_poster_same()
    {

        //Given
        jobPostingEntity=new JobPostingEntity();
        jobPostingEntity.setUserName("xyz");
        jobPostingEntity.setBidId(1);
        boolean expected=false;


        //When
        Mockito.when(jobPostingRepository.findByJobId(1)).thenReturn(jobPostingEntity);
        try {
            jobBid.postJobBid(1, new BigDecimal(10.00), "xyz");
        }
        catch(IllegalArgumentException iae)
        {
            expected=true;
            System.out.println("Error");
        }

        //Then
        Assert.isTrue(expected);
    }


}
