import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = Integer.parseInt(readLine())
    for (i in 1..n) {
        val str = readLine().toString()
        var count1 = 0
        var count2 = 0

        for (k in str.indices) {
            if (str[k] == '(') count1++
            else count2++

            if (count1 < count2) break
        }
        if (count1 != count2 || str[str.length - 1] != ')') println("NO")
        else println("YES")
    }
}