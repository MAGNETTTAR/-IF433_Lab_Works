package oop_00000121841_FabrizzioAnanda.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var enemyHp = 100

    println("--- MINI RPG BATTLE ---")
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Stat Damage: ")
    val damage = scanner.nextInt()

    val myHero = Hero(name, damage)

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n=== STATUS BATTLE ===")
        println("HP ${myHero.name}: ${myHero.hp} | HP Musuh: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilih: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            myHero.attack("Musuh")
            enemyHp -= myHero.baseDamage

            if (enemyHp > 0) {
                val monsterDamage = (10..20).random()
                println("Musuh membalas! Memberikan $monsterDamage damage.")
                myHero.takeDamage(monsterDamage)
            }
        } else if (choice == 2) {
            println("Anda kabur dari pertarungan!")
            break
        }
    }

    println("\n--- HASIL AKHIR ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("Selamat! ${myHero.name} Menang!")
    } else if (!myHero.isAlive()) {
        println("Yah... ${myHero.name} telah gugur.")
    }
}