package com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.elitecodecamp.cleanarchitecture_noteapp.ui.theme.BabyBlue
import com.elitecodecamp.cleanarchitecture_noteapp.ui.theme.LightGreen
import com.elitecodecamp.cleanarchitecture_noteapp.ui.theme.RedOrange
import com.elitecodecamp.cleanarchitecture_noteapp.ui.theme.RedPink
import com.elitecodecamp.cleanarchitecture_noteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: String,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
