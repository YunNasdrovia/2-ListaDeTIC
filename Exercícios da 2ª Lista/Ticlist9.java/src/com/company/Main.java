package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        float pk,pg;
        System.out.println("digite o peso em kilo");
        pk= reader.nextFloat();
        pg=pk*100;
        System.out.println("o peso em gramas é="+pg);
    }
}
