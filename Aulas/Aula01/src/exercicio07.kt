fun main(){

    // Escreva um programa que comprim uma string contando os caracteres repetidos e
    // substituindo eles por numeros

    println("informe a primeira frase")
    var fraseUm = readLine() ?: ""

    var cont = 1

    for (i in 1 until fraseUm.length){
        var charAtual = fraseUm[i]
        var charAnterior = fraseUm[i-1]

        if (charAtual == charAnterior)
        {
            cont++;
        }
        else
        {
            print(charAnterior)
            print(cont)
            cont = 1
        }

    }
    print(fraseUm.last())
    print(cont)
}


