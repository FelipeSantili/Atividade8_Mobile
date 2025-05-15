package com.example.exadapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetaAdapter extends RecyclerView.Adapter<PlanetaAdapter.ViewHolder> {

    private final List<Planeta> localDataSet;

    public PlanetaAdapter(List<Planeta> localDataSet) {
        this.localDataSet = localDataSet;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_row_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Planeta planeta = localDataSet.get(position);
        holder.getImageView().setImageResource(planeta.img);
        holder.getTextView().setText(planeta.nome);
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView textView;
        private final ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtPlaneta);
            imageView = itemView.findViewById(R.id.imgPlaneta);

            itemView.setOnClickListener(this);
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return imageView;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(imageView.getContext(),
                    "Planeta: " + textView.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
