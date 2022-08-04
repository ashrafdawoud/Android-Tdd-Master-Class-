package com.example.testimplementation

class Car(
    var fuel: Double,
    var engine: Engine
) {
    fun turnsOn() {
        fuel-=0.5
        engine.turnon()
    }
}