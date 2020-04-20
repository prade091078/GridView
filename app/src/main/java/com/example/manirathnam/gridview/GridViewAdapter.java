package com.example.manirathnam.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by manirathnam on 22-11-2017.
 */

public class GridViewAdapter extends BaseAdapter{

    int[] animalImages = {R.drawable.bear, R.drawable.cow, R.drawable.dinosaur, R.drawable.frog, R.drawable.lion, R.drawable.monkey,
           R.drawable.ponda, R.drawable.tortoise, R.drawable.bird};

    String[] animalNames = {"Bear", "Cow", "Dinosaur", "Frog", "Lion", "Monkey",
            "Ponda", "Tortoise","Bird"};

    Context context;

    public GridViewAdapter(Context context)
    { this.context = context; }


    @Override
    public int getCount() {
        return animalImages.length;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ImageView imgView = new ImageView(context);
        imgView.setImageResource(animalImages[position]);
        imgView.setLayoutParams(new GridView.LayoutParams(200, 200));
        imgView.setPadding(10, 10, 10, 10);
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "The name of the animal is: " + animalNames[position], Toast.LENGTH_LONG).show();
            }

        });

        return imgView;
    }

    @Override
    public Object getItem(int position) {
        return animalImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
