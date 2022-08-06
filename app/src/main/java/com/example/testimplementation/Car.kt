package com.example.testimplementation

import kotlinx.coroutines.flow.collect

class Car(
    var fuel: Double,
    var engine: Engine
) {
    suspend fun turnsOn() {
        fuel-=0.5
        engine.turnon().collect {  }
    }
}