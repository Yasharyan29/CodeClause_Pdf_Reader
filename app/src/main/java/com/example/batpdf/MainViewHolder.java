package com.example.batpdf;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder
{
    public TextView txtName;
    public CardView cardView;

    public MainViewHolder(@NonNull View itemView){
        super(itemView);

        txtName = itemView.findViewById(R.id.pdf_txtName);
        cardView = itemView.findViewById(R.id.pdf_cardView);

    }

}
