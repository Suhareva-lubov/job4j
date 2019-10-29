package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    String level;
    int practice;

    public Code writeCode() {
        return code;
    }

    public boolean testingCode(Code code) {
        return testingCode;
    }

    public int salary(Programmer programmer) {
        return salary;
    }
}
