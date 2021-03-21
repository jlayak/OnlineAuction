package com.test.demo;

import com.test.demo.data.JobPostVO;
import com.test.demo.entity.JobPostingEntity;
import com.test.demo.repository.JobPostingRepository;
import com.test.demo.service.JobPostingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class JobPostController {

    @Autowired
    JobPostingInterface jobPostingInterface;

    @Autowired
    JobPostingRepository jobPostingRepository;

    @PostMapping("/demo/postJobs")
    public Integer postjobs(@Validated @RequestBody JobPostVO jobPostVO)
    {

       Integer postId= jobPostingInterface.postJobs(jobPostVO.getEmployerNm(),jobPostVO.getJobNm(),jobPostVO.getPostingEndTime(),jobPostVO.getUserName());

        return postId;
    }


    @GetMapping("/demo/getJobs")
    public List<JobPostingEntity> getjobs()
    {
        return (List<JobPostingEntity>) jobPostingRepository.findAll();
    }


}
