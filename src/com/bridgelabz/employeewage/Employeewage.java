package com.bridgelabz.employeewage;


//UC-8:using OOPS concept
public class Employeewage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR=20;

    public static int totalEmpWage(int Maxhrs,int Numofworkingdays)
        {
            System.out.println("This is UC8:");
            int emphrs = 0, Totalemphrs = 0, totalworkingdays = 0;
            while (Totalemphrs <= Maxhrs && totalworkingdays < Numofworkingdays) {
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
                System.out.println("Days:" + totalworkingdays + " " + "Emp Hr:" + emphrs);
            }
            int Totalempwage = Totalemphrs *EMP_RATE_PER_HOUR;
           return Totalempwage;
        }


    public static void main(String[] args) {
        Employeewage e1 = new Employeewage();
        int comp1 = e1.totalEmpWage(120,22);//comp1-->first company
        System.out.println("The eployeewage of first company is:"+comp1);
        System.out.println("\n");
        Employeewage e2 = new Employeewage();
        int comp2 = e2.totalEmpWage(100,25);//comp2-->second company
        System.out.println("The eployeewage of second company is:"+comp2);
    }
}