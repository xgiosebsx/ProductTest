package com.seratic.enterprise.productstest.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.seratic.enterprise.productstest.MainActivity;
import com.seratic.enterprise.productstest.R;
import com.seratic.enterprise.productstest.model.Product;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    TextView name;
    TextView price;
    TextView brand;

    Product product;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        name = (TextView) v.findViewById(R.id.name_detail);
        price = (TextView) v.findViewById(R.id.price_detail);
        brand = (TextView) v.findViewById(R.id.brand_detail);

        product = MainActivity.productS;

        name.setText("Nombre del producto: "+product.getName().toString());
        price.setText("Precio del producto: "+product.getPrice().toString());
        brand.setText("Marca del producto: "+product.getBrand().toString());
        // Inflate the layout for this fragment

        return v;
    }

}
