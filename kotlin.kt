import java.util.*

fun main(){
  introduction("Brenda",22)
    var result=dispenser(5)
    println(result)
    var matokeo=nameList("jaja","baab","Brenda","Gitau","cii")
    println(matokeo)
   var mod= modulus(100,7)
    println(mod)
    var div=divide(100,5)
    println(div)
    var times=mult(2,9999)
    println(times)


    var person=person("Brenda",12,98.7.toFloat())
    person.eat(5)

    person.birthday()

    comparison(5,4)

    name()
}





/*1 .Create a function called introduction. It takes in 2 parameters: name and age. The function prints out an introduction message in the format:
My name is $name and I am $age years old. E.g: My name is Hellen and I am 19 years old.*/
fun introduction(name:String , age:Int){
    println("My name is $name and I am $age years old")
}
/*2.You are required to program a machine that dispenses juice to students .
The school management needs  a program that serves a glass of milk to students under the age of 6 years,
serves a bottle of fanta to students more than 6 years but not older than 15 years. The remaining lot serves cocacola.
*/
fun dispenser(age:Int):String{

        if (age < 6){
            return "Serve milk"
        }
        else if (age>6 && age <=15){
            return "Serve a  fanta"
        }
        else {
            return "Serve  coca cola"
        }
    }

/*3.Given an array of names, create a function that will return number of names longer than 4 characters */
fun nameList(a: String, b:String, c:String, d:String, e:String) :Int {
    var names = arrayOf(a, b, c, d, e)
    var lname = 0
    for (name in names) {
        if (name.length > 4) {
            lname++
        }
    };return lname
}
/*4.Create functions to multiply, divide and find the modulus of 2 numbers. Invoke each of these functions inside the main function.*/
fun modulus(a:Int, b:Int): Int{
    return(a%b)
}
fun mult(num1:Int, num2:Int): Int{
    return(num1*num2)
}
fun divide(a:Int, b:Int): Int{
    return(a/b)
}

/*5. Create a class called Human with these attributes: name, age, weight. It has the following functions:
- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food” and increments the human’s weight by the weight of the food eaten - speak(speech: String) :Prints the string passed to it
- birthday( ) :Increments the human’s age by 1
Create an instance of this human class and invoke all its functions*/
class person(var name:String,var age:Int,var Weight:Float){
    fun eat(foodAmount:Int){
        println("I am eating $foodAmount kilograms of food ")
        Weight= Weight+ foodAmount
        println(Weight)
    }

    fun birthday(){
        age=age + 1
        println(age)
    }
}

/*6..Create a function  called comparison. The function takes two numbers as parameters and the function should return the
 lesser of the true
 */
fun comparison(a:Int,b:Int){

    if (a>b){
        println(a)
    }else{println(b)}
}

/*7. Create a function to simulate the rock-paper-scissors game. It takes in player 1 and player 2’s choice,
either of which might be “rock”, “paper” or “scissors”. According to the rules of the game:

- Paper covers Rock and therefore wins
- Rock beats Scissors and therefore wins
- Scissors cuts rock and therefore wins
- If both players have the same choice it’s a draw
Print out the result of each round e.g “Player 1 wins”, “Player 2 wins” or “It’s a draw”. */

/*8.Create a function that takes in 5  names and returns a string array containing all 5 names. */
fun name(){
    var jina = arrayOf("kiki","koko","kuku","koku","lina")
    println(Arrays.toString(jina))
}






