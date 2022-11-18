package com.example.probab_alarmi;

import android.widget.TextView;

import java.util.Random;

public class rndmNumGen {
    public static int sum;

    protected void onCreate(){
         TextView num1 = null;
         TextView num2 = null;

        Random random1 = new Random();
        Random random2 = new Random();
        int val1 = random1.nextInt();
        int val2 = random2.nextInt();
        int  sum = val1+val2;

        final TextView textView1 = num1.findViewById(R.id.number_1);
        textView1.setText(Integer.toString(val1));
        final TextView textView2 = num2.findViewById(R.id.number_2);
        textView2.setText(Integer.toString(val2));

    }

}
