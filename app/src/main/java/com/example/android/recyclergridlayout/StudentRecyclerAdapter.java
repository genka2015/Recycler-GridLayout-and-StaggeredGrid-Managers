package com.example.android.recyclergridlayout;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentRecyclerAdapter.ViewHolder>{
    private ArrayList<Student> students;
    private Context context;

    public StudentRecyclerAdapter(ArrayList<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.recycle_item,parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Student currentStudent = students.get(position);
        holder.studentImageView.setImageResource(R.drawable.img_putin);
        holder.studentNameTV.setText(currentStudent.getStudentName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView studentImageView;
        TextView studentNameTV;

        public ViewHolder(View itemView){
            super(itemView);
            studentImageView =(ImageView)itemView.findViewById(R.id.img_student);
            studentNameTV = (TextView)itemView.findViewById(R.id.tv_name);
        }
    }

}
