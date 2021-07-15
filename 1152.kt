import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var token = readLine().split(" ")
    var count = 0

    for(i in token)
        if (i != "") count++

    println(count)
}