package com.example.springintro.services;

public class CalculateDay {
    public String zellercongruence(int day, int month, int year) {
        String output = "";
        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        switch (h) {
            case 0:
                output = "Saturday";
                break;
            case 1:
                output = "Sunday";
                break;
            case 2:
                output = "Monday";
                break;
            case 3:
                output = "Tuesday";
                break;
            case 4:
                output = "Wednesday";
                break;
            case 5:
                output = "Thursday";
                break;
            case 6:
                output = "Friday";
                break;
        }
        return output;
    }

}
