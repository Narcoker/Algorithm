package baekjoon_12851

import java.util.*

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

var n = 0
var m = 0

val isvisited = Array(100001) { -1 }
val q: Queue<Int> = LinkedList()

fun main() {
    val token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    bfs(n)

    bw.close()
    br.close()
}

fun bfs(start: Int) {
    isvisited[start] = 0
    q.add(start)

    val arr = Array(3) { 0 }

    var cur = 0
    var count = 0
    var end_stair = 100001
    while (true) {
        cur = q.poll()

        if(q.isNotEmpty() && isvisited[cur] == end_stair){
            bw.write("${isvisited[m]}")
            bw.newLine()
            bw.write("$count")
            return
        }

        arr[0] = cur - 1
        arr[1] = cur + 1
        arr[2] = cur * 2

        for (i in arr.indices) {
            if (arr[i] in 0..100000) {
                if (arr[i] == m || (isvisited[arr[i]] == isvisited[cur] + 1) || isvisited[arr[i]] == -1) {
                    if (i != 2) {
                        q.add(arr[i])
                    } else {
                        if (arr[i] > 0)
                            q.add(arr[i])
                    }
                    isvisited[arr[i]] = isvisited[cur] + 1

                    if(arr[i] == m) {
                        count++
                        end_stair = isvisited[cur] + 1
                    }
                }
            }
        }
    }

}