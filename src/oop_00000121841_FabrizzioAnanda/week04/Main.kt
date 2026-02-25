package oop_00000121841_FabrizzioAnanda.week04

fun main() {
    println("Testing Vehicle")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\nTesting Car")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\nTesting Electric Car")
    val myEV = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 85)
    myEV.openTrunk()
    myEV.honk()
    myEV.accelerate()

    println("\nTesting Employee Hierarchy")
    val manager = Manager("Budi", 8000000)
    val developer = Developer("Lutfi", 7000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}