import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val arr = IntArray(8){0}
    val ascending = IntArray(8){i -> i+1}
    val descending = IntArray(8){i -> 8 - i}
    for(i in arr.indices){
        arr[i] = s.nextInt()
    }

    if(arr.contentEquals(ascending)) println("ascending")
    else if (arr.contentEquals(descending)) println("descending")
    else println("mixed")
}