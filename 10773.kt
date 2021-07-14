import java.util.*

fun main(args:Array<String>){
    val s: Scanner = Scanner(System.`in`)
    val k = s.nextInt()
    var arr = ArrayList<Int>(k)
    var input: Int
    var result = 0

    for(i in 0 until k){
        input = s.nextInt()
        if (input == 0)
            arr.removeAt(arr.count()-1)
        else
            arr.add(input)
    }

    for(i in arr)
        result += i

    println(result)

}