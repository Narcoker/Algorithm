import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val n = s.nextInt()
    val x = s.nextInt()
    val arr = Array(n){0}

    for(i in arr.indices) {
        arr[i] = s.nextInt()
        if(arr[i] < x) print("${arr[i]} ")
    }
}