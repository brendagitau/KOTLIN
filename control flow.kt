fun main(){
    numbers()
    println(name("Makena", "Kiki", "Kawira", "Gitau", "Yeshua"))
    println(bot(25))
    println(bot(6))
    lnumber()
}
//Create a function that prints out all the odd numbers between 1 and 100
fun numbers() {
    for (a in 1..100)
        if(a%2!=0){
            println(a)
        }
}
/*Create a function that takes in an array of names and returns the number of
names longer than 5 characters*/
fun name(a: String, b:String, c:String, d:String, e:String) :Int {
    var names = arrayOf(a, b, c, d, e)
    var lname = 0
    for (name in names) {
        if (name.length > 5) {
            lname++
        }
    };return lname
}
/*You are creating a robot to serve drinks at a party. The robot is required to
serve a glass of milk for guests under the age of 6. For guests under the age of
15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
else gets a bottle of coca cola. Create a function that will make these
decisions, printing out the name of the drink each person gets according to
their age.*/
fun bot(age : Int) :String{
    if (age < 6){
        return "Serve milk"
    }
    else if (age <=15){
        return "Serve a  fanta"
    }
    else {
        return "Serve  coca cola"
    }
}
/*Write a function that prints each number from 1 to 100 on a new line. For each
multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
"Buzz" instead of the number. For numbers which are multiples of both 3 and
5, print "FizzBuzz" instead of the number.*/
fun lnumber(){
    for (num in 1..100){
        if(num%3 !=0 && num%5 !=0){
            println(num)
        }
        if (num%3==0){
            println("Fizz")
        }
        if(num%5==0){
            println("Buzz")
        }
        if (num%3==0 && num%5==0){
            println("FizzBuzz")
        }
    }
}