package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //exercício número 3
        Scanner reader = new Scanner(System.in);
        int n1,n2,n3,mult;
        System.out.println("digite os números");
        n1= reader.nextInt();
        n2= reader.nextInt();
        n3= reader.nextInt();
        mult=n1*n2*n3;
        System.out.println("A multiplicação é="+mult);
    }
}
