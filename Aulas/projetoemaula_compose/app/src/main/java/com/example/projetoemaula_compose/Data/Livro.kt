package com.example.projetoemaula_compose.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "livro_table")
data class Livro(
    @PrimaryKey(autoGenerate = true) // autoincrement
    val id: Int,
    val nome: String,
    val ano: String
)
