package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte newbyte = 100;
        short newshort = 1000;
        int newint = 10000;
        long newlong  = 50000 +(newbyte + newshort + newint);
        System.out.println(newlong);
    }
}
