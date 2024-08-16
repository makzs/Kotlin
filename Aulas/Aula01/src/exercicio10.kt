fun main(){

    println("informe a frase")
    val fraseUm = readLine() ?: ""

    println("informe a letra que deseja contar")
    val letraDesejada = readLine() ?: ""

    var cont = 0

    for (letra in fraseUm)
    {
        if (letra.toString() == letraDesejada)
        {
            cont++
        }
    }

    

    println("A letra ${letraDesejada} aparece ${cont} vezes")
}


