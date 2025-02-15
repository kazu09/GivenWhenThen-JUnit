package com.kazu.givenwhenthen_junit

import org.junit.Test
import org.junit.Assert.*

class MainUnitTest : BaseUnitTest() {

    // viewModel
    private val viewModel = MainViewModel()

    override fun beforeEachScenario() {
        // Not defined because it is not processed.
    }

    override fun afterEachScenario() {
        // Not defined because it is not processed.
    }

    @Test
    fun before_result_test() {
        val flag = 1
        val result = viewModel.outputName(flag)
        assertEquals(result, TEST)
    }

    @Test
    fun result_test() {
        var flag = 0
        var result = ""
        steps("Check return Test-san") {
            Given {
                flag = 1
            }
            When {
                result = viewModel.outputName(flag)
            }
            Then {
                assertEquals(result, TEST)
            }
        }

    }

    @Test
    fun result_hoge() {
        val flag = 0
        var result = ""
        steps("Check return hogehoge-san") {
            When {
                result = viewModel.outputName(flag)
            }
            Then {
                assertEquals(result, HOGE)
            }
        }
    }

    companion object {
        const val TEST = "Test-san"
        const val HOGE = "hogehoge-san"
    }
}