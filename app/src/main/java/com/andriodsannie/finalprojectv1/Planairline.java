package com.andriodsannie.finalprojectv1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Planairline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planairline);

        Button nextbutton = (Button)findViewById(R.id.nextbutton);
        Button prev = (Button)findViewById(R.id.prev);
        final Button kayak = (Button)findViewById(R.id.kayak);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Planhotel.class);
                startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        kayak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("www.kayak.com.hk/Airplane-Tickets");
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                startActivity(webIntent);
            }
        });
    }
}
