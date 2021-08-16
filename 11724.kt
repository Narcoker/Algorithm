package baekjoon_11724

import java.util.*

var table = Array(1001){Array(1001){false} }
var visited = Array(1001){false}
var vertex = 0
var edge = 0
fun main(){
    val br = System.`in`.bufferedReader()
    val bw= System.`out`.bufferedWriter()

    var token = StringTokenizer(br.readLine())
    vertex = token.nextToken().toInt()
    edge = token.nextToken().toInt()

    var start: Int
    var end: Int
    for(i in 1 .. edge){
        token = StringTokenizer(br.readLine())
        start = token.nextToken().toInt()
        end = token.nextToken().toInt()
        table[start][end] = true
        table[end][start] = true
    }

    var count = 0

    for(i in 1 .. vertex){
        if(!visited[i]){
            dfs_11724(i)
            count++
        }
    }

    bw.write("$count")

    bw.close()
    br.close()
}

fun dfs_11724(v: Int){
    visited[v] = true
    for(i in 1 .. vertex){
        if(!visited[i] && table[v][i])
            dfs_11724(i)
    }
}

