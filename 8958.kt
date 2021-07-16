import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val n = s.nextLine().toInt()

    for (i in 1..n){
        var str = s.nextLine()
        var sum = 0

        var count = 0

        for(i in str.indices){
            if(str[i] == 'O') {
                sum += ++count
            }
            else if(str[i] =='X'){
                count = 0
            }

        }
        println(sum)
    }
}