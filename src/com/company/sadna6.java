package com.company;

import java.util.Scanner;

public class sadna6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int price=0, lowest=Integer.MAX_VALUE, highest=Integer.MIN_VALUE;
System.out.println("enter humus price:");
        price = in.nextInt();
        while (price >= 0) {
            if (price > highest)
                highest = price;
            if (price < lowest)
                lowest = price;
            System.out.println("enter humus price:");
            price = in.nextInt();
        }
        System.out.println("the highest humus price is:" + highest);
        System.out.println("the lowest humus price is:" + lowest);
    }
}
