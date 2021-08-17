package baekjoon_13549

import sun.awt.image.ImageWatched
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

fun bfs(v: Int) {
    val arr = Array(3) { 0 }

    q.add(v)
    isvisited[v] = 0

    var cur = 0

    while (true) {
        cur = q.poll()
        if (cur == m) {
            bw.write("${isvisited[cur]}")
            return
        }
        arr[0] = cur * 2
        arr[1] = cur - 1
        arr[2] = cur + 1


        for (i in arr.indices) {
            if (arr[i] in 0..100000) {
                if (isvisited[arr[i]] == -1) {
                    if (i != 0) {
                        q.add(arr[i])
                        isvisited[arr[i]] = isvisited[cur] + 1
                    } else {
                        if (arr[i] > 0) {
                            q.add(arr[i])
                            isvisited[arr[i]] = isvisited[cur]
                        }
                    }
                }
            }
        }
    }
}

