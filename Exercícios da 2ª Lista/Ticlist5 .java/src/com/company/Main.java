package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercício 5
        Scanner reader=new Scanner(System.in);
        float n1,n2,n3,mediaart;
        System.out.println("didite os números");
        n1= reader.nextInt();
        n2=reader.nextInt();
        n3=reader.nextInt();
        mediaart=n1+n2+n3/3;
        System.out.print("a média aritmétrica é="+mediaart);
    }
}
