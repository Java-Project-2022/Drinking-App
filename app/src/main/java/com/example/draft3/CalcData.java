package com.example.draft3;
//this is a test comment
//holds the drink information to be accessed by the service
public class CalcData {
    //initialize array and drink variables
    static double[] myArray = new double[30];

    //constant variables for conversion
    final static double ozToGrams = 23.34;
    final static double lbsToGrams = 453.492;

    //gender constants
    static double genderConstant = 0.0;

    public static void addDrink(int weight,char gender,double drinkOz,double drinkAlc) {
        double toAdd = 0.0;
        if(gender == 'F') {
            genderConstant = 0.55;
        }
        else {
            genderConstant = 0.68;
        }

        //calculate how much to add to each partition of array
        toAdd = ((drinkAlc * drinkOz * ozToGrams)/(weight * lbsToGrams * genderConstant))/30;
        //get true percentage
        toAdd = toAdd * 10000;

        //add to each partition of the array
        for(int i=0; i<30; i++) {
            myArray[i] += toAdd;
        }
    };
}




