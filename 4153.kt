import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        var token = StringTokenizer(kotlin.io.readLine())
        val arr = Array<Double>(3) { 0.0 }
        for (i in arr.indices)
            arr[i] = token.nextToken().toDouble()

        arr.sort()

        if(arr[0] == 0.0 || arr[1] == 0.0 || arr[2]==0.0) break

        else if (arr[0].pow(2) + arr[1].pow(2) == arr[2].pow(2))
            println("right")
        else
            println("wrong")
    }
}