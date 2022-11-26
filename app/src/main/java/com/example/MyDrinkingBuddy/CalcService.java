package com.example.MyDrinkingBuddy;

public class CalcService {

    //constructor
    public CalcService() {
    }

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

    //public static int flag = 1;
    public static int threadActive = 0;

    //format(".2f", BAC);
    //String mainBAC = Double.toString(BAC);

    public static void bacThread() {
        threadActive = 1;
        TimingCode timer = new TimingCode(1);
    }

    public static void bacUpdate() {
        //if BAC is currently 0
        if (BAC == 0.0f) {
            //check static array pos and update
            if (bacArray[0] != 0.0f) {
                BAC += bacArray[0];
                TimingCode timer = new TimingCode(1);
            }
            //stop service b/c nothing in array and BAC 0
            else {
                //flag = 0;
                threadActive = 0;
                Constants.drink = 0;
            }
        } else {
            //decrement
            BAC -= decrement;
            //protection in the case that bac would become a negative val
            if(BAC < 0) {
                BAC = 0;
            }
            //check static array pos and update
            if (bacArray[0] != 0.0f) {
                BAC += bacArray[0];
            }
            TimingCode timer = new TimingCode(1);
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
        toAdd = (((drinkAlc/100) * drinkOz * ozToGrams) / (weight * lbsToGrams * genderConstant)) / 30;
        //get true percentage
        toAdd = toAdd * 10000;

        //add to each partition of the array
        for (int i = 0; i < 30; i++) {
            bacArray[i] += toAdd;
        }
    }
}
