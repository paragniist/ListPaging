package com.example.vinove.listpaging;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vinove on 22/2/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.VHolder> {


    ArrayList<String> data;
    Context context;

    public Adapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.items, parent, false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(VHolder holder, int position) {
            holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class VHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public VHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtItem);

        }
    }
}
