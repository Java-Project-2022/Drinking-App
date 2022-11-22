package com.example.MyDrinkingBuddy;

import static com.example.MyDrinkingBuddy.CalcService.BAC;

public class DrinkHandler {
    public static void handleBAC()
    {







        MainActivity myMain = new MainActivity();
        CalcService.bacLoop();
        myMain.textView.setText(Double.toString(BAC));
    }
}
