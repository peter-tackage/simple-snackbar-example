package com.moac.android.sampleapplication;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * A simple example that uses a Button to open up a dismissable Snackbar
 */
public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the Activity's UI from XML layout .
        setContentView(R.layout.activity_sample);

        // Get a reference to the Button.
        final Button feedMeButton = (Button) findViewById(R.id.button_feedMe);

        // Add an action to be performed when the button is clicked.
        feedMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create and show a Snackbar UI component on the UI.
                final Snackbar snackbar = Snackbar.make(feedMeButton, "I'm a Snackbar!", Snackbar.LENGTH_LONG);
                snackbar.setAction(android.R.string.ok, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
        });
    }
}
