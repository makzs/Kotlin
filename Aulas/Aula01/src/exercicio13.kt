fun main()
{
    println("Informe uma nota: ")
    val nota = readLine()!!.toFloat()

    when(nota) {
        in 9.0..10.0 -> print("A")
        in 7.0 .. 9.0 -> print("B")
        in 5.0 .. 7.0 -> print("C")
        in 3.0 .. 5.0 -> print("D")
    }

}