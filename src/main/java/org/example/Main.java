package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        String value=input.next();
        int anton=0;
        int danik=0;
        for (int i=0; i<size;i++){
            if (value.charAt(i) =='A'){
                anton++;
            }else {
                danik++;
            }
        }
        if (anton > danik){
            System.out.println("Anton");
        } else if (anton < danik) {
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }


    }
}