package com.bridgelabz.employeewage;

import java.sql.SQLOutput;

public class Employeewage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;


    public static void main(String[] args) {

        int emphrs = 0, Totalemphrs = 0, totalworkingdays = 0;
        while (Totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
            totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case IS_FULL_TIME:
                    emphrs = 16;
                    break;
                case IS_PART_TIME:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
            }
            Totalemphrs += emphrs;
            System.out.println("Days:" + totalworkingdays +" "+ "Emp Hr:" + emphrs);
        }
        int Totalempwage = Totalemphrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Empwage:" + Totalempwage);
    }
}