package com.racloop.practice.JunitTesting;

public class JUnitTesting {

    int sum(int[] numbers)
    {
        int sum =0;
        for (int i: numbers)
        {
            sum +=i;
        }
        return sum;
    }
}
