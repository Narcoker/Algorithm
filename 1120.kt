import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val token = StringTokenizer(readLine(), " ")
    val a = token.nextToken().toString()
    val b = StringBuilder(token.nextToken().toString())
    val count = b.length - a.length

    val ch1 = StringBuilder(a)
    ch1.insert(0, a.substring(0, count))

    val ch2 = StringBuilder(a)
    ch2.append(a.substring(a.length - count))

    var result1 = 0
    var result2 = 0
    for (i in b.indices) {
        if (b[i] != ch1[i]) result1++
        if (b[i] != ch2[i]) result2++
    }

    if (result1 < result2) println(result1)
    else println(result2)
}