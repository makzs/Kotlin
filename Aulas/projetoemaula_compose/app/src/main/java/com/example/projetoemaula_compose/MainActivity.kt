package com.example.projetoemaula_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetoemaula_compose.Data.Livro
import com.example.projetoemaula_compose.Data.LivroDatabase
import com.example.projetoemaula_compose.ui.theme.Projetoemaula_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Projetoemaula_composeTheme {

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Projetoemaula_composeTheme {
        Surface (
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            shadowElevation = 10.dp,
            border = BorderStroke(0.5.dp, Color.LightGray),
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
        ) {

            InputNovoLivro()

            var livros = listOf(
                Livro(0, "O senhor dos aneis", "1954"),
                Livro(1, "Game of Thrones", "1997"),
                Livro(2, "Dom Quixote", "1685")
            )

            ListaDeLivros(livros = livros)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun InputNovoLivro(){

    var nome by remember { mutableStateOf("") }
    var ano by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(10.dp)
    ) {

        Text("Novo Livro: ", fontSize = 30.sp)

        Row (
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            OutlinedTextField(
                value = nome,
                onValueChange = {nome = it},
                label = { Text("Nome")},
                modifier = Modifier.weight(1f)
            )
            OutlinedTextField(
                value = ano,
                onValueChange = {ano = it},
                label = { Text("Ano")},
                modifier = Modifier.weight(1f)
            )
        }

        Button(onClick = {
            coroutlineScope.launch {
                val novoLivro = Livro(0, nome, ano)
                val contexto = LocalContext.current
                LivroDatabase.getDatabase(contexto).livroDao().addLivro(novoLivro)
            }
        }) {
            Text(text = "Criar Livro")
        }
    }
}

@Composable
fun CardLivro(livro: Livro){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column (
            modifier = Modifier.padding(6.dp)
        ) {
            Text(text = "ID: ${livro.id}", style = MaterialTheme.typography.bodySmall)
            Text(text = "Nome: ${livro.nome}", style = MaterialTheme.typography.headlineLarge)
            Text(text = "Ano: ${livro.ano}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
fun ListaDeLivros(livros: List<Livro>){
    LazyColumn {
        items(livros){ livro ->
            CardLivro(livro = livro)
        }

    }
}