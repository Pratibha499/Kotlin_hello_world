import kotlin.math.max
fun main(){
    pratibha()
    println(multiply(7))
    println(add(74.3))
    println(calculatemax(3,6))
}

fun pratibha(){                                   //function 1
    println("This is my first Function!!")
}

fun multiply(p:Int):Int {                         //function2
    return p*5
}

fun add(x:Double)= x+6.2                         //function3

fun calculatemax(x:Int,y:Int):Int{
    return max(x,y)
}