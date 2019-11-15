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

import java.util.List;

import com.example.appbaby.InAlphaEng;
import com.example.appbaby.R;
import com.example.appbaby.model.Eng;

public class Eng_recyclerViewAdapter extends RecyclerView.Adapter<Eng_recyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private int mResource;
    private List<Eng> mEngList;

    public Eng_recyclerViewAdapter(Context mContext, int mResource, List<Eng> mEngList) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mEngList = mEngList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Eng eng = mEngList.get(position);

        holder.eng = eng;
        holder.categoryTextView.setText(eng.category);
        holder.descriptionTextView.setText(eng.description);
        holder.engImageView.setImageResource(eng.imageRes);
    }

    @Override
    public int getItemCount() {
        return mEngList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView engImageView;
        private TextView categoryTextView;
        private TextView descriptionTextView;

        private Eng eng;

        private MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.engImageView = itemView.findViewById(R.id.logo_image_view);
            this.categoryTextView = itemView.findViewById(R.id.category_name_text_view);
            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, InAlphaEng.class);
                    intent.putExtra("category", eng.category);
                    intent.putExtra("description", eng.description);
                    intent.putExtra("image", eng.imageRes);
                    mContext.startActivity(intent);
                }
            });
        }
    }

}
