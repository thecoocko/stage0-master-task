package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String star = "*";
        String space = " ";
        int j = cathetusLength-1;
        for(int i=0;i<cathetusLength;i++){
            System.out.println(space.repeat(j)+star.repeat(i+1));
            j--;
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
