import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    val n = s.nextInt()

    if (n >= 90) println("A")
    else if (n >= 80) println("B")
    else if (n >= 70) println("C")
    else if (n >= 60) println("D")
    else println("F")
}