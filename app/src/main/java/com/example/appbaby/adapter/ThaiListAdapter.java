package com.example.appbaby.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import com.example.appbaby.R;
import com.example.appbaby.model.Thai;

public class ThaiListAdapter extends ArrayAdapter<Thai> {

    private Context mContext;
    private int mResource;
    private List<Thai> mThaiList;

    public ThaiListAdapter(@NonNull Context context, int resource, @NonNull List<Thai> thaiList) {
        super(context, resource, thaiList);
        this.mContext = context;
        this.mResource = resource;
        this.mThaiList = thaiList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // ทำการ Inflate layout
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = convertView;
        if (v == null) {
            v = inflater.inflate(mResource, parent, false);
        }

        // เข้าถึงออบเจ็ค Thai ตาม position ที่ ListView ขอมา
        Thai Thai = mThaiList.get(position);

        // กำหนดชื่อสถานที่ลงใน TextView (category_name_text_view)
        TextView thaiTextView = v.findViewById(R.id.category_name_text_view);
        thaiTextView.setText(Thai.category);

        // กำหนดชื่ออำเภอลงใน TextView (description_text_view)
       // TextView districtTextView = v.findViewById(R.id.description_text_view);
        //districtTextView.setText("รายละเอียด".concat(Thai.description));

        ImageView logoImageView = v.findViewById(R.id.logo_image_view);
        logoImageView.setImageResource(Thai.imageRes);

        return v;
    }






}








