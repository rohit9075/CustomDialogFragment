package com.rohit.android.dialogs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab == null) throw new AssertionError();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog() {


        // DataEntryDialog object
        DataEntryDialog dataEntryDialog = new DataEntryDialog();

        // Prohibiting dialog to disappear when thouch outside the dialog
        dataEntryDialog.setCancelable(false);

        // Showing the dialog using show method
        dataEntryDialog.show(getSupportFragmentManager(), "DIALOG_FRAGMENT");

    }

}
