package com.example.testimplementation

class Engine(
    var tempreture : Double,
    var isTurnedOn : Boolean
) {
    fun turnon(){
        tempreture = 95.0
        isTurnedOn = true
    }
}