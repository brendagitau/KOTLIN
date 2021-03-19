import java.util.*
import java.util.Arrays.toString

/*Assignment 4: Arrays
1. Create a function that takes in 4 strings and creates an array out of them then prints out the array (2 points)
2. Create a function that given an array below:
var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
prints out the names of the cities in the correct grammatical case. (2 points)
3. Create one function that given the below array:
var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
(i) prints out the sum of the second and fifth elements (1 point) (ii) prints out the index of 158 (1 point) (iii) prints out the elements in ascending order (2 points)
4. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
*/
fun main(){
arrayZaStrings()
    worldCities()
    numbers()
    nameList("zilla","jojo","brenda")
}
fun arrayZaStrings(){
    var cakeArray = arrayOf("unga","sugar","chocolate","whippedcream","milk","eggs")
    println(Arrays.toString(cakeArray))
}
fun worldCities(){
    var worldCities = arrayOf("harare","mumbai","dodoma" ,"jakarta")
    worldCities.forEach{ city ->
        println(city.capitalize())

    }
}
fun numbers(){
    var numero = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)

   var sumElements =numero[1]+numero[4]
    println(sumElements)

    var index =numero.indexOf(158)
    println(index)

    var sortNumero=numero.sortedArray()
    println(Arrays.toString(sortNumero))

}
fun nameList(a:String,b:String,c:String){
    var names=arrayOf(a,b,c)
    var sortNames =names.sortedArray()

    println(Arrays.toString(sortNames))
}