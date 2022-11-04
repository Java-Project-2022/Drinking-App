package com.example.draft3;

public class CalcService {
    //bac running total variable
    static double BAC = 0.0;
    //constant decrement per minute
    final static double decrement = 0.025f;

    public static void bacUpdate() {
        if(BAC == 0.0f) {
            //check static array pos and update
            if(CalcData.myArray[0] != 0.0f) {
                BAC += CalcData.myArray[0]; }
            else {
                //stop service b/c nothing in array and BAC 0
            }
        }
        else {
            //decrement
            BAC -= decrement;
            //check static array pos and update
            if(CalcData.myArray[0] != 0.0f) {
                BAC += CalcData.myArray[0];
            }
        }

        //left shift array contents and initialize pos 29 to 0
        for(int i=0; i<29; i++) {
            CalcData.myArray[i] = CalcData.myArray[i+1];
        }
        CalcData.myArray[29] = 0.0f;
    }
}
