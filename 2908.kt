import java.util.*

fun main() {
    val s: Scanner = Scanner(System.`in`)
    var a = s.nextInt().toString()
    var b = s.nextInt().toString()

    var x = a.reversed().toInt()
    var y = b.reversed().toInt()

    if (x > y) println(x)
    else println(y)
}