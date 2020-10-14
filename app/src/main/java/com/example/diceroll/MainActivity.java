package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button1);
        iv=findViewById(R.id.iv);
        final Random random=new Random();


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rn=random.nextInt(6)+1;

                if(rn==1)
                    iv.setImageResource(R.drawable.one);
                else if(rn==2)
                    iv.setImageResource(R.drawable.two);
                else if(rn==3)
                    iv.setImageResource(R.drawable.three);
                else if(rn==4)
                    iv.setImageResource(R.drawable.four);
                else if(rn==5)
                    iv.setImageResource(R.drawable.five);
                else
                    iv.setImageResource(R.drawable.six);
            }
        });


    }
}