package com.example.testimplementation.unitTest

import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import com.example.testimplementation.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test

class EngineShould {
    val engine = Engine(15.0 , false)

    @get:Rule
    var coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun turnedOn() = runBlockingTest{
        engine.turnon()
        assertEquals(engine.tempreture , 95.0)
        assertTrue(engine.isTurnedOn)
    }
}