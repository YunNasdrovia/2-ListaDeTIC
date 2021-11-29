package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercício número 1
        Scanner reader=new Scanner(System.in);
        int n1,n2,n3,n4,soma;
        System.out.println("digite os números");
        n1=reader.nextInt();
        n2=reader.nextInt();
        n3=reader.nextInt();
        n4=reader.nextInt();
        soma= n1 + n2 + n3 + n4;
        System.out.println("a soma dos números é ="+soma);

    }
}
