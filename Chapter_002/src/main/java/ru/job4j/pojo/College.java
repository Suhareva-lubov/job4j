package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Сухарева Любовь");
        student.setGroup(8);
        student.setDateOfReceipt(new Date(119, 7, 20));

        System.out.println("Студент " + student.getName() + " Группа " + student.getGroup() + " Дата поступления " + student.getDateOfReceipt());
    }
}
