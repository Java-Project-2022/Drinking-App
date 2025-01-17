package com.example.MyDrinkingBuddy;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.uber.sdk.android.core.UberSdk;
import com.uber.sdk.android.rides.RideRequestButton;
import com.uber.sdk.core.auth.Scope;
import com.uber.sdk.core.client.SessionConfiguration;

import java.util.Collections;

// This Activity is where all of the safety features are placed
// Safety Features include Uber Integration, a link to the user's phone using pre-loaded phone numbers
// and Parking which allows the user to access google maps to find their parking spot

public class HelpScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);
        SessionConfiguration sessionConfiguration = new SessionConfiguration.Builder()
                .setClientId("b_Cx4qgi40QhJh4srjBolK1l8plEbV1F")
                .setServerToken("LH1tcHn5_z-XsRlinz1umc1cv1ZbxnxW4V4w77Hp")
                .setRedirectUri("")
                .setScopes(Collections.singletonList(Scope.RIDE_WIDGETS))
                .setEnvironment(SessionConfiguration.Environment.SANDBOX)
                .build();
        UberSdk.initialize(sessionConfiguration);
        RideRequestButton requestButton = new RideRequestButton(HelpScreen.this);
        RelativeLayout layout= new RelativeLayout(this);
        layout.addView(requestButton);
        // Police button
        ImageButton button_police = findViewById(R.id.policeButton);
        button_police.setOnClickListener(view-> PhoneCall());

        // Parking Button
        ImageButton button_parking = findViewById(R.id.imageButtonPARKINGSIGN);
        button_parking.setOnClickListener(view-> openMap());

        // Uber Button


        // Home button to take the user back to the Main Activity
        ImageButton Home = findViewById(R.id.imageButton27);
        Home.setOnClickListener(view -> closeHelpScreen());
    }
    // UDF to take the user to the edit settings screen
    public void openEditScreen(){
        Intent intent = new Intent(this, SettingsMenu.class);
        startActivity(intent);
    }
    // UDF to take the user back to Main
    public void closeHelpScreen(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void PhoneCall(){
        Uri number = Uri.parse("tel:911");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            return;
        }
        startActivity(callIntent);
    }
    public void openMap(){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
