package com.raichusaurus.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // call when the user clicks the button
    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("Gottle of geer");
    }
}
