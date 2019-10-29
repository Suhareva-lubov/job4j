package ru.job4j.oop.profession;

public class Doctor extends Profession {
    int qualification;

    public Analyses osmotr (Complaint complaint) {

        return analyses;
    }

    public Diagnosis diagnosis (Complaint complaint, Analyses analyses) {

        return diagnos;
    }

    public String cure(Diagnosis diagnos) {

        return cure;
    }

    public int salary(Doctor doctor) {
        return salary;
    }
}
