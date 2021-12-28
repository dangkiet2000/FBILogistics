package com.example.demoapp.view.detail;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demoapp.R;
import com.example.demoapp.constant.Constant;
import com.example.demoapp.databinding.FragmentAirDialogBinding;
import com.example.demoapp.model.Log;


public class FragmentAirDetail extends DialogFragment {

    private FragmentAirDialogBinding mAirDialogBinding;
    private Bundle bundle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mAirDialogBinding = FragmentAirDialogBinding.inflate(inflater, container, false);
        View view = mAirDialogBinding.getRoot();

        bundle = getArguments();
        if (bundle != null) {
            Log log = (Log) bundle.getSerializable(Constant.LOG_OBJECT);
//            mAirDialogBinding.tvRowPric.setText(log.getStt());


        }
        return view;
    }
}