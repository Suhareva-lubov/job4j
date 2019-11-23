package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman olga = new Freshman();
        Student student1 = olga; //понижающее приведение к классу Student
        Object obj = olga; //это понижающее приведение down casting к классу Object
    }
}
