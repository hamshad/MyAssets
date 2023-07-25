package com.example.myassets.TextError;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.myassets.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            public void onTextChanged(CharSequence password, int i, int i1, int i2) {

                //For strong password validation:

//                ^ represents starting character of the string.
//                (?=.*[0-9]) represents a digit must occur at least once.
//                (?=.*[a-z]) represents a lower case alphabet must occur at least once.
//                (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//                (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
//                (?=\\S+$) white spaces don’t allowed in the entire string.
//                .{8, 20} represents at least 8 characters and at most 20 characters.
//                 $ represents the end of the string.
                if (password.length() < 6 || password.length() > 20) {
                    inputLayout.setError("Password should be between 6 to 20 characters");
                } else if (regexSearch(password ,"[A-Z]")) {
                    inputLayout.setError("At least one Uppercase letter is needed");
                } else if (regexSearch(password, "[0-9]")) {
                    inputLayout.setError("At least one Number is needed");
                } else if (regexSearch(password, "\\S+$")) {
                    inputLayout.setError("Remove empty space");
                } else if (regexSearch(password, "[a-z]")) {
                    inputLayout.setError("At least one Lowercase letter is needed");
                } else if (regexSearch(password, "[@#$%^&-_]")) {
                    inputLayout.setError("At least one Special Character is needed (eg.@#$%^&-_)");
                } else {
                    inputLayout.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private boolean regexSearch(CharSequence password ,String regex) {

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return !matcher.find();

    }
}