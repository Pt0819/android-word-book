package com.example.exp2;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

import static com.example.exp2.R.*;

public class listwordsFragment extends Fragment {
    static final String TAG = "listwordsFragment";
    private ArrayList<String> listwords;
    private ListView listView;

    public listwordsFragment() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listwords_fragment , container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<Words> names = null;
        names = ((MainActivity)getActivity()).getWordsList();
        final String[] words = new String[names.size()];
        final String[] means = new String[names.size()];
        final String[] example = new String[names.size()];
        for(int i =0;i < names.size();i++) {
            words[i] = names.get(i).getWord();
            means[i] = names.get(i).getMeanings();
            example[i] = names.get(i).getExS();
            Log.d(TAG,words[i]);
        }

//        listView = (ListView)getView().findViewById(id.listWords);
//        final List<Words> finalNames = names;
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                FragmentManager fm = ((MainActivity) getActivity()).getSupportFragmentManager();
//                tv1Fragment fragment = (tv1Fragment) fm.findFragmentById(id.tv1_Fragment);
//                fragment.setText(means[i]);
//                fragment.setText(example[i]);
//
//            }
//        });

    }



}
