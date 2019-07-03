package com.example.incrementoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;
    int i = 1;
    int a[] = {R.color.blue, R.color.colorAccent, R.color.red, R.color.yellow, R.color.darkBlue, R.color.darkGrey, R.color.lightgreen, R.color.lightGrey, R.color.pink, R.color.smallLightGreen, R.color.darkCopy, R.color.Green, R.color.lightDarkRed, R.color.pinkCopy, R.color.pinkREd, R.color.pureYellow, R.color.yellowBlack, R.color.blue, R.color.paleGreen, R.color.pureYellow, R.color.pinkREd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        //oncreate() method is main activity of the android application from here only our program will execute
        super.onCreate(savedInstanceState);
        //setcontentView() method is used to import the xml file in java code
        setContentView(R.layout.activity_main);
        //here we are getting the text id by using the findviewById();
        text = (TextView) findViewById(R.id.text_view);
        //here we are getting the button id by using the findViewById();
        button = (Button) findViewById(R.id.button_view);
        //here we are calling the onclick() by using the setOnclickListener() when we click the button it will call the setOnclickListener() and
        // it will call onclickListener interface.
        final LinearLayout layout = (LinearLayout) findViewById(R.id.main_activity);


        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we can give the action when the button has been click
                if (i != 21) {
                    text.setText(String.valueOf(i));
                    text.setTextColor(getResources().getColor(a[i]));
                    layout.setBackgroundColor(a[a.length - i]);

                    i++;
                } else {
                    Toast.makeText(MainActivity.this, "warning message", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }

}
