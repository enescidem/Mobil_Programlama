package com.example.notesappproject;

import androidx.cardview.widget.CardView;

import com.example.notesappproject.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
