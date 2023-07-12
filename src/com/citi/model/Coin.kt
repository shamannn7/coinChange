package com.citi.model

class Coin (val value : Int, val amount : Int){
    override fun toString(): String {
        return "${amount} coins of ${value} pence."
    }
}