package com.example.dell.otpverification;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.provider.Telephony;
import android.support.v4.app.NotificationCompat;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verification extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
String action=intent.getAction();
Toast.makeText(context,"IN ONRECEIVE METHOD FOR "+action,Toast.LENGTH_SHORT).show();
        NotificationCompat.Builder mBuilder=(NotificationCompat.Builder)new NotificationCompat.Builder(context.getApplicationContext())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("New message")
                .setContentText("Otp received")
                .setAutoCancel(true);
        NotificationManager nm=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(100,mBuilder.build());


     /*   int otp=12345;
        Pattern pattern=Pattern.compile("[0-9]{5}");
        Matcher m=pattern.matcher("");
        boolean b=m.matches();
        System.out.println(b);
*/





        }
    }

