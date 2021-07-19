import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    val arr = Array(4) { 0 }

    for (i in arr.indices)
        arr[i] = s.nextInt()

    var x_min: Int = arr[2] / 2
    var y_min: Int = arr[3] / 2

    if (arr[0] <= x_min) x_min = arr[0]
    else x_min = arr[2] - arr[0]

    if (arr[1] <= y_min) y_min = arr[1]
    else y_min = arr[3] - arr[1]

    if (x_min < y_min) println(x_min)
    else println(y_min)

}