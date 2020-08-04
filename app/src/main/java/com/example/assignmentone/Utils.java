package com.example.assignmentone;

import android.app.Activity;
import android.content.Intent;

public class Utils {

    private static int sTHEME;
    public final static int THEME_ONE = 0;
    public final static int THEME_TWO = 1;
    public final static int THEME_THREE = 2;

    public static void changeTheme(Activity activity, int theme){

        sTHEME = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void onActivityCreateTheme(Activity activity){

        switch (sTHEME){

            default:
            case THEME_ONE:
                activity.setTheme(R.style.SecondTheme);
                break;
            case THEME_TWO:
                activity.setTheme(R.style.ThirdTheme);
                break;
            case THEME_THREE:

                activity.setTheme(R.style.FourthTheme);
                break;

        }
    }
}
