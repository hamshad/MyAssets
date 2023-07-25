package com.example.myassets.TypingAnimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.myassets.R;

public class TypingAnimationActivity extends AppCompatActivity {

    TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typing_animation);

        a = findViewById(R.id.typing_animation);

        new Handler().postDelayed(() -> a.append("A"), 300);
        new Handler().postDelayed(() -> a.append("P"), 400);
        new Handler().postDelayed(() -> a.append("P"), 500);
        new Handler().postDelayed(() -> a.append(" "), 600);
        new Handler().postDelayed(() -> a.append("N"), 700);
        new Handler().postDelayed(() -> a.append("A"), 800);
        new Handler().postDelayed(() -> a.append("M"), 900);
        new Handler().postDelayed(() -> a.append("E"), 1000);
    }
}