package com.elitecodecamp.cleanarchitecture_noteapp.feature_note.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Decending: OrderType()
}
