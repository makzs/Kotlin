fun main() {
    /*
    println("Nome: ")
    var nome = readLine() ?: "sem nome"

    println("idade: ")
    var idade = readLine()?.toIntOrNull() ?: 0

    val dias = idade * 365
    println("$nome viveu aproximadamente $dias dias de vida")
    */
    print("Digite uma frase: ")
    val texto = readLine() ?: ""

    print("Digite uma palavra: ")
    val palavra = readLine() ?: ""
    val palavraReversa = palavra.reversed()


    val vogais = "aeiouAEIOU"
    var cont = 0

    for (letra in texto){
        if(letra in vogais){
            cont++;
        }
    }

    println("Existem $cont vogais na sua frase!")
    println("$palavra --- $palavraReversa")
}