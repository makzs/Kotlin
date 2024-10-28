package com.example.projetoemaula_compose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projetoemaula_compose.Telas.TelaDetalhes
import com.example.projetoemaula_compose.Telas.TelaMenu

@Composable
fun LivroNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "menu") {
        composable("menu") {
            TelaMenu(navController)
        }
        composable("detalhes/{nomeLivro}") {
            val nomeLivro = it.arguments?.getString("nomeLivro")
            TelaDetalhes(navController, nomeLivro)
        }
    }
}