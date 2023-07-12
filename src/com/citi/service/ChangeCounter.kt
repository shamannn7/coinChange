package com.citi.service

import com.citi.model.Coin
import java.util.*

object Coins{
    val TWO_POUND = Coin(200, 1)
    val ONE_POUND = Coin(100, 1)
    val FIFTY_PENCE = Coin(50, 1)
    val TWENTY_PENCE = Coin(20, 1)
    val TEN_PENCE = Coin(10, 1)
    val FIVE_PENCE = Coin(5, 1)
    val TWO_PENCE = Coin(2, 1)
    val ONE_PENCE = Coin(1, 1)

    val coins: List<Coin> =
            listOf(TWO_POUND, ONE_POUND, FIFTY_PENCE, TWENTY_PENCE, TEN_PENCE, FIVE_PENCE, TWO_PENCE, ONE_PENCE)
}

fun countChange(amount: Int) : List<Coin> {
    val change = LinkedList<Coin>()
    var leftAmount = amount
    Coins.coins.map {
        if(leftAmount / it.value > 0){
            val newAmount = leftAmount / it.value
            change.add(Coin(it.value, newAmount))
            leftAmount = (leftAmount - it.value * newAmount)
            }
        }
    return change
}

fun main(args: Array<String>) {
    println("change 150" + countChange(150))
    println("change 102" + countChange(102))
    println("change 107" + countChange(107))
    println("change 141" + countChange(141))
}