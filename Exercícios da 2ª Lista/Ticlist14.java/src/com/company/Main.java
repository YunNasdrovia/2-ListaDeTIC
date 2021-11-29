package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader=new Scanner(System.in);
        int idade,anoact,anonasc;
        int idadem,idadedia,idadesem;
        System.out.println("digite o ano actual");
        anoact= reader.nextInt();
        System.out.println("didite o ano de nascença");
        anonasc= reader.nextInt();
        idade=anoact-anonasc;
        System.out.println("a pessoa tem " +idade);
        idadem=idade*12;
        System.out.println("a idade em meses é " +idadem);
        idadedia=idade*365;
        System.out.println("a idade em dias é " +idadedia);
        idadesem=idade*52;
        System.out.println("a idade em semanas é " +idadesem);
    }
}
