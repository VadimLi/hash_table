package main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        final byte n;

        final Scanner in = new Scanner(System.in);

        n = in.nextByte();

        final TelephoneBook telephoneBook = new TelephoneBook(n);

        telephoneBook.createNumbers();

        telephoneBook.writeNumbers();

    }

}
