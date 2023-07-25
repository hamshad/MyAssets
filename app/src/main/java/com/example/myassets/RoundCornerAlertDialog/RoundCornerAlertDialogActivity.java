package com.example.myassets.RoundCornerAlertDialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myassets.R;

public class RoundCornerAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_corner_alert_dialog);

        //1. Make Drawable File like:
            // @drawable/dialog_round_corners
        //2. Add below Code in the themes.xml file
            /*  <style name="CustomAlertDialog" parent="Theme.AppCompat.DayNight.Dialog.Alert">
                  <item name="android:windowBackground">@drawable/dialog_round_corners</item>
                </style>   */
        //3. Make alert dialog layout
        //4. Call it, modify it and show it


        AlertDialog.Builder dialog = new AlertDialog.Builder(this, R.style.CustomAlertDialog);
        View login_alertDialog = getLayoutInflater().inflate(R.layout.activity_round_corner_alert_dialog, null);

        TextView errorMessage = login_alertDialog.findViewById(R.id.error_message);
        Button ok = login_alertDialog.findViewById(R.id.ok_button);

        errorMessage.setText("error"); //if wanted
        dialog.setView(login_alertDialog);
        AlertDialog alertDialog = dialog.create();
        ok.setOnClickListener(view -> alertDialog.dismiss());
        alertDialog.show();
    }
}