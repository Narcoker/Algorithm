import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var q = LinkedList<String>()

    for (i in 1..n) {
        val token = StringTokenizer(readLine())
        val cmd = token.nextToken().toString()
        val num: String
        if (token.hasMoreTokens()) num = token.nextToken().toString()
        else num = "null"

        when (cmd) {
            "push" -> {
                q.add(num)
            }

            "pop" -> {
                if (!q.isEmpty())
                    println(q.pop())
                else
                    println("-1")
            }

            "size" -> {
                println(q.size)
            }
            "empty" -> {
                if (q.isEmpty()) println("1")
                else println("0")
            }

            "front" -> {
                if (q.isEmpty()) println("-1")
                else println(q.first)
            }

            "back" -> {
                if (q.isEmpty()) println("-1")
                else println(q.last)
            }
        }
    }
}