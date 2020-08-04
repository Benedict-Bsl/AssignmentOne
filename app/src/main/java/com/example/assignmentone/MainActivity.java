package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignmentone.Utils;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateTheme(this);
        setContentView(R.layout.activity_main);
    }

    public void startThemeOne(View view){
        Utils.changeTheme(this, Utils.THEME_ONE);
    }

    public void startThemeTwo(View view){
        Utils.changeTheme(this, Utils.THEME_TWO);
    }

    public void startThemeThree(View view){
        Utils.changeTheme(this, Utils.THEME_THREE);
    }

}