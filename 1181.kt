import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<String>()
    var token = StringTokenizer(readLine())
    var n = token.nextToken().toInt()

    for(i in 1 .. n){
        val temp = readLine()
        if(!list.contains(temp))
            list.add(temp)
    }

    list.sortWith(compareBy<String>{it.length}.thenBy{it})

    list.forEach{bw.write("$it \n")}
    bw.flush()
}