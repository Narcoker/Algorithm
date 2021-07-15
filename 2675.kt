import java.util.*

fun main(){
    val s: Scanner = Scanner(System.`in`)
    val n = s.nextInt()
    for(i in 0 until n){
        var count = s.nextInt()
        var str = s.nextLine()

        for(j in 0 until str.length){
            for(k in 0 until count){
                if(str[j] == ' ') continue
                print(str[j])
            }
        }
        println()
    }
}