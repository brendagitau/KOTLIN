@file:Suppress("RedundantIf")

/* Assignment 8
1. Create a function called isEven( ) that returns true when the number
passed to it is even or returns false when the number passed to it is odd
(2 points)
 */
fun even(a:Int):Boolean{
    if(a%2==0){
        return true
    }
    else {
        return false
    }
}
/* 2. A product is represented by a data class with these attributes: name,
weight, price, category. Category can either be groceries, hygiene or
other. Write a function that takes in a product and uses a when
statement to assign each product to a list based on its category
(4 points)*/
data class Product(val name:String, val weight:Double, val price:Int, val category:String){
    fun goods(){
        when (category){
            "Hygiene"->(println(listOf(category)))
            "Groceries"->(println(listOf(name,category)))
            else -> println(listOf(category))
        }
    }
}
/*3. Write a function that given a string returns a string composed of only
the characters in even indices. For example given “banana” it will return
“bnn” (2 points)*/


fun evenNum(fruit:String):String{
    var fruitName = " "

    for (char in fruit){
        if (fruit.indexOf(char)%2==0){
            fruitName += char
        }
    }
    return fruitName
}
/* 4. Write a function that given an array of strings returns a list of strings
whose lengths are even. For example given [“Mary”, “adama”, “apple”] it
will return [“Mary”] */
fun listArray(people:Array<String>):MutableList<String>{
    var listName = mutableListOf<String>()
    for (X in people){
        if(X.length%2==0){
            listName.add (X)
        }
    }
    return listName
}

fun main(){
    var result=even(10)
    print(result)

    var product = Product("Vinegar",50.2,320,"Groceries")
    product.goods()
    println(evenNum("mango"))
    println(listArray(arrayOf("Wanjiru", "Muturi", "Wanjiku")))
}