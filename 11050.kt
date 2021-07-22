import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    if (k == 0) {
        println("1")
        return
    }

    val arr = Array(n + 1) { Array(n + 1) { 0 } }

    for (m in 0 until n + 1) {
        for (z in 0..m) {
            if (z == 0 || m == z) arr[m][z] = 1
            else arr[m][z] = arr[m - 1][z - 1] + arr[m - 1][z]
        }
    }
    println(arr[n][k])
}