package oop_00000121841_FabrizzioAnanda.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loanRecord = Loan(title, borrower, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku  : ${loanRecord.bookTitle}")
    println("Peminjam    : ${loanRecord.borrower}")
    println("Lama Pinjam : ${loanRecord.loanDuration} hari")
    println("Total Denda : Rp ${loanRecord.calculateFine()}")
}