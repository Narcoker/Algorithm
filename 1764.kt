import java.util.*
import kotlin.collections.HashSet

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val hash = HashSet<String>()
    val retain = ArrayList<String>()

    for(i in 1 .. n)
        hash.add(br.readLine())
    for(i in 1 .. m){
        var input = br.readLine()
        if(hash.contains(input))
            retain.add(input)
    }

    retain.sort()
    bw.write("${retain.size}\n")
    for(i in retain.indices)
        bw.write("${retain[i]}\n")

    bw.close()
    br.close()
}