package com.dl.recycleviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class HorAdapter extends RecyclerView.Adapter<HorAdapter.ViewHolder> {

    private List<String> mDatas;
    private Context mContext;

    public HorAdapter(Context context) {
        this.mContext = context;
    }

    public void updataData(List<String> data) {
        this.mDatas = data;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_item_view, parent, false));
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(mContext)
                .load(mDatas.get(position))
                .into(holder.img);
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.item_item_img);
            name = (TextView) itemView.findViewById(R.id.item_item_name);
        }
    }
}
