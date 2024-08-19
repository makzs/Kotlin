fun main(){

    // Escreva um programa que peça uma palavra e retorne a quantidade de caracteres presentes na frase

    println("informe uma palavra")
    var frase = readLine() ?: ""

    var tamanho = frase.length

    println("Numero de caracteres: $tamanho")
}