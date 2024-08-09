fun main(){
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