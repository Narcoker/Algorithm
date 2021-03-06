package baekjoon_1260

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

internal var n = 0
internal var m = 0
internal var start = 0
internal var table: Array<IntArray> = arrayOf()
internal var visited: BooleanArray = booleanArrayOf()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var token  = readLine().split(" ")
    n = token[0].toInt()
    m = token[1].toInt()
    start = token[2].toInt()

    table = Array(n+1){IntArray(n+1) {0} }
    visited = BooleanArray(n+1){false}

    for(i in 0 until m){
        token = readLine().split(" ")
        var a = token[0].toInt()
        var b = token[1].toInt()

        table[a][b] = 1
        table[b][a] = 1
    }

    dfs_1260(start)
    for(i in 0 until n+1)
        visited[i] = false
    println()
    bfs_1260(start)
}

fun dfs_1260(v :Int) {
    visited[v] = true
    print("$v ")
    for(i in 1 .. n){
        if(!visited[i] && table[v][i] == 1){
            dfs_1260(i)
        }
    }
}

fun bfs_1260(v: Int){
    val queue: Queue<Int> = LinkedList<Int>()
    queue.add(v)
    visited[v] = true
    print("$v ")

    while(!queue.isEmpty()){
        var d = queue.poll()
        for(i in 1 .. n){
            if(!visited[i] && table[d][i] == 1){
                queue.add(i)
                visited[i] = true;
                print("$i ")
            }
        }
    }
}
