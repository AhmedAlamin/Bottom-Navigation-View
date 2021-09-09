package com.engahmedegypto.task1.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.engahmedegypto.task1.R;
import com.engahmedegypto.task1.pojo.RecyclerAdapter;
import com.engahmedegypto.task1.pojo.item;

import java.util.ArrayList;
import java.util.List;


public class TempletsFragment extends Fragment {


    Button all,logo;
    LinearLayout temp1,logolayout,temp2;
    TextView logoextend;
    GridLayout GridLayout2 ;
    RecyclerView recyclerview;
    List<item> items;
    boolean isClicked = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_templets, container, false);

        all = (Button) v.findViewById(R.id.all);
        logo = (Button) v.findViewById(R.id.logo);
        temp1 = (LinearLayout) v.findViewById(R.id.neon_templets1);
        logolayout = (LinearLayout) v.findViewById(R.id.neon_templets2);
        temp2 = (LinearLayout) v.findViewById(R.id.neon_templets2);
        logoextend = (TextView) v.findViewById(R.id.logoextend);
        recyclerview = (RecyclerView) v.findViewById(R.id.recyclerview);


        items = new ArrayList<>();

        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));
        items.add(new item(R.drawable.star,R.drawable.imm));



        List<item> pending = new ArrayList<>();
        for (int i = 0 ; i<8;i++){
            pending.add(items.get(i));
        }

        RecyclerAdapter myAdapter = new RecyclerAdapter(getContext(),pending);
        recyclerview.setLayoutManager(new GridLayoutManager(getContext(), 4));


        recyclerview.setAdapter(myAdapter);



        logoextend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isClicked == false) {
//
//                    RecyclerAdapter myAdapter = new RecyclerAdapter(getContext(), items);
//                    recyclerview.setLayoutManager(new GridLayoutManager(getContext(), 4));

                    myAdapter.setItems(items);
                    myAdapter.notifyDataSetChanged();
                    recyclerview.setAdapter(myAdapter);

                    isClicked = true;
                    logoextend.setText("^ 0 more");

                }else if( isClicked == true) {

                        pending.clear();

                    for (int i = 0 ; i<8;i++){
                        pending.add(items.get(i));
                    }

                    myAdapter.setItems(pending);
                    myAdapter.notifyDataSetChanged();
                    recyclerview.setAdapter(myAdapter);



                    isClicked = false;
                    logoextend.setText("⌄ 150 more");

                }
            }
        });




        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1.setVisibility(View.VISIBLE);
                temp2.setVisibility(View.VISIBLE);
                logo.setVisibility(View.VISIBLE);
            }
        });





        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1.setVisibility(View.GONE);
                temp2.setVisibility(View.GONE);
                logo.setVisibility(View.VISIBLE);
            }
        });




        return v;
    }
}
