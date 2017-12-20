package com.shinyay.sample.spek

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import kotlin.test.assertEquals

object SimpleCalcSpec: Spek({
    describe("com.shinyay.sample.spek.SimpleCalcを用いた四則演算") {
        beforeGroup { println("テスト対象を示すグループ：describe の事前処理") }
        afterGroup { println("テスト対象を示すグループ：describe の事後処理") }

        context("足し算を実施する関数：add を利用する場合") {
            beforeGroup { println("特定の条件を示すグループ：足し算context の事前処理") }
            afterGroup { println("特定の条件を示すグループ：足し算context の事後処理") }

            beforeEachTest { println("add 関数の各テストの事前処理") }
            afterEachTest { println("add 関数の各テストの事後処理") }
            on("add 関数の単純呼び出し") {
                it("1 + 2") {
                    assertEquals(3, add(1, 2))
                }
                it("11 + 22") {
                    assertEquals(33, add(11, 22))
                }
            }
            on("add 関数の再帰呼び出し") {
                it("1 + 2 + 3") {
                    assertEquals(6, add(1, add(2,3)))
                }
            }
        }
        context("割り算を実施する関数：subtract を利用する場合") {
            beforeGroup { println("特定の条件を示すグループ：割り算context の事前処理") }
            afterGroup { println("特定の条件を示すグループ：割り算context の事後処理") }

            beforeEachTest { println("subtract 関数の各テストの事前処理") }
            afterEachTest { println("subtract 関数の各テストの事後処理") }
            on("subtract 関数の単純呼び出し") {
                it("5 - 2") {
                    assertEquals(3, subtract(5, 2))
                }
                it("4 - 7") {
                    assertEquals(-3, subtract(4,7))
                }
            }
            on("add 関数の再帰呼び出し") {
                it("10 - 9 - 8") {
                    assertEquals(-7, subtract(subtract(10,9),8))
                }
            }
        }

    }
})