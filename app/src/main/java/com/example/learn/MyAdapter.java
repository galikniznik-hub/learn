package com.example.learn;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public abstract class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList <Item> mData;
    public MyAdapter(ArrayList <Item> data, ImageView ivImage, TextView tvText1, TextView tvText2){
        mData = data;
        this.ivImage = ivImage;
        this.tvText1 = tvText1;
        this.tvText2 = tvText2;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    ;
    public final ImageView ivImage;
    public final TextView tvText1;
    public final TextView tvText2;
    public ViewHolder (View itemView){
        super(itemView);
        ivImage = itemView.findViewById(R.id.imageView);
        tvText1 = itemView.findViewById(R.id.textView1);
        tvText2 = itemView.findViewById(R.id.textView2);

    }
}
@NonNull
@Override
public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

}