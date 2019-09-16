package ru.job4j.condition;

public class TruckerJob {

    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Stave need to get a license");
            steve.passExamOn('C');
        }

        if (steve.canDrive('C')) {
            System.out.println("Steva works on truckers!");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve works oin taxi.");
        } else {
            System.out.println("Steve does not have a job, but ride on motobike!");
        }
    }
}
