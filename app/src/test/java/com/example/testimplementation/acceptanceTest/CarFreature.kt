package com.example.testimplementation.acceptanceTest

import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import com.example.testimplementation.Car
import com.example.testimplementation.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test

class CarFreature {
    private val engine = Engine(15.0 , false)
    private val car = Car(5.0 , engine)

    @get:Rule
    var coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun `car is loosing fuel when it turns on `() = runBlockingTest{
        car.turnsOn()
        assertEquals(4.5 , car.fuel)
    }
    @Test
    fun `engine tempreture should be encreases when engin is turned on `() = runBlockingTest{
        car.turnsOn()

        assertEquals(95.0 , engine.tempreture)
        assertTrue(engine.isTurnedOn)
    }
}