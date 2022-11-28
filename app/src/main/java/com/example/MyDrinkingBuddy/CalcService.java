package com.example.MyDrinkingBuddy;

public class CalcService {
    //bac running total variable
    public static double BAC = 0.00;
    //constant decrement per minute
    public final static double decrement = 0.00025f;

    //initialize array and drink variables
    public static double[] bacArray = new double[30];

    //constant variables for conversion
    public final static double ozToGrams = 23.34;
    public final static double lbsToGrams = 453.492;

    //gender constant variable set in addDrink()
    public static double genderConstant = 0.0;

    //flag that indicates if the sequence of
    //timer threads is active or not w/ boolean val
    public static int threadActive = 0;

    //Initializes a sequence of timer threads that update the
    //bac variable by calling bacUpdate until both conditions met:
    //1) bac is 0 and 2) there is nothing in the array to add
    public static void bacThread() {
        threadActive = 1;
        TimingCode timer = new TimingCode(1);
    }

    //called during each timer thread to determine the status
    //of the loop and update BAC.  There are 3 possible outcomes:
    //1) BAC is 0, but there are values queued in the array.
    //-> add the first array position, create new timer thread
    //2) BAC is 0 and nothing to add in array
    //-> set threadActive flag to 0 and no. of drinks to 0
    //-> by not creating another timer thread, this ends the loop
    //3) BAC is not 0
    //-> Check the array for a value to add.  Decrement BAC by a
    //-> constant value, and check to see if it returns a negative result.
    //-> If negative, set BAC to 0
    //Lastly, the array shifts the contents over of the array by 1,
    //discarding pos 0 and updating pos 29 to a value of 0.
    //This updates the array for the next iteration
    public static void bacUpdate() {
        //if BAC is currently 0
        if (BAC == 0.0f) {
            //check first array pos and update
            //create new timer thread
            if (bacArray[0] != 0.0f) {
                BAC += bacArray[0];
                TimingCode timer = new TimingCode(1);
            }
            //stop thread sequence b/c nothing in array and BAC 0
            else {
                threadActive = 0;
                Constants.drink = 0;
            }
        }
        //if BAC is currently greater than 0
        else {
            //check first array pos and update
            if (bacArray[0] != 0.0f) {
                BAC += bacArray[0];
            }
            //decrement
            BAC -= decrement;
            //protection in the case that bac would become a negative val
            if(BAC < 0) {
                BAC = 0;
            }
            //create new timer thread
            TimingCode timer = new TimingCode(1);
        }

        //left shift array contents and initialize pos 29 to 0
        //updating array for next iteration
        System.arraycopy(bacArray, 1, bacArray, 0, 29);
        bacArray[29] = 0.0f;
    }

    //called when 'track drink' button pressed
    //accepts settings variables & dynamic variables that hold
    //number of ounces per drink as well as alcohol content
    //alcohol percentage passed as an integer
    public static void addDrink(int weight, char gender, double drinkOz, double drinkAlc) {
        double toAdd;
        if (gender == 'F') {
            genderConstant = 0.55;
        }
        else {
            genderConstant = 0.68;
        }

        //calculate how much to add to each partition of array, 30 total positions for 30 minutes
        toAdd = (((drinkAlc/100) * drinkOz * ozToGrams) / (weight * lbsToGrams * genderConstant)) / 30;
        //get true percentage
        toAdd = toAdd * 100;

        //add to each partition of the array
        for (int i = 0; i < 30; i++) {
            bacArray[i] += toAdd;
        }
    }
}
