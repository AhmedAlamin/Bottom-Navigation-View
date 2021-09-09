package com.engahmedegypto.task1.pojo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.engahmedegypto.task1.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{



    private Context mcontext;
    private List<item> mData;

    public RecyclerAdapter(Context mcontext, List<item> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mcontext);
        view = mInflater.inflate(R.layout.item_layout,parent,false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.main.setImageResource(mData.get(position).getMainImage());
        holder.starImage.setImageResource(mData.get(position).getStare());

    }

    public void setItems(List<item> data) {
        this.mData = data;
    }


    @Override
    public int getItemCount() {

        return mData.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView starImage;
        CircleImageView main;



        public MyViewHolder (View itemView){
            super(itemView);

            starImage = (ImageView) itemView.findViewById(R.id.imageid);
            main = (CircleImageView)itemView.findViewById(R.id.circle2);


        }
    }
}
