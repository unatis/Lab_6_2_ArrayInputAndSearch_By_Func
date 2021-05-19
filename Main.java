package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Names[] = TakeNames();

        while(true){

            System.out.println("Please enter index");

            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            if(index != 0){
                PrintNameByIndex(Names, index);
            }else{
                break;
            }
        }

        System.out.println("THE END");

    }

    public static String[] TakeNames(){

        String Names[] = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 names ");

        for(int i = 0; i < 5; i++){

            Names[i] = scanner.nextLine();

        }

        return Names;

    }

    public static void PrintNameByIndex(String[] Names, int Index){

        System.out.println("Index " + Index-- + " has name " + Names[Index--]);

    }
}
