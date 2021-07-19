import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    var hour = s.nextInt()
    var min = s.nextInt() - 45

    if(min<0){
        if(hour == 0) hour = 23
        else hour--
        min+=60
    }

    print("$hour $min")
}