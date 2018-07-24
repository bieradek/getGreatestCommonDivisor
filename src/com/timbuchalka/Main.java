package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(282, 78));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        if (first == second || (second % first == 0)) {
            return first;
        }
        if (first % second == 0) {
            return second;
        }
        int bigger;
        int smaller;

        if (first > second) {
            bigger = first;
        }
        smaller = second;
        bigger = first;


        int rest = bigger % smaller;
        System.out.println("Rest is " + rest);
//282 and 78
        while (rest != 0) {
            smaller = bigger % rest;
            bigger = smaller;
            rest = bigger % smaller;
        }
        return smaller;
    }
}

/*The method should return the greatest common divisor of the two numbers(int)
The greatest common divisor is the largest positive integer that can fully divide each of the integers(i.e.)without leaving a remainder)
for Example 12and 30.
12 can be divided by 1,2,3,4,6,12
30 can be divided by 1,2,3,5,6,10,15,30*/

/*
282/78 --> DIV 3 --> REST 48
smaller is 48 bigger is 78
78/48  --> DIV 1 --> REST 30
48/30  --> DIV 1 --> REST 18
30/18  --> DIV 1 --> REST 12
18/12  --> DIV 1 --> REST 6
12/6   --> DIV 2 --> REST 0
 */