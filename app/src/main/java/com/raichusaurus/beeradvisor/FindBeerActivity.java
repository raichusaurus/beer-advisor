package com.raichusaurus.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // call when the user clicks the button
    public void onClickFindBeer(View view) {

        // get a reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        // get a reference to the text view
        TextView brands = (TextView) findViewById(R.id.brands);

        // get the selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem());

        brands.setText(beerType);
    }
}
