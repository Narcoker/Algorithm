import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val str = StringBuilder(readLine())
    val arr = ArrayList<String>()

    for(i in 1 .. str.length-2){
        for(k in i+1 .. str.length - 1){
            val change = StringBuilder(str.toString())
            change.replace(0,i,change.substring(0,i).reversed())
            change.replace(i,k,change.substring(i,k).reversed())
            change.replace(k, change.length, change.substring(k).reversed())
            arr.add(change.toString())
        }
    }

    arr.sort()
    println(arr[0])
}