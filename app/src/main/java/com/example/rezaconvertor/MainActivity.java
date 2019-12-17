package com.example.rezaconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout RelativeLayoutCurrency,RelativeLayoutLength,RelativeLayoutNumber,RelativeLayoutWord,RelativeLayoutPressure,RelativeLayoutTemparature,RelativeLayoutTime,RelativeLayoutWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayoutCurrency=findViewById(R.id.currencyRelativeLayout);
        RelativeLayoutLength=findViewById(R.id.lengthRelativeLayout);
        RelativeLayoutNumber=findViewById(R.id.numberRelativeLayout);
        RelativeLayoutWord=findViewById(R.id.wordRelativeLayout);
        RelativeLayoutPressure=findViewById(R.id.pressureRelativeLayout);
        RelativeLayoutTemparature=findViewById(R.id.temparatureRelativeLayout);
        RelativeLayoutTime=findViewById(R.id.timeRelativeLayout);
        RelativeLayoutWeight=findViewById(R.id.weigthRelativeLayout);


        RelativeLayoutCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ConvertOneToAnother.class);
                startActivity(intent);
            }
        });
        RelativeLayoutLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),LengthActivity.class);
                startActivity(intent);
//                Toast toast=new Toast(getApplicationContext());
//                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
//                toast.setDuration(Toast.LENGTH_LONG);
//                toast.show();
            }
        });
        RelativeLayoutNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),NumberConvert.class);
                startActivity(intent);
            }
        });
        RelativeLayoutWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),WordConvertActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayoutPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),PressureConvertActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayoutTemparature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TemparatureConvertActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayoutTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TimeConvertActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayoutWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),WeightConvertActivity.class);
                startActivity(intent);
            }
        });

    }

}
