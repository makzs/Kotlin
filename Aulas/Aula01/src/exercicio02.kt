fun main(){
    println("informe uma frase")
    var frase = readLine() ?: ""

    var tamanho = frase.length

    println("Numero de caracteres: $tamanho")
}