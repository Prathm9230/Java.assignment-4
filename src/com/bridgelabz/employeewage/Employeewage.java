package com.bridgelabz.employeewage;

public class Employeewage {
    public static final int IS_FULL_TIME = 2;
    public static final  int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {
        int emphrs=0;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;//here we have added part time so,taken 3.
        switch (empcheck)
        {
             case IS_FULL_TIME:
                emphrs=12;
                break;
            case IS_PART_TIME:
                emphrs=8;
                break;
            default:
                emphrs=0;
        }
        int empwage = EMP_RATE_PER_HOUR * emphrs;
        System.out.println("Employee daily wage is:"+ empwage);
    }
}
