package org.example;

import java.util.Scanner;

public class SrovnejSpojS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        PrvekSpojovehoSeznamu hlava = new PrvekSpojovehoSeznamu(0);

        for(;;){
            int vstup = sc.nextInt();
            if(vstup==0){
                break;
            }

            PrvekSpojovehoSeznamu p = new PrvekSpojovehoSeznamu(vstup);

            for (PrvekSpojovehoSeznamu i = hlava; i!=null; i = i.dalsi){
                if(i.dalsi==null){
                    i.dalsi = p;
                } else if (i.dalsi.hodnota < vstup){
                    p.dalsi = i.dalsi;
                    i.dalsi = p;
                }
            }
        }

        for (PrvekSpojovehoSeznamu p = hlava; p!=null; p = p.dalsi){
            System.out.println(p.hodnota);
        }
    }
}
