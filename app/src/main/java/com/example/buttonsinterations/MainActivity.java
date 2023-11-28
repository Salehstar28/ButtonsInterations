package com.example.buttonsinterations;


import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textViewLow;
    private TextView android;

    ImageButton image;

    private void Handlerdelay(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                android.setVisibility(View.INVISIBLE);
                image.setVisibility(View.VISIBLE);

            }
        },2600);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        textViewLow = findViewById(R.id.textViewLow);
        android = findViewById(R.id.android);

        image = findViewById(R.id.image);


        ImageButton image = findViewById(R.id.image);
        Button TopLeft = findViewById(R.id.TopLeft);
        Button TopRight = findViewById(R.id.TopRight);
        Button BottomLeft = findViewById(R.id.BottomLeft);
        Button BottomRight = findViewById(R.id.BottomRight);



        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.activity_toast, (ViewGroup) findViewById(R.id.toasttop));

                TextView text = layout.findViewById(R.id.tmessage);

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER, 0, 0);
                text.setText("Android Button Clicked!");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
                android.setVisibility(View.VISIBLE);
                image.setVisibility(View.INVISIBLE);
                Handlerdelay();
            }
        });


        TopLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.activity_toast, (ViewGroup) findViewById(R.id.toasttop));

                TextView text = layout.findViewById(R.id.tmessage);

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                text.setText("Top left Button Clicked!");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
        });

        TopRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.activity_toast, (ViewGroup) findViewById(R.id.toasttop));

                TextView text = layout.findViewById(R.id.tmessage);

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                text.setText("Top Right Button Clicked!");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
        });


        BottomLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.activity_toast, (ViewGroup) findViewById(R.id.toasttop));

                TextView text = layout.findViewById(R.id.tmessage);

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 500);
                text.setText("Bottom Left Button Clicked!");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
        });

        BottomRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.activity_toast, (ViewGroup) findViewById(R.id.toasttop));

                TextView text = layout.findViewById(R.id.tmessage);

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 500);
                text.setText("Bottom Right Button Clicked!");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
        });
    }

}






