fun main(args: Array<String>){
    var sugar:Int= readLine()!!.toInt()

    if(sugar == 4 || sugar == 7) {
        println(-1)
        return
    }
    else if(sugar % 5 == 0)
        println(sugar / 5)

    else if(sugar % 5 == 1 || sugar % 5 == 3)
        println(sugar / 5 + 1)
    else
        println(sugar / 5 + 2)
}