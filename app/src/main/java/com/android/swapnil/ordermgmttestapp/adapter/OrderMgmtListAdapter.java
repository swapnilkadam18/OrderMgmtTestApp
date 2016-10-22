package com.android.swapnil.ordermgmttestapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.swapnil.ordermgmttestapp.R;

import java.util.List;

/**
 * Created by swapnil on 22/10/2016.
 */

public class OrderMgmtListAdapter extends RecyclerView.Adapter<OrderMgmtListAdapter.ViewHolder> {

    private List<String> mDummyList;

    public OrderMgmtListAdapter(List<String> myDummyList) {
        mDummyList = myDummyList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView orderId;
        private TextView customerName;
        private TextView orderStatus;

        public ViewHolder(View itemView) {
            super(itemView);
            orderId = (TextView) itemView.findViewById(R.id.orderId);
            customerName = (TextView) itemView.findViewById(R.id.customerName);
            orderStatus = (TextView) itemView.findViewById(R.id.orderStatus);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(OrderMgmtListAdapter.ViewHolder holder, int position) {
        holder.orderId.setText("0001234");
        holder.customerName.setText("Swapnil Kadam");
        holder.orderStatus.setText("P");
    }

    @Override
    public int getItemCount() {
        return mDummyList.size();
    }
}
