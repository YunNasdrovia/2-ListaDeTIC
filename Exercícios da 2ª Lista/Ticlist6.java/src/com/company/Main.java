package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercício número 6
        Scanner reader=new Scanner(System.in);
        float n1,n2,n3,p1,p2,p3,mediap;
        System.out.println("digite os números");
        n1=reader.nextInt();
        n2=reader.nextInt();
        n3=reader.nextInt();
        p1=reader.nextInt();
        p2=reader.nextInt();
        p3=reader.nextInt();
        mediap=n1*p1+n2*p2+n3*p3/n1+n2+n3;
        System.out.print("a média ponderada é="+mediap);
    }
}
