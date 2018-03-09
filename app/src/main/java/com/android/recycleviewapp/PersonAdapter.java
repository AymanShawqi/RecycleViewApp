package com.android.recycleviewapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder>{
    private LayoutInflater mInflater;
    private ArrayList<Person> mPersonList;
    private Context mContext;

    public PersonAdapter(Context context,ArrayList<Person> personList){
        mContext=context;
        mInflater=LayoutInflater.from(context);
        mPersonList=personList;
    }
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=mInflater.inflate(R.layout.list_item,parent,false);
        return new PersonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, final int position) {
        final Person person=mPersonList.get(position);
       final String name=person.getName();
        int age=person.getAge();
        holder.nameTextView.setText(name);
        holder.ageTextView.setText(String.valueOf(age));

    }

    @Override
    public int getItemCount() {
        return mPersonList.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView nameTextView;
        TextView ageTextView;
        public PersonViewHolder(View itemView) {
        super(itemView);
        nameTextView=itemView.findViewById(R.id.name);
        ageTextView=itemView.findViewById(R.id.age);
        itemView.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {
            Toast.makeText(mContext,String.valueOf(getAdapterPosition()),Toast.LENGTH_SHORT).show();
        }
    }
}
