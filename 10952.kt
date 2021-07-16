import java.util.*

fun main(){
    val s = Scanner(System.`in`)

    while(true){
        val a = s.nextInt();
        var b = s.nextInt()
        if(a==0 && b ==0) break
        println(a+b)
    }
}