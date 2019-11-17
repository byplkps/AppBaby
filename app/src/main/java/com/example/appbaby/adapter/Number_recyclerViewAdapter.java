package com.example.appbaby.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appbaby.InAlphaNumber;
import com.example.appbaby.R;
import com.example.appbaby.model.Number;

import java.util.List;

public class Number_recyclerViewAdapter extends RecyclerView.Adapter<Number_recyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private int mResource;
    private List<Number> mNumberList;

    public Number_recyclerViewAdapter(Context mContext, int mResource, List<Number> mNumberList) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mNumberList = mNumberList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Number number = mNumberList.get(position);

        holder.number = number;
        holder.categoryTextView.setText(number.category);
        holder.descriptionTextView.setText(number.description);
        holder.numberImageView.setImageResource(number.imageRes);
    }

    @Override
    public int getItemCount()
    {
        return mNumberList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView numberImageView;
        private TextView categoryTextView;
        private TextView descriptionTextView;

        public Number number;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.numberImageView = itemView.findViewById(R.id.logo_image_view);
            this.categoryTextView = itemView.findViewById(R.id.category_name_text_view);
            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, InAlphaNumber.class);
                    intent.putExtra("category", number.category);
                    intent.putExtra("description",number.description);
                    intent.putExtra("image", number.imageRes);
                    mContext.startActivity(intent);
                }
            });
        }
    }



}
