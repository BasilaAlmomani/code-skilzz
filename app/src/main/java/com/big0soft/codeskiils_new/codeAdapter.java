package com.big0soft.codeskiils_new;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class codeAdapter extends RecyclerView.Adapter<codeAdapter.ViewHolder> {
    private final ArrayList<Course> code_list;

    public codeAdapter(ArrayList<Course> code_list) {
        this.code_list = code_list;
    }

    private static final String TAG = "codeAdapter";
    @NonNull
    @Override
    public codeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull codeAdapter.ViewHolder holder, int position) {
        Course course = code_list.get(position);
        Log.i(TAG, "onBindViewHolder: " + course);
        holder.code_item.setText(course.getCourseName());

        Picasso.get().load(course.getImageUrl())
                .into(holder.imageview);
    }




    public void addItems(List<Course> Courses) {
        int startPosition = code_list.size();
        code_list.addAll(Courses);
        notifyItemRangeInserted(startPosition, Courses.size());
    }
    @Override
    public int getItemCount() {
        return code_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         ImageView imageview;
         TextView code_item;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview=itemView.findViewById(R.id.image);
            code_item=itemView.findViewById(R.id.items);


        }
    }


}
