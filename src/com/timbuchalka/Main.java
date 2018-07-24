package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(282, 78));
        System.out.println(getGreatestCommonDivisor(12, 30));
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
            smaller = second;
        }
        //***************************
        bigger = first;
        smaller = second;
        int rest = bigger % smaller;
        int anotherRest = smaller % rest;
        //***************************
        while (rest != 0) {

        }
        return commonDivisor;


//        int rest = bigger % smaller;                                // 48 = 282/78 also a next small
//        int anotherRest = smaller % rest;                           //  78/48 -> rest 30 also next small
//        int yetAnother = rest % anotherRest;                        // 48/30
//        int yetYetAnother = anotherRest % yetAnother;               // 30/18
//        int yetYetYetAnother = yetAnother % yetYetAnother;          // 18/12
//        int yetYetYetYetAnother = yetYetAnother % yetYetYetAnother; // 12/6       <--------------------
//        System.out.println("The greatest common divisor is: " + yetYetYetAnother);
//        return yetYetYetYetAnother;
    }
}

/*
The method should return the greatest common divisor of the two numbers(int)
The greatest common divisor is the largest positive integer that can fully divide each of the integers(i.e.)without leaving a remainder)
for Example 12and 30.
12 can be divided by 1,2,3,4,6,12
30 can be divided by 1,2,3,5,6,10,15,30*/

/*
Big/Small

282/78 --> DIV 3 --> REST 48 --> NEXT REST --> 30
78/48  --> DIV 1 --> REST 30 --> NEXT REST --> 18
48/30  --> DIV 1 --> REST 18 --> NEXT REST --> 12
30/18  --> DIV 1 --> REST 12 --> NEXT REST -->  6
18/12  --> DIV 1 --> REST 6  --> NEXT REST -->  0
12/6   --> DIV 2 --> REST 0  --> NEXT REST -->

 */