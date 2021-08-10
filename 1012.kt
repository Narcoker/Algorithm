import java.util.*

val table = Array(50) { BooleanArray(50) { false } }
val visited = Array(50) { BooleanArray(50) { false } }

var n = 0
var m = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var count = 0

    val re = br.readLine().toInt()
    repeat(re) {
        var token = StringTokenizer(br.readLine())
        n = token.nextToken().toInt()
        m = token.nextToken().toInt()

        var num = token.nextToken().toInt()
        var y: Int
        var x: Int
        for (i in 1..num) {
            token = StringTokenizer(br.readLine())
            y = token.nextToken().toInt()
            x = token.nextToken().toInt()
            table[y][x] = true
        }

        for (dy in 0 until n) {
            for (dx in 0 until m) {
                if (!visited[dy][dx] && table[dy][dx]) {
                    dfs_1012(dy, dx)
                    count++
                }
            }
        }
        bw.write("$count\n")
        count = 0
        for (i in 0 until 50) {
            for (k in 0 until 50) {
                table[i][k] = false
                visited[i][k] = false
            }
        }
    }

    bw.close()
    br.close()
}

fun dfs_1012(dy: Int, dx: Int) {
    visited[dy][dx] = true
    if(dx-1 >= 0) {
        if (!visited[dy][dx-1] && table[dy][dx-1])
            dfs_1012(dy, dx-1)
    }
    if(dy - 1 >= 0){
        if (!visited[dy - 1][dx] && table[dy - 1][dx])
            dfs_1012(dy - 1, dx)
    }
    if(dy + 1 < n){
        if (!visited[dy + 1][dx] && table[dy + 1][dx])
            dfs_1012(dy + 1, dx)
    }
    if(dx + 1 < m){
        if (!visited[dy][dx+1] && table[dy][dx+1])
            dfs_1012(dy, dx+1)
    }
}