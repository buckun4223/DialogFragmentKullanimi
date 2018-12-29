package com.example.lab08.dialogfragmentkullanimi.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lab08.dialogfragmentkullanimi.R;

public class DialogSinifi extends DialogFragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.dialogfragment_layout,null);
        getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setCancelable(false);
        Button btn = v.findViewById(R.id.btnKapat);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return v;
    }
}
