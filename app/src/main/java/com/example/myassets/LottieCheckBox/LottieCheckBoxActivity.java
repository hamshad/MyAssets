package com.example.myassets.LottieCheckBox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.myassets.R;

public class LottieCheckBoxActivity extends AppCompatActivity {

    boolean isChecked = false;
    LottieAnimationView lottie_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_check_box);

        //Add Dependency:
            //implementation 'com.airbnb.android:lottie:6.1.0'
        //Make Raw type folder in Res package and paste the json animation

        lottie_check = findViewById(R.id.lottie_check);lottie_check.setMinFrame(4);

        //For showing a frame
        lottie_check.setMinFrame(4);

        lottie_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isChecked) {

                    //For reversing the animation
                    lottie_check.setSpeed(-1);

                    lottie_check.playAnimation();

                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();

                    isChecked = false;

                } else {

                    //For playing animation straight forward
                    lottie_check.setSpeed(1);

                    lottie_check.playAnimation();
                    Log.d(Boolean.toString(isChecked), "");

                    Toast.makeText(getApplicationContext(), "UnChecked", Toast.LENGTH_SHORT).show();

                    isChecked = true;
                }
            }
        });

    }
}