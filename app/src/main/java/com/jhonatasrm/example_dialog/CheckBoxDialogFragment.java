package com.jhonatasrm.example_dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class CheckBoxDialogFragment extends DialogFragment implements DialogInterface.OnMultiChoiceClickListener{

    boolean[] checked = {true, false, false, true,false};

    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.choose)
                .setMultiChoiceItems(R.array.bands, checked,this)
                .create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
        String[] bands = getActivity().getResources().getStringArray(R.array.bands);
        String band = bands[which];

        if(isChecked){
            Toast.makeText(getActivity(), "You chose the band " + band, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getActivity(), "You didn't choose the band anymore " + band, Toast.LENGTH_LONG).show();
        }

    }
}
