fun main(){

    // Escreva um programa que peça 2 frases e verifique se elas são anagramas

    println("informe a primeira frase")
    var fraseUm = readLine() ?: ""

    println("informe a segunda frase")
    var fraseDois = readLine() ?: ""

    var valido = true

    for (letra in fraseUm){
        if(letra !in fraseDois){
            valido = false
        }
    }

    if (fraseUm.length == fraseDois.length && valido){
        println("$fraseUm e $fraseDois são anagramas")
    }
    else{
        println("$fraseUm e $fraseDois não são anagramas")
    }
}