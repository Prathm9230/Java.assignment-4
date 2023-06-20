package com.bridgelabz.employeewage;

import java.sql.SQLOutput;

public class Employeewage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int emphrs=0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME) {
           emphrs=8;
          }
        else
        {
            emphrs=0;
        }
        int empwage = EMP_RATE_PER_HOUR * emphrs;
        System.out.println("Employee daily wage is:"+ empwage);
    }
}
