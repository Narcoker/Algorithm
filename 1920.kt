//import java.util.*
//
//fun main() {
//    val br = System.`in`.bufferedReader()
//    val bw = System.`out`.bufferedWriter()
//
//    val n = br.readLine().toInt()
//    val arr = Array<Int>(n) { 0 }
//
//    val token1 = StringTokenizer(br.readLine())
//    for (i in arr.indices) {
//        arr[i] = token1.nextToken().toInt()
//    }
//
//    arr.sort()
//
//    val m = br.readLine().toInt()
//
//    val token2 = StringTokenizer(br.readLine())
//
//    var check: Int
//    var start: Int
//    var end: Int
//    var mid: Int
//
//    for (i in 1..m) {
//        check = token2.nextToken().toInt()
//        start = 0
//        end = n - 1
//
//        while (true) {
//            mid = (start + end) / 2
//            if (start > end) {
//                bw.write("0\n")
//                break
//            } else if (check > arr[mid])
//                start = mid + 1
//            else if (check < arr[mid])
//                end = mid - 1
//            else if (check == arr[mid]) {
//                bw.write("1\n")
//                break
//            }
//        }
//
//    }
//    bw.flush()
//}

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = Array<Int>(n) { 0 }

    var token = StringTokenizer(br.readLine())

    for (i in arr.indices)
        arr[i] = token.nextToken().toInt()

    arr.sort()

    val m = br.readLine().toInt()
    token = StringTokenizer(br.readLine())

    var check: Int

    for (i in 1..m) {
        check = token.nextToken().toInt()
        if(Arrays.binarySearch(arr,check) < 0)
            bw.write("0\n")
        else
            bw.write("1\n")
    }

    bw.flush()
}
