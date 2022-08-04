package com.example.testimplementation.acceptanceTest

import com.example.testimplementation.Car
import com.example.testimplementation.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class CarFreature {
    private val engine = Engine(15.0 , false)
    private val car = Car(5.0 , engine)

    @Test
    fun `car is loosing fuel when it turns on `(){
        car.turnsOn()
        assertEquals(4.5 , car.fuel)
    }
    @Test
    fun `engine tempreture should be encreases when engin is turned on `(){
        car.turnsOn()

        assertEquals(95.0 , engine.tempreture)
        assertTrue(engine.isTurnedOn)
    }
}