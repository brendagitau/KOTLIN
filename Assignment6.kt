fun main(){
    var car = Car("Benz", "G-3", "Gold",5)
    println(car.carry(9))
    println(car.identity())
    println(car.calculateParkingFees(17))

    var bus = Bus("Benz", "G-3","Gold",15)
    println(bus.maxTripFare(200.00.toDouble()))
    println(bus.calculateParkingFees(9))
}
class Car (make: String, model: String, color: String, capacity: Int):Vehicles(make, model, color,capacity){
    fun identity(){
        println("I am a $color $make $model")
    }
}
open class Vehicles(var make: String, var model : String, var color: String, var capacity: Int){
    fun carry(people: Int){
        if(capacity<=people){
            println("carrying $people passengers")
        }
        else if (capacity>=people){
            var exceed = people-capacity
            println("Over capacity $exceed")
        }
    }
    open fun calculateParkingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return parkingFees
    }
}
class Carr (make: String, model: String, color: String, capacity: Int):Vehicles(make, model, color,capacity){
    fun identity(){
        println("I am a $color $make $model")
    }
}
class Bus (make: String, model : String, color: String, capacity: Int): Vehicles(make, model, color,capacity){
    fun maxTripFare(fare : Double): Double{
        return fare * capacity
    }
    override fun calculateParkingFees(hours: Int): Int{
        return hours * capacity
    }
}
