package com.test.demo.service;

import com.test.demo.entity.JobBidEntity;

import java.math.BigDecimal;
import java.util.List;

public interface JobBidInterface {

  Integer postJobBid(Integer jobId, BigDecimal bidValue,String bidderNm);
  List<JobBidEntity> getJobBids(String bidder_nm);
}
