package com.vacuum.app.sortarrays;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Home on 10/16/2017.
 */

public class ListAdapter extends ArrayAdapter<Dog> {

    private List<Dog> items;
    Context context;

    public ListAdapter(Context context, int textViewResourceId, List<Dog> items) {
        super(context, textViewResourceId, items);
        this.items = items;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.activity_listview, null);
        }

        Dog item = items.get(position);

        if (item != null) {
            TextView name =  v.findViewById(R.id.name);
            TextView age =  v.findViewById(R.id.age);
            if (name != null) {
                name.setText(item.getDogName());
            }
            if (age != null) {
                age.setText(String.valueOf(item.getDogAge()));
            }
        }

        return v;
    }
}