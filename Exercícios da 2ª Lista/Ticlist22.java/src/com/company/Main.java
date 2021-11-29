package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        float comi,sal,salfin;
        System.out.println("digite o salário");
        sal= reader.nextFloat();
        comi=sal*4/100;
        System.out.println(" o aumento da comissão é "+comi);
        salfin=sal+comi;
        System.out.println("o salário final é "+salfin);
    }
}
