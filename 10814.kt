import java.io.*
import java.util.*
import kotlin.collections.ArrayList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
   val br = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = readLine().toInt()
    val arr = ArrayList<Triple<Int, String, Int>>()

    for(i in 1..n){
        val token = StringTokenizer(readLine())
        arr.add(Triple(token.nextToken().toInt(), token.nextToken(), i))
    }

    arr.sortWith(compareBy<Triple<Int, String, Int>>{it.first}.thenBy{it.third})

    arr.forEach{
        br.write("${it.first} ${it.second}\n")
        br.flush()
    }
    this.close()
    br.close()
}