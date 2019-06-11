package com.yuyang.githubtestdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   private TextView tv;
   private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);

        tv.setOnClickListener(this);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {



        switch (view.getId()){
            case R.id.tv:
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case R.id.btn:
                Toast.makeText(MainActivity.this, "Button", Toast.LENGTH_SHORT).show();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

                default:break;

        }

    }
}
