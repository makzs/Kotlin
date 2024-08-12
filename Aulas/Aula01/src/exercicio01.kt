fun main(){

    // Desenvolva um programa que peça ao usuario para inserir um texto e dois indices
    // O programa deve extrair e exibir a subtring correpondente aos indices fornecidos

    println("informe uma frase")
    var frase = readLine() ?: ""

    println("Informe o indice inicial: ")
    var indiceInicial = readLine()?.toIntOrNull() ?: 0

    println("Informe o indice final: ")
    var indiceFinal = readLine()?.toIntOrNull() ?: 0

    val substring = frase.substring(indiceInicial, indiceFinal)


    if (indiceInicial > frase.length && indiceFinal > frase.length ){
        println("Erro os indices são maiores que o tamanho da frase")
    }
    else if(indiceFinal < indiceInicial){
        println("Indices invalidos! o indice final deve ser maior que o inicial")
    }
    else{
        println("Subtring: $substring")
    }
}