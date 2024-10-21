package com.example.seance4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends ArrayAdapter<Animal> {

    public CustomAdapter(Context context, List<Animal> animals) {
        super(context, 0, animals);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Animal currentAnimal = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewNom = convertView.findViewById(R.id.textViewNom);
        TextView textViewDescription = convertView.findViewById(R.id.textViewDescription);

        imageView.setImageResource(currentAnimal.getImage());
        textViewNom.setText(currentAnimal.getName());
        textViewDescription.setText(currentAnimal.getDescription());

        return convertView;
}
}
