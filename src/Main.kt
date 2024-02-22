fun main() {
    printFullName("Hello", "Esther")
    modulus(15, 4)
    add( 10, 45, 32, 56)
    printName("Esther", "enjoys", "travelling")


}
fun printFullName(firstname: String, lastname: String){
    var fullName = firstname + " "+ lastname
    println(fullName)

}
fun modulus(num1: Int, num2: Int){
    var result = num1 % num2
    println(result)

}
fun add(num1: Int, num2: Int, num3: Int, num4: Int){
    var result = num1 + num2+ num3+ num4
    println(result)

}
fun printName(firstname: String, secondname: String, thirdname: String){
    var name = firstname + " "+ secondname + " "+thirdname
    println(name)


}