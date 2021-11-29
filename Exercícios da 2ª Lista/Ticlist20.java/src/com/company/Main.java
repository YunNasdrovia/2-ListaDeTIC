package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        float quantc;
        float precon,custeven;
        System.out.println("digite o custo o evento");
        custeven= reader.nextFloat();
        System.out.println("Digite o preço");
        precon= reader.nextFloat();
        quantc=custeven/precon;
        System.out.println("a quantidade de convites que deve ser vendida é " +quantc);
    }
}
