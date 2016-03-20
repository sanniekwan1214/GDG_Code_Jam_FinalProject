package com.andriodsannie.finalprojectv1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Planhotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planhotel);

        Button nextbutton = (Button)findViewById(R.id.nextbutton);
        Button prev = (Button)findViewById(R.id.prev);
        final Button trivago = (Button)findViewById(R.id.trivago);
        final Button hotelscom = (Button)findViewById(R.id.hotelscom);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Schedule.class);
                startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Planairline.class);
                startActivity(intent);
            }
        });

        trivago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.trivago.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                startActivity(webIntent);
            }
        });

        hotelscom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.hotels.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                startActivity(webIntent);
            }
        });
    }
}
