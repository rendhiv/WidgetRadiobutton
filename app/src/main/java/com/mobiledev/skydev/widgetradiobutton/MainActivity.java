package com.mobiledev.skydev.widgetradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements RadioGroup.OnCheckedChangeListener {
    RadioButton rb1,rb2;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup)findViewById(R.id.rg);
        rb1 = (RadioButton)findViewById(R.id.rbbaso);
        rb2 = (RadioButton)findViewById(R.id.rbMie);
        rg.setOnCheckedChangeListener(this);

    }

    public void onCheckedChanged(RadioGroup group,
                                 int checkedId) {
        if(checkedId==R.id.rbbaso)
        {
            Toast.makeText(this, "Anda Membeli Baso Tahu",
                    Toast.LENGTH_SHORT).show();

        }
        if(checkedId==R.id.rbMie)
        {
            Toast.makeText(this, "Anda Membeli Mie Ayam", Toast.LENGTH_SHORT).show();
        }

    }
}