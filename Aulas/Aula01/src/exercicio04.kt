fun main(){
    println("informe uma frase")
    var frase = readLine() ?: ""

    var fraseQuebrada = frase.split(" ")

    for (palavra in fraseQuebrada){
        print(palavra)
        print("-")
    }
}