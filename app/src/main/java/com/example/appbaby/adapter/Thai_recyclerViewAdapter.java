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

import com.example.appbaby.InAlphaThai;
import com.example.appbaby.R;
import com.example.appbaby.model.Thai;

import java.util.List;

public class Thai_recyclerViewAdapter extends RecyclerView.Adapter<Thai_recyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private int mResource;
    private List<Thai> mThaiList;

    public Thai_recyclerViewAdapter(Context mContext, int mResource, List<Thai> mThaiList) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mThaiList = mThaiList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Thai thai = mThaiList.get(position);

        holder.thai = thai;
        holder.categoryTextView.setText(thai.category);
        holder.descriptionTextView.setText(thai.description);
        holder.thaiImageView.setImageResource(thai.imageRes);
    }

    @Override
    public int getItemCount()
    {
        return mThaiList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView thaiImageView;
        private TextView categoryTextView;
        private TextView descriptionTextView;

        public Thai thai;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.thaiImageView = itemView.findViewById(R.id.logo_image_view);
            this.categoryTextView = itemView.findViewById(R.id.category_name_text_view);
            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, InAlphaThai.class);
                    intent.putExtra("category", thai.category);
                    intent.putExtra("description",thai.description);
                    intent.putExtra("image", thai.imageRes);
                    mContext.startActivity(intent);
                }
            });
        }
    }



}



