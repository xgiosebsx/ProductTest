package com.seratic.enterprise.productstest.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.seratic.enterprise.productstest.R;
import com.seratic.enterprise.productstest.model.Product;

import java.util.List;

/**
 * Created by Administrador on 10/09/2016.
 */
public class ListProductsAdapter extends BaseAdapter {

    List<Product> data;
    Context context;

    public ListProductsAdapter(List<Product> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
      return  data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v;
        v = view;
        if (v == null){
            v = View.inflate(context, R.layout.template_products,null);
        }

        TextView product = (TextView) v.findViewById(R.id.product_name);
        product.setText(data.get(i).getName().toString());

        return v;
    }
}
