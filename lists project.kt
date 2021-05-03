fun main() {
println(listOf("burger","steak","fries","bacon","sausages","hotdogs"))
height()
    accmanager()
    dreamTeam()
}
//1.)Given a list of 10 strings, write a function that returns a list of the strings at even indices i.e. index 2,4,6
fun foodie (food:List<String>):List<String>{
     var chakula = mutableListOf<String>()
    for (x in food){
        if(food.indexOf(x) % 2==0){
            chakula.add(x)

        }
    }
    return chakula

}

//2.) given a list of people's heights in metres;write a function that returns the  averageand taoatl height.
fun height(){

    var urefu = mutableListOf<Double>(1.45,1.67,1.89,1.53)
    var sum=urefu.sum()
    var average=urefu.average()
    println("Their average height is $average while total height is $sum.")
}
//3.)Give a list of a person's objects  each with attributes : name,age,height and weight.Sort the list in order of descnding  age.
data class Managers(var name: String,var age:Int,var height:Double,var weight:Double)
fun accmanager() {
    var managerz = listOf(
        Managers("Gates", 24, 1.68, 60.0),
        Managers("Jobs", 20, 1.80, 54.0),
        Managers("Buffet", 23, 1.54, 58.0)
    )
    var sortedStaff = managerz.sortedByDescending { p -> p.age }
    println(sortedStaff)
}
// Give a list similar to the one  above ,write a function  where you will create two more objects and add them to list at age.
data class Tech(var name:String,var age:Int,var height:Double,var weight:Double)
fun dreamTeam() {
    var techie = mutableListOf(
        Tech("Cavi", 33, 1.40, 67.0),
        Tech("Jamie", 23, 1.70, 90.7),
        Tech("Tj", 45, 1.39, 78.9),
        Tech("Lana", 16, 1.13, 45.1)
    )
    techie.addAll(listOf(
        Tech("Pierre",40,1.75,86.4),
        Tech("Ella",39,1.62,71.3)
    ))
    println(techie)
}

//5.write a function that takes in a list of car objects each with attributes of registration and millage and returns  the milleage of all vehicles in the list.
data class   Carz(var name:String,var registration:String,var milleage:Int)
fun carInfo(mileage:List <Int>):Int{
    var miles= mileage.average().toInt()
    return miles
}



