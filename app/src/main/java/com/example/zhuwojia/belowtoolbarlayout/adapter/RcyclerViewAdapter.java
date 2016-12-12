package com.example.zhuwojia.belowtoolbarlayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhuwojia.belowtoolbarlayout.R;

import java.util.List;

/**
 * Created by zhuwojia on 2016/12/12.
 */

public class RcyclerViewAdapter extends RecyclerView.Adapter<RcyclerViewAdapter.MyAdapter> {

    private List<String> list;
    private Context context;
    private LayoutInflater inflater;

    public RcyclerViewAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_show, parent, false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter holder, int position) {
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyAdapter extends RecyclerView.ViewHolder {

        private TextView textView;

        public MyAdapter(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
