package com.kazu.givenwhenthen_junit

abstract class BaseUnitTest {

    /**
     * Defines the Given step in the test scenario.
     */
    fun Given(testSteps: BaseUnitTest.() -> Unit) {
        testSteps()
    }

    /**
     * Defines the When step in the test scenario.
     */
    fun When(testSteps: BaseUnitTest.() -> Unit) {
        testSteps()
    }

    /**
     * Defines the Then step in the test scenario.
     */
    fun Then(testSteps: BaseUnitTest.() -> Unit) {
        testSteps()
    }

    /**
     * Hook that runs before each test scenario.
     */
    abstract fun beforeEachScenario()

    /**
     * Hook that runs after each test scenario.
     */
    abstract fun afterEachScenario()

    /**
     * Executes a test scenario.
     *
     * @param caseComment
     * @param testSteps
     */
    fun steps(caseComment: String, testSteps: BaseUnitTest.() -> Unit) {
        if (caseComment.isNotEmpty()) {
            println(caseComment)
        }
        beforeEachScenario()
        this.testSteps()
        afterEachScenario()
    }
}