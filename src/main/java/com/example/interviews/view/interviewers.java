package com.example.interviews.view;

public class interviewers {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String jobTitle;

    public interviewers(){
    }
    public interviewers(int id, String name, String phone, String email, String jobTitle) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
