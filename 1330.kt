import java.util.*

fun main() {
    val s: Scanner = Scanner(System.`in`)
    var a = s.nextInt()
    var b = s.nextInt()

    if (a > b) {
        println(">")
    } else if (a < b) {
        println("<")
    } else {
        println("==")
    }
}