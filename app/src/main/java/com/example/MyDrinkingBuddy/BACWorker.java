package com.example.MyDrinkingBuddy;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class BACWorker extends Worker {
    public BACWorker(
            @NonNull Context context,
            @NonNull WorkerParameters params) {
            super(context, params);
    }

    @NonNull
    @Override
    public Result doWork() {
        CalcService.bacLoop();
        return Result.success();
    }
}