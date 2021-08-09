import java.util.*

var have: Array<Int> = arrayOf()
val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

fun main() {


    val n = br.readLine().toInt()
    have = Array(n) { 0 }

    var token = StringTokenizer(br.readLine())
    for (i in have.indices) {
        have[i] = token.nextToken().toInt()
    }

    have.sort()

    val m = br.readLine().toInt()
    var find: Int
    token = StringTokenizer(br.readLine())
    repeat(m){
        find = token.nextToken().toInt()
        binarysearch(find)
    }
    br.close()
    bw.close()
}

fun binarysearch(find: Int) {
    var left = 0
    var right = have.size - 1
    var middle: Int

    while (left <= right) {
        middle = (left + right) / 2
        if(find < have[middle])
            right = middle - 1
        else if(find > have[middle])
            left = middle + 1
        else{
            bw.write("1 ")
            return
        }
    }
    bw.write("0 ")
    return
}