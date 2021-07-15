import java.util.*
import kotlin.collections.ArrayList

fun main(){
    var s: Scanner = Scanner(System.`in`)
    var n = s.nextInt()
    var arr = ArrayList<Double>()

    for (i in 0 until n){
        var input = s.nextDouble()
        arr.add(input)
    }

    var max = arr[0]

    for (i in 1 until arr.count())
        if(max < arr[i]) max = arr[i]


    for(i in 0 until arr.count())
        arr[i] = arr[i].toDouble() / max * 100

    println(arr.average())
}