package com.test.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobPostVO {

    @JsonProperty("employerNm")
    String employerNm;


    String jobNm;
    String userName;
    String postingEndTime;

    public String getPostingEndTime() {
        return postingEndTime;
    }

    public void setPostingEndTime(String postingEndTime) {
        this.postingEndTime = postingEndTime;
    }



    public String getEmployerNm() {
        return employerNm;
    }

    public void setEmployerNm(String employerNm) {
        this.employerNm = employerNm;
    }

    public String getJobNm() {
        return jobNm;
    }

    public void setJobNm(String jobNm) {
        this.jobNm = jobNm;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
