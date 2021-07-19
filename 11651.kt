import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val n = readLine().toInt()
    val pairs = mutableListOf<Pair<Int, Int>>()

    for(i in 1.. n){
        var token = StringTokenizer(readLine())
        pairs.add(Pair(token.nextToken().toInt(), token.nextToken().toInt()))
    }

    pairs.sortWith(compareBy<Pair<Int,Int>> { it.second }.thenBy{it.first})
    pairs.forEach{bw.write("${it.first} ${it.second}\n")}
    bw.close()
}