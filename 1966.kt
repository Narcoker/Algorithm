import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()

    for (i in 1 .. n){
        val token = StringTokenizer(readLine())
        val num = token.nextToken().toInt()
        val find = token.nextToken().toInt()
        var count = 0

        val q = LinkedList<Pair<Int, Int>>()
        val token2 = StringTokenizer(readLine())

        for(k in 0 until num)
            q.add(Pair(k, token2.nextToken().toInt()))

        loop@while(!q.isEmpty()){
            val out = q.poll()

            for(j in 0 until q.size){
                if(out.second < q[j].second){
                    q.add(out)
                    continue@loop
                }
            }

            if(out.first != find) count++
            else{
                println(++count)
                break
            }
        }
    }
}