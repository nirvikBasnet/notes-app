package com.elitecodecamp.cleanarchitecture_noteapp.feature_note.presentation.notes

import android.provider.ContactsContract.CommonDataKinds.Note
import com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.util.NoteOrder
import com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Decending),
    val isOrderSectionVisible: Boolean = false
)
