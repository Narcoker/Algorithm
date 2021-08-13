import java.util.*
import kotlin.collections.ArrayList


fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val vertex = br.readLine().toInt()
    val table_11725 = ArrayList<ArrayList<Int>>()
    val visited_11725 = Array(vertex + 1) { false }
    val parent_11725 = Array(vertex + 1) { 0 }

    for (i in 0..vertex)
        table_11725.add(ArrayList())

    var n: Int
    var m: Int
    var token: StringTokenizer

    repeat(vertex - 1) {
        token = StringTokenizer(br.readLine())
        n = token.nextToken().toInt()
        m = token.nextToken().toInt()

        table_11725[n].add(m)
        table_11725[m].add(n)
    }

    dfs_11725(1, table_11725, visited_11725, parent_11725)

    for (i in 2..vertex)
        bw.write("${parent_11725[i]}\n")


    bw.close()
    br.close()
}

fun dfs_11725(v: Int, table: ArrayList<ArrayList<Int>>, visited: Array<Boolean>, parent: Array<Int>) {
    visited[v] = true
    for (k in table[v].indices) {
        if (!visited[table[v][k]]) {
            parent[table[v][k]] = v
            dfs_11725(table[v][k], table, visited, parent)
        }
    }
}
