package com.test.demo.repository;

import com.test.demo.entity.JobBidEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobBidRepository  extends JpaRepository<JobBidEntity, Integer> {

@Query("select je from JobBidEntity je where je.jobId=:jobId order by je.bidVal")
List<JobBidEntity> getJobsApplied(@Param("jobId") Integer jobId);

}
