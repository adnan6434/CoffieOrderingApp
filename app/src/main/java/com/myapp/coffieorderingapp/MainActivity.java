package com.myapp.coffieorderingapp;

import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
int quantity=0;
    int price=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void plusclick(View v)
   {
       quantity++;
       TextView Quantitytextview=(TextView)findViewById(R.id.Amounttextview);
       Quantitytextview.setText(quantity + " ");
   }
    public void minusclick(View v)
    {
        if(quantity>0){
            quantity--;
        }

        TextView Quantitytextview=(TextView)findViewById(R.id.Amounttextview);
        Quantitytextview.setText(quantity+" ");
    }
    public void orderclick(View v)
    {
        price=quantity*5;
        TextView totalprice=(TextView) findViewById(R.id.pamounttextview);
        totalprice.setText(price+" ");
    }

}
