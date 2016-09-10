package com.seratic.enterprise.productstest.fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.seratic.enterprise.productstest.R;
import com.seratic.enterprise.productstest.adapter.ListProductsAdapter;
import com.seratic.enterprise.productstest.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {


    public interface ListFragmentI{
        void onProductSelected(Product product);
    }

    List<Product> data;
    ListView list;
    ListFragmentI listFragmentI;
    ListProductsAdapter adapter;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listFragmentI = (ListFragmentI) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        list = (ListView) v.findViewById(R.id.list);
        data = new ArrayList<>();
        Product product = new Product("Image","1000","Zapato alto","Nike");
        Product product2 = new Product("Image","5000","Zapato bajo","Nike");
        Product product3 = new Product("Image","6000","Zapato mediano","Nike");
        Product product4 = new Product("Image","7000","Zapato rojo","Nike");
        Product product5 = new Product("Image","8000","Zapato verde","Nike");
        Product product6 = new Product("Image","5000","Zapato bajo","Nike");
        Product product7 = new Product("Image","6000","Zapato mediano","Nike");
        Product product8 = new Product("Image","7000","Zapato rojo","Nike");
        Product product9 = new Product("Image","8000","Zapato verde","Nike");
        data.add(product);
        data.add(product2);
        data.add(product3);
        data.add(product4);
        data.add(product5);
        data.add(product6);
        data.add(product7);
        data.add(product8);
        data.add(product9);
        adapter = new ListProductsAdapter(data,v.getContext());
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);



        return v;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        listFragmentI.onProductSelected(data.get(position));
    }
}
