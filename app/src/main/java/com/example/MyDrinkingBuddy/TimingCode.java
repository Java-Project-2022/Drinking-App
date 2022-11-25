package com.example.MyDrinkingBuddy;
import java.util.Timer;
import java.util.TimerTask;

public class TimingCode {

    Timer timer;

    public TimingCode(int seconds) {
        timer = new Timer(); //creates new timer object
        //sets a new timer to end at 1 * 300000(milliseconds) = 5 minutes, in which a new EndTimeTask sub-class obj will be created
        timer.schedule(new EndTimeTask(), seconds*1000);
    }

    public class EndTimeTask extends TimerTask {
        //Custom sub-class of "timingCode", the run method will contain the code that performs the task to be done once the timer is finished
        public void run() {
            //actions to be taken at end of timer
            CalcService.bacUpdate();

            timer.cancel(); // stops the timer thread
        }
    }

}