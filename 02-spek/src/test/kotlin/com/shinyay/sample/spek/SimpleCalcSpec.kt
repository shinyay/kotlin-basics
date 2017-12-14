package com.shinyay.sample.spek

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

object SimpleCalcSpec: Spek({
    describe("SimpleCalc") {
        on("add") {
            val sum = add(1, 2)

            it("sum") {
                assertEquals(3, sum)
            }
        }
    }
})