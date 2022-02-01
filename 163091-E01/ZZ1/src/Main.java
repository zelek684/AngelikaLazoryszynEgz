package com.company;
import java.time.LocalTime;
import java.util.Arrays;
public class Main {
    public static <T,Comparable extends T> boolean jestPalindromem(T[] array) {
        StringBuilder t1 = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            t1.append(array[i].toString());
        }
        StringBuilder t2 = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            t2.append(array[i].toString());
        }
            if(t1.length() != t2.length()) {
                return false;
        }





        int len = t1.length();
        for (int i = 0; i<len; i++) {
            if (t1.charAt(i) != t2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 3;
        a[4] = 2;
        a[5] = 1;
        System.out.println("Czy nie posortowane a jest palindromem?");
        System.out.println(jestPalindromem(a));
        Arrays.sort(a);
        System.out.println("Czy posortowane a jest palindromem?");
        System.out.println(jestPalindromem(a));

        LocalTime b[] = new LocalTime[3];
        b[0] = LocalTime.of(11, 11);
        b[1] = LocalTime.of(22, 22);
        b[2] = LocalTime.of(11, 11);
        System.out.println("Czy nie posortowane b jest palindromem?");
        System.out.println(jestPalindromem(a));


    }
}

