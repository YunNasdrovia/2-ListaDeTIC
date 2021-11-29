package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        double sal, valoraum,novosal;
        float percent;
        System.out.println("digite o salário");
        sal = reader.nextDouble();
        System.out.println("digite a percentagem de aumento");
        percent=reader.nextFloat();

        valoraum=sal*percent/100;
        System.out.println(" o valor de aumeto será " +valoraum);
        novosal=sal+valoraum;
        System.out.println(" o novo salário será " +novosal);

    }
}
