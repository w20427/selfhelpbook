package com.amitwc.selfhelppdfbooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    CardView IvTimeManagement;
    CardView AtomicHb;
    CardView ikiGai;
    CardView Subtle;
    CardView richDad;
    CardView winFriend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       IvTimeManagement = findViewById(R.id.cardTime);
        IvTimeManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TimeManagement.class);
                startActivity(intent);
            }
        });

        AtomicHb =findViewById(R.id.imgAtomichabbits);
        AtomicHb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AtomicHabbits.class);
                startActivity(intent);
            }
        });



        ikiGai =findViewById(R.id.cardIkigai);
        ikiGai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IkigaiBook.class);
                startActivity(intent);
            }
        });

        Subtle =findViewById(R.id.cardSubtle);
        Subtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SubtleArt.class);
                startActivity(intent);
            }
        });

        richDad =findViewById(R.id.cardRich);
        richDad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RichDad.class);
                startActivity(intent);
            }
        });

        winFriend =findViewById(R.id.cardWinaFriend);
        winFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),WinFriend.class);
                startActivity(intent);
            }
        });



    }
}