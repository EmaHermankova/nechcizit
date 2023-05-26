package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SetridenySeznam {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte čísla (ukončete nulou):");

        int cislo;
        do {
            cislo = scanner.nextInt();
            if (cislo != 0) {
                vlozCisloDoSeznamu(seznam, cislo);
            }
        } while (cislo != 0);

        System.out.println("Setříděný seznam:");
        for (int i : seznam) {
            System.out.println(i);
        }
    }

    private static void vlozCisloDoSeznamu(List<Integer> seznam, int cislo) {
        int index = Collections.binarySearch(seznam, cislo);
        if (index < 0) {
            index = -(index + 1);
        }
        seznam.add(index, cislo);
    }
}
