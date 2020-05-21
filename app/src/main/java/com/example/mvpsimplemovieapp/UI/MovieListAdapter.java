package com.example.mvpsimplemovieapp.UI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvpsimplemovieapp.Models.MovieModel;
import com.example.mvpsimplemovieapp.R;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {
    private ArrayList<MovieModel> arrayList = new ArrayList<>();

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.name.setText(arrayList.get(position).getmMoviewName());
        holder.data.setText(arrayList.get(position).getmMoviewDate());
        holder.desc.setText(arrayList.get(position).getmMoviewDescription());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        TextView name, data, desc;


        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvname);
            data = itemView.findViewById(R.id.tvdate);
            desc = itemView.findViewById(R.id.tvdispcription);
        }
    }


    public void setArrayList(ArrayList<MovieModel> modelArrayList){
        this.arrayList = modelArrayList;
        notifyDataSetChanged();
    }
}
