package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercício número 4
        Scanner reader=new Scanner(System.in);
        int n1,divi,n2;
        System.out.println("Digite os números");
        n1= reader.nextInt();
        n2=reader.nextInt();
        if(n2!=0){
            divi=n1/n2;
            System.out.println("a divisão dos nímeros é="+divi);
        }
    }
}
