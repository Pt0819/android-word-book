package com.example.exp2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class tv1Fragment extends Fragment {
    static final String TAG = "tv1Fragment";
    private TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tv1_fragment , container, false);
        textView =(TextView)view.findViewById(R.id.tv1_Fragment);
        return view;
    }

    public void setText(String content){
        textView.setText(content);
    }
}
