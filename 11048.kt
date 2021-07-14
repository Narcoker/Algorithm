import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//  2차월 배열 사이즈 선언
    var token = StringTokenizer(readLine())
    val N = token.nextToken().toInt()
    val M = token.nextToken().toInt()


//  2차원 배열 선언
    val maze = Array(N) { ArrayList<Int>(M) }
    for (i in 0 until N) {
        token = StringTokenizer(readLine())
        for (j in 0 until M) {
            maze[i].add(token.nextToken().toInt())
        }
    }
   for( i in 0 until N){
       for (j in 0 until M){
           if(i == 0 && j == 0) continue
           else if(i == 0) maze[i][j] += maze[i][j-1]
           else if(j == 0) maze[i][j] += maze[i-1][j]
           else maze[i][j] += max(maze[i-1][j], maze[i-1][j], maze[i][j-1])
       }
   }

    println(maze[N-1][M-1])
}

fun max(x: Int, y: Int, z: Int): Int {
    val list = listOf(x, y, z)
    var max = list.maxOrNull()

    if (max == null) return 0
    else return max
}
