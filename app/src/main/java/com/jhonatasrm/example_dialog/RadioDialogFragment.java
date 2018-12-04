package com.jhonatasrm.example_dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class RadioDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{

    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder( getActivity() )
                .setTitle(R.string.choose)
                .setSingleChoiceItems(R.array.bands, 1, this)
                .create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        String[] bands = getActivity().getResources().getStringArray(R.array.bands);
        String band = bands[which];
        Toast.makeText(getActivity(), "You chose the band " + band + “of number ”+ which, Toast.LENGTH_LONG).show();
    }
}
