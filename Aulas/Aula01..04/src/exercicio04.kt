fun main(){

    // Escreva um programa que peça uma frase e substitua os espaços por hifens

    println("informe uma frase")
    var frase = readLine() ?: ""

    var fraseQuebrada = frase.split(" ")

    for (palavra in fraseQuebrada){
        print(palavra)
        print("-")
    }
}