import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val n = s.nextInt()

    if(n % 400 == 0){
        println(1)
    }
    else if((n%4 == 0 && n % 100 != 0)){
        println(1)
    }
    else println(0)
}