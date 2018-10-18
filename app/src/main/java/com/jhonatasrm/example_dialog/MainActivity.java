package com.jhonatasrm.example_dialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {
        MyDialogFragment dialog = new MyDialogFragment();
        dialog.show(getSupportFragmentManager(),"dialog");
    }

    public void openSimple(View view) {
        SimpleDialogFragment dialogSimple = new SimpleDialogFragment();
        dialogSimple.show(getSupportFragmentManager(), "dialogSimple");
    }

    public void openRadio(View view) {
        RadioDialogFragment dialogRadio = new RadioDialogFragment();
        dialogRadio.show(getSupportFragmentManager(), "dialogRadio");
    }

    public void openCheck(View view) {
        CheckBoxDialogFragment dialogCheck = new CheckBoxDialogFragment();
        dialogCheck.show(getSupportFragmentManager(), "dialogCheck");
    }
}
