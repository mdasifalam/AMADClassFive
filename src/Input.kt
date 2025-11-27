import java.util.*

fun main() {
//    val numOne = readln()!!.toInt()
//    val numTwo = readln()!!.toInt()
//
//    val sum = numOne + numTwo
//
//    println(sum)

//    val scan = Scanner(System.`in`)
//
//    val numOne = scan.nextInt()
//    val numTwo = scan.nextInt()
//
//    val sum = numOne + numTwo
//
//    println(sum)

    val (a, b ,c) = readln()!!.split(" ").map { it.toInt() }

    val sum = a + b + c
    println(sum)
}