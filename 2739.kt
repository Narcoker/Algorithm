import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val n = s.nextInt()

    for(i in 1..9){
        println("$n * $i = ${n*i}")
    }
}