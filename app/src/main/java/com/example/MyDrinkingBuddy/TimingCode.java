package com.example.MyDrinkingBuddy;
import java.util.Timer;
import java.util.TimerTask;

// Code for making calculations time-based in order for a more interactive user experience when viewing their BAC

public class TimingCode {

    //create timer variable
    Timer timer;

    public TimingCode(int seconds) {
        //create timer object
        timer = new Timer();
        //sets a new timer to end at 1 * milliseconds
        //upon end of timer, create a new EndTimeTask
        timer.schedule(new EndTimeTask(), seconds*5000);
    }

    public class EndTimeTask extends TimerTask {
        //once created, calls the run() method
        //that calls bacUpdate().  bacUpdate will
        //either create a new timer thread or stop.
        //this current timer thread will then stop.
        public void run() {
            //actions to be taken at end of timer
            CalcService.bacUpdate();
            timer.cancel(); // stops the timer thread
        }
    }

}