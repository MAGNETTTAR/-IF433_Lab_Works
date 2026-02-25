package oop_00000121841_FabrizzioAnanda.week02

class StudentW2 (
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String,
){
    class Student (val name: String, val nim: String, var major: String) {
        init {
            // Validasi Sederhana: Cek panjang NIM
            if (nim.length != 5) {
                println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
                println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
            } else {
                println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
            }
        }
    }
}