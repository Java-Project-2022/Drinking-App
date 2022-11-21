package com.example.draft3;

public class CalcService {
    //bac running total variable
    public static double BAC = 0.00;
    //constant decrement per minute
    public final static double decrement = 0.025f;

    //initialize array and drink variables
    public static double[] bacArray = new double[30];

    //constant variables for conversion
    public final static double ozToGrams = 23.34;
    public final static double lbsToGrams = 453.492;

    //gender constants
    public static double genderConstant = 0.0;

    public static int flag = 1;
    public static int loopActive = 0;

    public static void bacLoop() {
        loopActive = 1;
        while (flag == 1) {
            TimingCode timer = new TimingCode(1);
            loopActive = 1;
        }
        loopActive = 0;
    }

    public static void bacUpdate() {
        //if BAC is currently 0
        if (BAC == 0.0f) {
            //check static array pos and update
            if (bacArray[0] != 0.0f) {
                BAC += bacArray[0];
            }
            //stop service b/c nothing in array and BAC 0
            else {
                flag = 0;
            }
        } else {
            //decrement
            BAC -= decrement;
            //check static array pos and update
            if (bacArray[0] != 0.0f) {
                BAC += bacArray[0];
            }
        }

        //left shift array contents and initialize pos 29 to 0
        //update array for next iteration
        System.arraycopy(bacArray, 1, bacArray, 0, 29);
        bacArray[29] = 0.0f;
    }

    //called when 'track drink' button pressed
    //accepts settings variables & dynamic variables that hold
    //number of ounces per drink as well as alcohol content
    public static void addDrink(int weight, char gender, double drinkOz, double drinkAlc) {
        double toAdd;
        if (gender == 'F') {
            genderConstant = 0.55;
        } else {
            genderConstant = 0.68;
        }

        //calculate how much to add to each partition of array
        toAdd = ((drinkAlc * drinkOz * ozToGrams) / (weight * lbsToGrams * genderConstant)) / 30;
        //get true percentage
        toAdd = toAdd * 10000;

        //add to each partition of the array
        for (int i = 0; i < 30; i++) {
            bacArray[i] += toAdd;
        }
    }
}
