package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        float a,bmaior,bmenor,altura;
        System.out.println("digite os valores");
        bmaior= reader.nextFloat();
        bmenor= reader.nextFloat();
        altura= reader.nextFloat();
        if (bmaior<bmenor){
            bmaior=bmenor;
        }
        a=((bmaior+bmenor)*altura)*2;
        System.out.println(" a area é="+a);
    }
}
