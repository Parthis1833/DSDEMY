package com.example.dsdemy;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.LOGOtext);

        String text = "DSDEMY";
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan green = new ForegroundColorSpan(Color.parseColor("#FF7C9C"));
        spannableString.setSpan(green, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
    }
}