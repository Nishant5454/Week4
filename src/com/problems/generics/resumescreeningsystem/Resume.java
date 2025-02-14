package com.generics.resumescreeningsystem;

// class for making resume of each candidate from job role
public class Resume<T extends JobRole>{
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void displayResume() {
        System.out.println("Candidate: " + candidateName + " | Applying for: " + jobRole.getTitle());
    }
}
