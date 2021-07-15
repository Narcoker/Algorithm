import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n: Int = readLine().toInt()
    var sum = 0
    var num = readLine().split("")


    for(i in 0 until num.count()){
        if(num[i] == "") continue
        sum += Integer.parseInt(num[i])
    }

    println(sum)
}