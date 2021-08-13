import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()

    val table = Array(n + 1) { Array(n + 1) { 'x' } }
    val visited = Array(n + 1) { Array(n + 1) { false } }
    var count1 = 0
    var count2 = 0

    for (i in 1..n) {
        val str = br.readLine()
        for (k in 1..n)
            table[i][k] = str[k - 1]
    }

    for (i in 1..n) {
        for (k in 1..n) {
            if (!visited[i][k]) {
                dfs_10026(table[i][k], i, k, n, table, visited)
                count1++
            }
        }
    }

    for(i in 1 ..n){
        for(k in 1..n){
            if(table[i][k] == 'G') table[i][k] = 'R'
            visited[i][k] = false
        }
    }

    for (i in 1..n) {
        for (k in 1..n) {
            if (!visited[i][k]) {
                dfs_10026(table[i][k], i, k, n, table, visited)
                count2++
            }
        }
    }

    bw.write("$count1 $count2")

    bw.close()
    br.close()

}

fun dfs_10026(value: Char, i: Int, k: Int, n: Int, table: Array<Array<Char>>, visited: Array<Array<Boolean>>) {
    visited[i][k] = true

    val dy = arrayOf(-1, 1, 0, 0)
    val dx = arrayOf(0, 0, -1, 1)

    for (x in 0..3) {
        if ((i + dy[x] in 1..n) && (k + dx[x] in 1..n)) {
            if (!visited[i + dy[x]][k + dx[x]] && table[i + dy[x]][k + dx[x]] == value) {
                dfs_10026(table[i + dy[x]][k + dx[x]], i + dy[x], k + dx[x], n, table, visited)
            }
        }
    }
}
