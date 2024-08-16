fun main(){

    val temperaturas = arrayOf(18, 22, 15, 8, 29, 20, 12, 31, 25, 12, 9)
    var maiorTemp = temperaturas[0]
    var menorTemp = temperaturas[0]

    for (temp in temperaturas)
    {
        if(temp > maiorTemp)
        {
            maiorTemp = temp
        }
        if (temp < menorTemp)
        {
            menorTemp = temp
        }
    }

    println("Maior temperatura: ${maiorTemp}")
    println("Menor temperatura: ${menorTemp}")
}


