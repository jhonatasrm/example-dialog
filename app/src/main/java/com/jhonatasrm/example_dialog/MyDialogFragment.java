package com.jhonatasrm.example_dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{

    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.title)
                .setMessage(R.string.question)
                .setPositiveButton(R.string.yes, this)
                .setNegativeButton(R.string.no, this);
        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        if(which == DialogInterface.BUTTON_POSITIVE){
            Toast.makeText(getActivity(),"You chose YES", Toast.LENGTH_LONG).show();
        }else if(which == DialogInterface.BUTTON_NEGATIVE){
            Toast.makeText(getActivity(), "You chose NO", Toast.LENGTH_SHORT).show();
        }
    }
}
