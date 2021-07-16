import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var max = token.nextToken().toInt()
    var min = max

    for(i in 1 until n){
        val temp = token.nextToken().toInt()
        if(max < temp.toInt()) max = temp.toInt()
        if(min > temp.toInt()) min = temp.toInt()
    }

    println("$min $max")
}


//fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
//    val n = readLine().toInt()
//    val arr = IntArray(n){0}
//
//    val token = StringTokenizer(readLine(), " ")
//
//    for(i in 0 until n)
//        arr[i] = token.nextToken().toInt()
//
//    var max = arr[0]
//    var min = arr[0]
//
//    for(i in 1 until arr.size){
//        if(max < arr[i]) max = arr[i]
//        if(min > arr[i]) min = arr[i]
//    }
//
//    println("$min $max")
//
//}