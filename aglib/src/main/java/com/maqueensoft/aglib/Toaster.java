package com.maqueensoft.aglib;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void agToastLong(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void agToastShort(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }


}
