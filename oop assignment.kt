fun fun main() {
    var person=person("Jane Doe",50,98.7.toFloat())
    person.munch(5)
    person.talk("I love stackoverflow")
    person.birthday()
    var employee=client("brenda","Gitau","brendaesther5@gmail.com","074249896","nuttyprof001")
    println(employee.password)
    println(employee.email)
}
class person(var name:String,var age:Int,var Weight:Float){
    fun munch(foodAmount:Int){
        println("I am munching $foodAmount kilograms of food ")
        Weight= Weight+ foodAmount
        println(Weight)
    }
    fun talk(words:String){
        println(words)
    }
    fun birthday(){
        age=age + 1
        println(age)
    }
}
data class client(val firstName:String,val lastName:String,var email:String,var phoneNumber:String,var password:String)