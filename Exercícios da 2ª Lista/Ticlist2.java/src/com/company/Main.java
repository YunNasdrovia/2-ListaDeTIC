package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercício número 2
        Scanner reader=new Scanner(System.in);
        int n1,n2,sub;
        System.out.println("digite os números");
        n1= reader.nextInt();
        n2= reader.nextInt();
        sub=n2-n1;
        System.out.println("A subtração dos números é="+sub);
    }
}
