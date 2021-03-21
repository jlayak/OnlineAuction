package com.test.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="job_bid")
public class JobBidEntity {

    @Id
    @GeneratedValue
    @Column(name="bidId")
    private Integer bidId;

    @Column(name="jobId")
    private Integer jobId ;

    @Column(name="bidderNm")
    private String bidderNm ;

    @Column(name="bidVal")
    private BigDecimal bidVal ;

    @Column(name="bidDatetime")
    private Date bidDatetime ;

    public String getBidderNm() {
        return bidderNm;
    }

    public void setBidderNm(String bidderNm) {
        this.bidderNm = bidderNm;
    }

    public BigDecimal getBidVal() {
        return bidVal;
    }

    public void setBidVal(BigDecimal bidVal) {
        this.bidVal = bidVal;
    }

    public Date getBidDatetime() {
        return bidDatetime;
    }

    public void setBidDatetime(Date bidDatetime) {
        this.bidDatetime = bidDatetime;
    }



    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }



}
