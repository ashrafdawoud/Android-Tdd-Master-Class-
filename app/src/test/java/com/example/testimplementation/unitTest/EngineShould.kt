package com.example.testimplementation.unitTest

import com.example.testimplementation.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class EngineShould {
    val engine = Engine(15.0 , false)
    @Test
    fun turnedOn(){
        engine.turnon()

        assertEquals(engine.tempreture , 95.0)
        assertTrue(engine.isTurnedOn)
    }
}