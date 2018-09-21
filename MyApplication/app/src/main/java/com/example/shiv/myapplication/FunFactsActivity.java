package com.example.shiv.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our view variables
    //private String[] facts = {"Shiv is the best","Shiv loves Agrima","Shiv will fight till the very end","Shiv will be patient","Shiv will try and keep getting better"};
    private FactBook factBook;
    private TextView mFactTextView;
    private Button mShowFactButton;
    //private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the views from the layout file to corresponding variables
        mFactTextView = findViewById(R.id.factTextView);
        mShowFactButton = findViewById(R.id.showFactButton);
        factBook = new FactBook();
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // The button was clicked, so update the fact TextView with a new fact


                //index = (index+1)%4;
                //Update the screen with new fact

                String fact = factBook.getFact();
                mFactTextView.setText(fact);
            }
        };

        mShowFactButton.setOnClickListener(listener);


    }
}
