package org.example;

public class PrvekSpojovehoSeznamu {
    int hodnota;
    PrvekSpojovehoSeznamu dalsi;

    public PrvekSpojovehoSeznamu(int hodnota, PrvekSpojovehoSeznamu dalsi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
    }

    public PrvekSpojovehoSeznamu(int hodnota) {
        this(hodnota,null);
    }
}
