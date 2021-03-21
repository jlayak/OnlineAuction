package com.test.demo.data;

import java.math.BigDecimal;

public class JobBidVO {

    Integer jobId;
    BigDecimal bidValue;
    String bidderNm;

    String status;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public BigDecimal getBidValue() {
        return bidValue;
    }

    public void setBidValue(BigDecimal bidValue) {
        this.bidValue = bidValue;
    }

    public String getBidderNm() {
        return bidderNm;
    }

    public void setBidderNm(String bidderNm) {
        this.bidderNm = bidderNm;
    }



}
