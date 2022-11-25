//package com.example.MyDrinkingBuddy;
//
//import android.app.Notification;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.os.Build;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.RequiresApi;
//import androidx.core.app.NotificationCompat;
//import androidx.work.ForegroundInfo;
//import androidx.work.WorkManager;
//import androidx.work.Worker;
//import androidx.work.WorkerParameters;
//
//public class BACWorker extends Worker {
//
//    private NotificationManager notificationManager;
//
//    //worker constructor
//    public BACWorker(
//            @NonNull Context context,
//            @NonNull WorkerParameters params) {
//            super(context, params);
//            notificationManager = (NotificationManager)
//                    context.getSystemService(Context.NOTIFICATION_SERVICE);
//    }
//
//    @NonNull
//    @Override
//    //defining the work to be done
//    public Result doWork() {
//        setForegroundAsync(createForegroundInfo("Progress"));
//        CalcService.bacLoop();
//        return Result.success();
//    }
//
//    @NonNull
//    private ForegroundInfo createForegroundInfo(@NonNull String progress) {
//         //Build a notification using bytesRead and contentLength
//
//        Context context = getApplicationContext();
//        String id = context.getString(R.string.notification_channel_id);
//        String title = context.getString(R.string.notification_title);
//        String cancel = context.getString(R.string.cancel_download);
//         //This PendingIntent can be used to cancel the worker
//        PendingIntent intent = WorkManager.getInstance(context)
//                .createCancelPendingIntent(getId());
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            createChannel();
//        }
//
//        Notification notification = new NotificationCompat.Builder(context, id)
//                .setContentTitle(title)
//                .setTicker(title)
//                //need small icon in drawables
//                .setSmallIcon(R.drawable.ic_work_notification)
//                .setOngoing(true)
//                // Add the cancel action to the notification which can
//                // be used to cancel the worker
//                .addAction(android.R.drawable.ic_delete, cancel, intent)
//                .build();
//
//        return new ForegroundInfo(notificationId, notification);
//    }
//
//    @RequiresApi(Build.VERSION_CODES.O)
//    private void createChannel() {
//        // Create a Notification channel
//    }
//}