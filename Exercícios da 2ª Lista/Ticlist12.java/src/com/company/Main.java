package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        float a,b,altura;
        System.out.println("digite os valores");
        b= reader.nextFloat();
        altura= reader.nextFloat();
        a=b*altura/2;
        System.out.println("a area é="+a);
    }
}
