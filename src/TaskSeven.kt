fun main() {
    var a: Int = 10
    var b: Int = 20

    println("Befor Swaping")
    println("a = $a")
    println("b = $b")

    //Swaping numers
    a = a + b
    b = a - b
    a = a - b

    println("After Swaping")
    println("a = $a")
    println("b = $b")
}