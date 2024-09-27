package com.example.aula_banco

import androidx.lifecycle.LiveData

class LivroRepository(private val livroDao: LivroDAO) {
    val readAllData : LiveData<List<Livro>> = livroDao.readAllData()

    suspend fun addLivro(livro: Livro){
        livroDao.addLivro(livro)
    }
}