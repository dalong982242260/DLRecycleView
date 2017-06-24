package com.dl.recycleviewdemo;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private HorAdapter adapter;
    private List<People> mDatas;
    private Context mContext;

    public MainAdapter(Context context, List<People> datas) {
        this.mContext = context;
        this.mDatas = datas;
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_view, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.rvName.setText(mDatas.get(position).name);
        adapter.updataData(mDatas.get(position).imgUrl);
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView rvName;
        RecyclerView rvHorizontal;
        LinearLayoutManager layoutManager;

        public ViewHolder(View itemView) {
            super(itemView);
            rvHorizontal = (RecyclerView) itemView.findViewById(R.id.rv_horizontal);
            rvName = (TextView) itemView.findViewById(R.id.rv_tv);
            layoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
            rvHorizontal.setLayoutManager(layoutManager);
            adapter = new HorAdapter(mContext);
            rvHorizontal.setAdapter(adapter);
        }

    }
}
