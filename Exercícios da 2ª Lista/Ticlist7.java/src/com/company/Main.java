package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercício número 7
        Scanner reader=new Scanner(System.in);
        float a,dmaior,dmenor;
        System.out.println("digite os valores");
        dmaior= reader.nextFloat();
        dmenor= reader.nextFloat();
        a=dmaior*dmenor/2;
        System.out.print("A area é="+a);
    }
}
