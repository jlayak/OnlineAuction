package com.test.demo.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="job_posting")
public class JobPostingEntity {

    @Id
    @GeneratedValue
    @Column(name="jobId")
    private Integer jobId ;

    @Column(name="userName")
    private String userName;

    @Column(name="jobDesc")
    private String jobDesc;

    @Column(name="employerNm")
    private String employerNm ;

    @Column(name="postingCloseDatetime")
    private Date postingCloseDatetime ;

    @Column(name="crtdTime")
    private Date crtdTime;

    @Column(name="bidId")
    private Integer bidId;

    @Column(name="crtdBy")
    private String crtdBy ;

    public Date getCrtdTime() {
        return crtdTime;
    }

    public void setCrtdTime(Date crtdTime) {
        this.crtdTime = crtdTime;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }



    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getEmployerNm() {
        return employerNm;
    }

    public void setEmployerNm(String employerNm) {
        this.employerNm = employerNm;
    }

    public Date getPostingCloseDatetime() {
        return postingCloseDatetime;
    }

    public void setPostingCloseDatetime(Date postingCloseDatetime) {
        this.postingCloseDatetime = postingCloseDatetime;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
