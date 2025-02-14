package com.generics.resumescreeningsystem;

public class ResumeScreeningApp {
    public static void main(String[] args) {
        // Job roles
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        // Sample resumes
        Resume<SoftwareEngineer> resume1 = new Resume<>("Alice Johnson", softwareEngineer);
        Resume<DataScientist> resume2 = new Resume<>("Bob Smith", dataScientist);
        Resume<ProductManager> resume3 = new Resume<>("Charlie Brown", productManager);
        Resume<SoftwareEngineer> resume4 = new Resume<>("David Lee", softwareEngineer);

        // Resume Screening System
        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(resume1);
        screeningSystem.addResume(resume2);
        screeningSystem.addResume(resume3);
        screeningSystem.addResume(resume4);

        // Process resumes
        screeningSystem.processResumes();
    }
}
