package com.bridgelabz.employeewage;

import java.sql.SQLOutput;
//UC-7:using OOPS concept
public class Employeewage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int  EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public int emphrs=0;

    public void EmployeeUpdate()
    {
        System.out.println("This is UC1:");
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME) {
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Absent.");
        }
    }
    public void ComputedailyEmpWage()
    {
        System.out.println("This is UC2:");
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
    public void AddPartTimeEmp()
    {
        System.out.println("This is UC3:");
        int emphrs=0;
        double empcheck = Math.floor(Math.random() * 10) % 3;//here we have added part time so,taken 3.
        if (empcheck == IS_FULL_TIME) {
            emphrs=12;
        }
        else if(empcheck==IS_PART_TIME)
        {
            emphrs=8;
        }
        else
        {
            emphrs=0;
        }
        int empwage = EMP_RATE_PER_HOUR * emphrs;
        System.out.println("Employee daily wage is:"+ empwage);
    }
    public void SoLveUsingSwitchCase()
    {
        System.out.println("This is UC4:");
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
public void ComputeMonthWage()
{
    System.out.println("This is UC5:");
    int emphrs = 0, Totalempwage = 0;
    for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
        int empcheck = (int)Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case IS_FULL_TIME:
                emphrs = 12;
                break;
            case IS_PART_TIME:
                emphrs = 8;
                break;
            default:
                emphrs = 0;
        }
        int empwage = EMP_RATE_PER_HOUR * emphrs;
        Totalempwage = Totalempwage + empwage;
        System.out.println("Employee daily wage is:" + empwage);
    }
    System.out.println("Totalempwage is:" + Totalempwage);
}
public void Condition()
{
    System.out.println("This is UC6:");
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
    public static void main(String[] args) {
        Employeewage e = new Employeewage();
        e.EmployeeUpdate();
        System.out.println("\n");
        e.ComputedailyEmpWage();
        System.out.println("\n");
        e.AddPartTimeEmp();
        System.out.println("\n");
        e.SoLveUsingSwitchCase();
        System.out.println("\n");
        e.ComputeMonthWage();
        System.out.println("\n");
        e.Condition();
    }
}
