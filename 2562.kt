import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val arr = IntArray(9) { 0 }

    for(i in arr.indices)
       arr[i] = s.nextInt()

    var max = arr[0]

    for(i in 1 until arr.count()){
        if(max < arr[i]) max = arr[i]
    }
    var index = arr.indexOf(max)

    println(max)
    println(index+1)
}