import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val arr = Array(31) { Array(31) { 0 } }

    for(i in 1 .. 30){
        for(k in 0 .. i){
            if(k == 0 || i == k) arr[i][k] = 1
            else arr[i][k] = arr[i-1][k-1] + arr[i-1][k]
        }
    }

    val n = br.readLine().toInt()
    var x: Int
    var y: Int

    repeat(n){
        var token = StringTokenizer(br.readLine())
        x = token.nextToken().toInt()
        y = token.nextToken().toInt()
        bw.write("${arr[y][x]}\n")
    }

    br.close()
    bw.close()
}