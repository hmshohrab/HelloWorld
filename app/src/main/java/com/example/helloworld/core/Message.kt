package com.example.helloworld.core

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Message {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
