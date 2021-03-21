package com.test.demo;

import com.test.demo.entity.JobPostingEntity;
import com.test.demo.repository.JobPostingRepository;
import com.test.demo.service.JobBidImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import java.math.BigDecimal;

@ExtendWith(SpringExtension.class)
public class JobBidImplTest {

    @Mock
    JobPostingRepository jobPostingRepository;


   private  JobPostingEntity jobPostingEntity;


    @InjectMocks
    JobBidImpl jobBid;




    @Test
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
