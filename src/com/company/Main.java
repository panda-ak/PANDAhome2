package com.company;

public class Main {
    public static int count = 0;
    public static double sun = 0;
    public static int counter = 0;
    public static double number;

    public static void main(String[] args) {
        double[] numbers = {2.6, 7.4, -1.0, 11.7, 5.0, 5.5, 7.9, 2.6, 0.3, 6.3, 4.7, 6.4, 9.9, 7.8, 5.3,};
        for (double ulta : numbers) {
            if (ulta > 0) {
                count++;
            } else if (ulta < 0 && count < 0) {
                sun = sun + ulta;
                counter++;
                number = sun / counter;


            }
        }System.out.println(number);

    }
}