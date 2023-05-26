package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        for(;;){
            int vstup = sc.nextInt();
            if(vstup==0){
                break;
            }
            for (int i = 0; arr[i] != 0; i++) {
                if(arr[i] < vstup){
                    continue;
                } else {
                    //posun prvky v poli
                    arr[i] = vstup;
                }
            }
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
}
