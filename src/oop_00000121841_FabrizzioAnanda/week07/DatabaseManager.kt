package oop_00000121841_FabrizzioAnanda.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"
    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}