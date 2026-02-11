package oop_00000121841_FabrizzioAnanda.week02

import java.util.Scanner

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major)
            println("Status: Pendaftaran Selesai.")
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Status: Pendaftaran Selesai.")
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}