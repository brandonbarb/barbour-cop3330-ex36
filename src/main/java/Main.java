/*
 *  UCF COP3330 Summer 2021 Assignment 36 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        String entry = "temp";
        boolean e = true;
        while (true) {
            System.out.print("Enter a number: ");
            entry = input.next();
            if (entry.equals("done")) {
                break;
            }
            array.add(entry);
        }

        System.out.print("Numbers: ");
        for (int i = 0; i <= array.size() - 2; i++) {
            System.out.printf("%s, ", array.get(i));
        }
        System.out.printf("%s\n", array.get(array.size() - 1));
        System.out.printf("The average is %.1f\n", average(array));
        System.out.printf("The minimum is %d\n", min(array));
        System.out.printf("The maximum is %d\n", max(array));
        System.out.printf("The standard deviation is %.2f", std(array));

    }

    public static double average(List<String> array) {
        double sum = 0;
        for (int i = 0; i <= array.size() - 1; i++) {
            sum = sum + Integer.parseInt(array.get(i));
        }
        return sum / array.size();
    }

    public static int max(List<String> array) {
        int max = 0;
        for (int i = 0; i <= array.size() - 1; i++) {
            int value = Integer.parseInt(array.get(i));
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int min(List<String> array) {
        int min = 999999999;
        for (int i = 0; i <= array.size() - 1; i++) {
            int value = Integer.parseInt(array.get(i));
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static double std(List<String> array) {
        double mean = average(array);
        double temp = 0;
        for (int i = 0; i <= array.size() - 1; i++) {
            temp += Math.pow((Integer.parseInt(array.get(i)) - mean), 2);
        }
        return Math.sqrt(temp / array.size());
    }
}
