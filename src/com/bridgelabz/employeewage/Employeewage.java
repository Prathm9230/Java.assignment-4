package com.bridgelabz.employeewage;

import java.sql.SQLOutput;

public class Employeewage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int emphrs = 0, Totalempwage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            double empcheck = Math.floor(Math.random() * 10) % 3;//here we have added part time so,taken 3.
            if (empcheck == IS_FULL_TIME) {
                emphrs = 16;
            } else if (empcheck == IS_PART_TIME) {
                emphrs = 8;
            } else {
                emphrs = 0;
            }
            int empwage = EMP_RATE_PER_HOUR * emphrs;
            Totalempwage = Totalempwage + empwage;
            System.out.println("Employee daily wage is:" + empwage);
        }
        System.out.println("Totalempwage is:" + Totalempwage);
    }
}
