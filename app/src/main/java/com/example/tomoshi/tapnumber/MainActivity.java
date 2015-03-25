package com.example.tomoshi.tapnumber;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

        //関連付け
        textView=(TextView)findViewById(R.id.textView);
        //start関数の実行
        start();
    }

    public void start() {
        //hairetsuという変数にrandomに1から4までの数字を入れる
        hairetsu=new int[4];
        Random rand=new Random();
        hairetsu[0]=rand.nextInt(4)+1;
        hairetsu[1]=rand.nextInt(4)+1;
        hairetsu[2]=rand.nextInt(4)+1;
        hairetsu[3]=rand.nextInt(4)+1;

        //hairets
        mondai=
                Integer.toString(hairetsu[0])
                + Integer.toString(hairetsu[1])
                + Integer.toString(hairetsu[2])
                + Integer.toString(hairetsu[3]);
        textView.setText(mondai);
        seikai=0;

    }
    //1をタップ
    public void number1(View v){
        if(hairetsu[seikai] == 1) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        }else{
            Toast.makeText(this,"数字が違うよ",Toast.LENGTH_SHORT).show();
        }
    }
    //2をタップ
    public void number2(View v){
        if(hairetsu[seikai] == 2) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        }else{
            Toast.makeText(this,"数字が違うよ",Toast.LENGTH_SHORT).show();
        }
    }
    //3をタップ
    public void number3(View v){
        if(hairetsu[seikai] == 3) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        }else{
            Toast.makeText(this,"数字が違うよ",Toast.LENGTH_SHORT).show();
        }
    }
    //4をタップ
    public void number4(View v){
        if(hairetsu[seikai] == 4) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        }else{
            Toast.makeText(this,"数字が違うよ",Toast.LENGTH_SHORT).show();
        }
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
