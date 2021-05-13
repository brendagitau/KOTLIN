/*1. A car is represented by a data class with these attributes: make, model and
color. Write a function that groups a list of cars by color using a when
statement. The available color groups are red, blue and other. The function
should print out each list of cars under each color group (3pts)
2. Write a function that takes in a String and returns its length (2 pts)
3. Create a class CurrentAccount with the following attributes: account number,
account name, balance. It has the following functions:
a. deposit(amount: Double) - Increments the balance by the amount
deposited
b. withdraw(amount: Double) - Decrements the balance by the amount
withdrawn
c. details() - Prints out the account number and balance and name in
this format: “Account number x with balance y is operated by z” (5pts)
4. Create another class SavingsAccount. It has the same functions and
attributes as the current account except for one attribute, withdrawals: Int.
Withdrawals is a counter variable that is used to keep track of how many
withdrawals have been made from the account in a year. The only other
difference is that the savings account withdraw() method first checks if the
number of withdrawals is less than 4 for it to allow one to withdraw money
from the account. It also increments the withdrawals attribute after a
successful withdrawal (5ts)*/
fun main(){
var result= sentence("my name")
    println(result.length)
    var car=car("benz",101443, "blue")
    var
}
 data class car(var make:String,var model:Int,var color:String){

    fun car(color:List<String>):String{
        println("I am a $color $model")}



    }




fun sentence( a:String):String{
    return a
}