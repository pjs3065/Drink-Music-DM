package org.androidtown.md;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    ScrollView scrollView;
    TextView booking;
    Button find;
    TextView bookingcon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        scrollView = (ScrollView)findViewById(R.id.scrollView);
        booking = (TextView)findViewById(R.id.booking);
        find = (Button)findViewById(R.id.button1);
        bookingcon2 = (TextView)findViewById(R.id.bookingcon2);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                booking.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.VISIBLE);
            }
        });

        bookingcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"클릭하신 노래가 예약되었습니다.",Toast.LENGTH_SHORT).show();
                finish();
           
            }
        });



    }
}
