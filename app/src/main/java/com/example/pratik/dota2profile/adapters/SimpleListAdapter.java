package com.example.pratik.dota2profile.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pratik.dota2profile.R;

import java.util.ArrayList;

/**
 * Created by pratik on 28-12-2015.
 */
public class SimpleListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<String> listOfHeroes;
    private TextView serialNoTextView, heroesNameTextView;

    public SimpleListAdapter(Activity activity, ArrayList<String> listOfHeroes){
        this.activity = activity;
        this.listOfHeroes = listOfHeroes;
    }

    @Override
    public int getCount() {
        return listOfHeroes.size();
    }

    @Override
    public String getItem(int i) {
        return listOfHeroes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View result;

        if (view == null) {
            result = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view_row,
                    viewGroup, false);
        } else {
            result = view;
        }
        Integer pos = i+1;
        serialNoTextView = (TextView) result.findViewById(R.id.serialNo);
        heroesNameTextView = (TextView) result.findViewById(R.id.heroesName);

        heroesNameTextView.setText(listOfHeroes.get(i).toString());
        serialNoTextView.setText(pos.toString());

        /*((TextView) result.findViewById(R.id.serialNo)).setText(i+1);
        ((TextView) result.findViewById(R.id.heroesName)).setText(listOfHeroes.get(i));*/

        return result;
    }
}
