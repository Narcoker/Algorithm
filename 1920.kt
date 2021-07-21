import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = Array<Int>(n) { 0 }
    var token = StringTokenizer(readLine())
    for (i in arr.indices)
        arr[i] = token.nextToken().toInt()

    val m = readLine().toInt()
    val find = Array<Int>(m){0}

    token = StringTokenizer(readLine())
    for (i in find.indices)
        find[i] = token.nextToken().toInt()

    for(i in find.indices) {
        if (arr.contains(find[i]))
            println("1")
        else
            println("0")
    }
}