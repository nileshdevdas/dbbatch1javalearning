package com.vinsys.airports;


import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class SampleIOExample {

    public void addNextPaymentCall(int a , int b){
        computeInterest(a, b, 15);
    }

    private double computeInterest(int a, int b, int i) {
        int defaulterOccurences = fetchDefaultPayments();
        if(defaulterOccurences > 0){
            return defaulterOccurences * 500;
        }else{
            return 0;
        }
    }

    private int fetchDefaultPayments() {
        System.out.println("new customer no occurences...");
        return 0;
    }


    public static void main(String[] args) throws Exception{
        SampleIOExample example = new SampleIOExample();
        example.addNextPaymentCall(100,100);
    }
}
