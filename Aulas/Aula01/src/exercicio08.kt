fun main(){

    // Faça um programa que peça duas frases de tamanho igual e retorne uma frase
    // intercalando as duas frases pedidas

    println("Informe duas frases de tamanho igual:")

    println("informe a primeira frase")
    val fraseUm = readLine() ?: ""

    println("Informe a segunda frase: ")
    val fraseDois = readLine() ?: ""

    for (i in 0 until  fraseUm.length)
    {
        print(fraseUm[i])
        print(fraseDois[i])

    }
}

