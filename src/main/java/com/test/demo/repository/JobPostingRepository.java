package com.test.demo.repository;

import com.test.demo.entity.JobPostingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface JobPostingRepository  extends JpaRepository<JobPostingEntity, Integer> {


    @Query("select jp from JobPostingEntity jp where jp.postingCloseDatetime <:currDate")
    public List<JobPostingEntity> getjobsToExpire(@Param("currDate") Date date);

    @Query("select jp from JobPostingEntity jp where jp.postingCloseDatetime >:currDate order by jp.crtdTime desc ")
    public List<JobPostingEntity> getMostRecentJobs();

    @Query("select jp from JobPostingEntity jp where jp.jobId=:jobId")
    public JobPostingEntity findByJobId(@Param("jobId") Integer jobId);


}
