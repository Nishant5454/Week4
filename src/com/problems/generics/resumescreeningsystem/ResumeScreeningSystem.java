package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// method for storing candidates in list
public class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumePipeline = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumePipeline.add(resume);
    }

    public void processResumes() {
        for (Resume<? extends JobRole> resume : resumePipeline) {
            resume.displayResume();
        }
    }
}
