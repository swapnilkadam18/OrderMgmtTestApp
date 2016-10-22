package com.android.swapnil.ordermgmttestapp.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.swapnil.ordermgmttestapp.R;
import com.android.swapnil.ordermgmttestapp.adapter.OrderMgmtListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderMgmtFrag extends Fragment {

    private RecyclerView orderList;
    private OrderMgmtListAdapter adapter;

    public OrderMgmtFrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_mgmt, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //go to presenter
        List<String> myDummyList = new ArrayList<String>();
        for(int i = 0; i < 20; i++){
            myDummyList.add(""+i);
        }

        orderList = (RecyclerView) getView().findViewById(R.id.recycler_view);
        adapter = new OrderMgmtListAdapter(myDummyList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        orderList.setLayoutManager(mLayoutManager);
        orderList.addItemDecoration(new DividerItemDecoration(getActivity(),LinearLayoutManager.VERTICAL));
        orderList.setItemAnimator(new DefaultItemAnimator());
        orderList.setAdapter(adapter);
    }
}
