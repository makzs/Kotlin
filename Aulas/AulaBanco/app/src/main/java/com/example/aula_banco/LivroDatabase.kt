package com.example.aula_banco

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Livro::class], version = 1, exportSchema = false)
abstract class LivroDatabase: RoomDatabase() {

    abstract fun livroDao(): LivroDAO

    companion object {
        private var INSTANCE: LivroDatabase? = null

        fun getDatabase(context: Context): LivroDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LivroDatabase::class.java,
                    "tabela_livro"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}