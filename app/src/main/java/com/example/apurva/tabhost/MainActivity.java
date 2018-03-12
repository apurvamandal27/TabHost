package com.example.apurva.tabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

   TabHost tabHost;
   TabHost.TabSpec tabSpec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost=findViewById(R.id.tabhost);

        tabHost.setup();//to create all the component of tabhost and reference

        //store reference of first tab
       tabSpec=tabHost.newTabSpec("");
       tabSpec.setIndicator("chat");
       tabSpec.setContent(R.id.tab1);
       tabHost.addTab(tabSpec);

        //store reference of second tab
        tabSpec=tabHost.newTabSpec("First Tab");
        tabSpec.setIndicator("Second");
        tabSpec.setContent(R.id.tab2);
        tabHost.addTab(tabSpec);

        //store reference of third tab
        tabSpec=tabHost.newTabSpec("First Tab");
        tabSpec.setIndicator("Third");
        tabSpec.setContent(R.id.tab3);
        tabHost.addTab(tabSpec);



    }
}
