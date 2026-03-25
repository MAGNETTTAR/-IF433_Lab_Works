package oop_00000121841_FabrizzioAnanda.week07

package oop_00000121841_FabrizzioAnanda.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    val dataUser1 = DataUser(1, "Fabi", "fabi@mail.com")
    val dataUser2 = DataUser(1, "Fabi", "fabi@mail.com")

    println("\n=== TEST DATA CLASS EQUALITY ===")
    println("Apakah dataUser1 == dataUser2? ${dataUser1 == dataUser2}")

    val userCopied = dataUser1.copy(email = "fabi_baru@mail.com")

    println("\n=== TEST COPY DATA CLASS ===")
    println("Original: $dataUser1")
    println("Copied  : $userCopied")

    val (id, name, email) = dataUser1
    println("\n=== TEST DESTRUCTURING ===")
    println("ID: $id, Nama: $name, Email: $email")
}