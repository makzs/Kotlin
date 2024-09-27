package com.example.aula_banco

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabela_Livro")
data class Livro(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val nome : String,
    val ano : Int
)
