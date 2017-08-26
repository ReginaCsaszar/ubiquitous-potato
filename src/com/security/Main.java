package com.security;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final String[] FILETOSIG = {"input.txt"};
        final String[] VERSIGFILES = {"jeapk", "sig", "input.txt"};

        Scanner select = new Scanner(System.in);

        System.out.println("1 = Generate signature 2 = Validate back");
        int option = select.nextInt();

        switch (option) {

            case 1:
                GenSig.main(FILETOSIG);
                break;

            case 2:
                VerSig.main(VERSIGFILES);
                break;
        }
    }
}
