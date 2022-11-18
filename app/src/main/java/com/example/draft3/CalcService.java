package com.example.draft3;

public class CalcService {
    //bac running total variable
    static double BAC = 0.00;
    //constant decrement per minute
    final static double decrement = 0.025f;

    static int flag = 1;
    static int loopActive = 0;

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
                if (CalcData.myArray[0] != 0.0f) {
                    BAC += CalcData.myArray[0];
                }
                //stop service b/c nothing in array and BAC 0
                else {
                    flag = 0;
                }
            }
            else {
                //decrement
                BAC -= decrement;
                //check static array pos and update
                if (CalcData.myArray[0] != 0.0f) {
                    BAC += CalcData.myArray[0];
                }
            }

            //left shift array contents and initialize pos 29 to 0
            //update array for next iteration
            System.arraycopy(CalcData.myArray, 1, CalcData.myArray, 0, 29);
            CalcData.myArray[29] = 0.0f;
        }
    }
