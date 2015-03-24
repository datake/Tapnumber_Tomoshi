package com.example.tomoshi.tapnumber;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    int[] hairetsu;

    String mondai;

    int seikai;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
    }

    public void start() {
        hairetsu=new int[4];
        Random rand=new Random();
        hairetsu[0]=rand.nextInt(4)+1;
        hairetsu[1]=rand.nextInt(4)+1;
        hairetsu[2]=rand.nextInt(4)+1;
        hairetsu[3]=rand.nextInt(4)+1;

        mondai=
                Integer.toString(hairetsu[0])
                + Integer.toString(hairetsu[1])
                + Integer.toString(hairetsu[2])
                + Integer.toString(hairetsu[3])

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
