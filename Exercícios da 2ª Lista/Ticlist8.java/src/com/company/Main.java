package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercício 8
        Scanner reader=new Scanner(System.in);
        int l1,l2,a;
        System.out.println("DIGITE OS VALORES");
        l1= reader.nextInt();
        l2= reader.nextInt();
        a=l1*l2;
        System.out.println("a area do losângulo é="+a);
    }
}
