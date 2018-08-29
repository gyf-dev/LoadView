package com.gyf.sample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author geyifeng
 * @date 2018/8/29 下午12:05
 */
public class RecordAdapter extends RecyclerView.Adapter<RecordAdapter.RecordViewHolder> {

    private List<String> mData = new ArrayList<>();

    @NonNull
    @Override
    public RecordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new RecordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_load_record, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecordViewHolder holder, int i) {
        holder.textView.setText(mData.get(i));
        if (i == 0) {
            holder.point.setVisibility(View.GONE);
        } else {
            holder.point.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setData(List<String> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    public void addData(String data) {
        mData.add(data);
        notifyDataSetChanged();
    }

    static class RecordViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;
        private final View point;

        RecordViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            point = itemView.findViewById(R.id.point);
        }
    }
}
