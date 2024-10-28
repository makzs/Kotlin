package com.example.projetoemaula_compose.Telas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.w3c.dom.Text

//@Preview
@Composable
fun TelaDetalhes(navController: NavController, nomeLivro: String?) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "Livro: $nomeLivro")

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.popBackStack()
            }) {
                Text("Voltar")

            }
        }
    }
}