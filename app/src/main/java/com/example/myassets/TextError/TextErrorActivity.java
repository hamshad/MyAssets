package com.example.myassets.TextError;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.myassets.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class TextErrorActivity extends AppCompatActivity {

    TextInputLayout loginUsernameTextLayout;
    TextInputEditText loginUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_error);

        loginUsername = findViewById(R.id.login_username);
        loginUsernameTextLayout = findViewById(R.id.login_username_text_layout);

        textChangeError(loginUsernameTextLayout, loginUsername);
    }

    private void textChangeError(TextInputLayout inputLayout, TextInputEditText editText) {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 8) {
                    inputLayout.setError("Less than 8 Character");
                } else {
                    inputLayout.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}