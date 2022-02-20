fun main(){  greetings("rose")
    var number = myNum(60,8)
    println(number)
    var total = add(330,50,15,80)
    println(total)
    sentence("small")
}
fun greetings (name: String){
    println("hello $name")
}
fun myNum (num1: Int,num2: Int): Int{
    var modulus=num1%num2
    return modulus
}
fun add (num1: Int,num2: Int,num3: Int,num4: Int): Int{
    var sum=num1+num2+num3+num4
    return sum
}
fun sentence (word: String){
    println("my waist is very " +word)

}