package com.company;

public class Main {

    // Entry point of the system
    public static void main(String[] args) {

        Addition add = new Addition();
        System.out.println(add.calc(5,6));



    }


    public interface Operation {

        int a = 0;
        int b =0;

        int calc(int a, int b);
    }


    public static class Addition implements Operation {


        @Override
        public int calc(int a, int b) {
            return a+b;

        }
    }


}
