package oop_00000121841_FabrizzioAnanda.week02

class Pemain {
    var nama: String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    init {
        this.nama = "Kodir";
        println("Ini adalah constructor");
    }

    constructor(Alias: String="Faysal Enjoy", kecepatan: Int=2){
        nama = Alias;
        speed = kecepatan;
        println("Ini adalah constructor kedua");

    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola");

    }
}
fun main (){
    val player = Pemain(Alias="Yoel", kecepatan=100);
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill Kecepatan: "+player.speed);

    val player2 = Pemain(Alias="kodir", kecepatan=99);
    println("pemain populer: ${player2.nama}");
    println("kecepatan: ${player2.speed}");
}