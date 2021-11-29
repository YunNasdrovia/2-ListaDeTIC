package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        float sal,salnovo,aum;
        System.out.println("digite o salário");
        sal= reader.nextFloat();
        aum=sal*25/100;
        salnovo=aum+sal;
        System.out.println("o salário novo é "+salnovo);
    }
}
