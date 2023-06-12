package com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.use_case


import com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.model.Note
import com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.repository.NoteRepository
import com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.util.NoteOrder
import com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(
    private val repository: NoteRepository
) {
    //use_cases should only have one public function
    operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OrderType.Decending)): Flow<List<Note>>{
        return repository.getNotes().map {notes ->
            when(noteOrder.orderType){
                is OrderType.Ascending ->{
                    when(noteOrder){
                        is NoteOrder.Title-> notes.sortedBy {
                            it.title.lowercase()
                        }
                        is NoteOrder.Date-> notes.sortedBy {
                            it.timeStamp
                        }
                        is NoteOrder.Color->notes.sortedBy {
                            it.color
                        }
                    }

                }
                is OrderType.Decending ->{
                    when(noteOrder){
                        is NoteOrder.Title-> notes.sortedByDescending {
                            it.title.lowercase()
                        }
                        is NoteOrder.Date-> notes.sortedByDescending {
                            it.timeStamp
                        }
                        is NoteOrder.Color->notes.sortedByDescending {
                            it.color
                        }
                    }
                }
            }
        }
    }
}