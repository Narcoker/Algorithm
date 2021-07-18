import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val n = s.nextInt()

    for(i in 1 .. n){
        for(k in 1 .. n-i)
            print(" ")

        for(k in 1 .. i)
            print("*")

        println()
    }

}