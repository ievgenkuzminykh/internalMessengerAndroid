package com.example.geka.permittowork;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kuzeu.
 */

public class Messenger extends AppCompatActivity {
    AlertDialog.Builder ADB;
    Messenger(Context context, String Title, String Message, int ico){
        ADB = new AlertDialog.Builder(context);
        ADB.setTitle(Title);
        ADB.setCancelable(false);
        ADB.setMessage(Message);
        ADB.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ADB.setIcon(ico);
        ADB.show();
    }



}
