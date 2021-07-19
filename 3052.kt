import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val numset = mutableSetOf<Int>()

    for(i in 1 .. 10)
        numset.add(s.nextInt() % 42)

    println(numset.size)

}