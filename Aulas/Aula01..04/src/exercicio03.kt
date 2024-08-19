fun main(){

    // Escreva um programa que peça uma frase e verifique se ela é um palindromo

    println("informe uma frase")
    val frase = readLine() ?: ""

    var fraseReformada = frase.replace(" ", "").lowercase()
    var fraseReversa = frase.reversed().replace(" ", "").lowercase()


    if (fraseReformada == fraseReversa ){
        println("As frases $fraseReformada e $fraseReversa são palindromos")
    }
    else{
        println("As frases $fraseReformada e $fraseReversa não são palindromos")
    }
}