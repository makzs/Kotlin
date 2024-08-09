fun main(){
    println("Informe o numero 1: ")
    var num1 = readLine()?.toFloatOrNull() ?: 0.1f

    println("Informe o numero 2: ")
    var num2 = readLine()?.toFloatOrNull() ?: 0.1f

    println("Informe o numero 3: ")
    var num3 = readLine()?.toFloatOrNull() ?: 0.1f

    val media = (num1 + num2 + num3) / 3

    println("Media: $media")
}