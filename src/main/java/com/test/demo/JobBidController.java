package com.test.demo;

import com.test.demo.data.JobBidVO;
import com.test.demo.service.JobBidInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobBidController {

    @Autowired
    JobBidInterface jobBidInterface;

    @PostMapping("/demo/v1/bidJobs")
    public Integer postjobs(@Validated @RequestBody JobBidVO jobBidVO)
    {

        Integer bidId= jobBidInterface.postJobBid(jobBidVO.getJobId(),jobBidVO.getBidValue(),"xyz");
        return bidId;
    }

  /*  @PostMapping("/demo/v2/bidJobs")
    public Integer postjobs(@Validated JobBidVO jobBidVO)
    {

        Integer bidId= jobBidInterface.postJobBid(jobBidVO.getJobId(),jobBidVO.getBidValue(),"xyz");
        return bidId;
    }*/
}
