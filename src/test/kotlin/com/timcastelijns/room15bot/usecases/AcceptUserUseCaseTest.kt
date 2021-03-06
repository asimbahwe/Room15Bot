package com.timcastelijns.room15bot.usecases

import com.timcastelijns.room15bot.bot.usecases.AcceptUserUseCase
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AcceptUserUseCaseTest {

    @Test
    fun testOutputIsCorrect() {
        val input = "shog9"
        val expectedOutput = "@shog9 welcome. Please start by reading the [rules](http://room-15.github.io/) and confirm you have read them before saying anything else."

        assertEquals(expectedOutput, AcceptUserUseCase().execute(input))
    }

    @Test
    fun testSpacesAreRemovedFromName() {
        val input = "jon skeet"

        assertTrue { AcceptUserUseCase().execute(input).startsWith("@jonskeet") }
    }

}
