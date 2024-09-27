package com.example.aula_banco

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LivroDAO {

    // Insert into Livro Values
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addLivro(livro : Livro)

    @Query("SELECT * FROM tabela_Livro ORDER BY id ASC")
    fun readAllData(): LiveData<List<Livro>>
}