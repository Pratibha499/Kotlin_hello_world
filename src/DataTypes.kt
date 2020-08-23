fun main(){
    var string="welcome to my World!"
    var stringlength=string.length
    var stringindex=string.get(6)
    println(stringlength)
    println("String at index 6 is:"+stringindex)
    println("String at index 6 is:$stringindex")                  //other way to concatenate the string
    println("String at index 6 is: ${string.get(6)}")            //aother way to concatenate the string
    println(string.subSequence(0,8))
    println(string.indexOf('e'))
}