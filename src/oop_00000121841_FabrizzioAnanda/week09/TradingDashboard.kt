package oop_00000121841_FabrizzioAnanda.week09

fun main() {
    val tradeHistory = listOf(
    TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
    TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
    TradeLog("SOLUSDT", "LONG", 5, 12.0, "OPEN"),
    TradeLog("BTCUSDT", "SHORT", 25, -2.5, "CLOSED"),
    TradeLog("BNBUSDT", "LONG", 15, 8.4, "CLOSED"),
    TradeLog("ETHUSDT", "LONG", 10, -10.0, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}