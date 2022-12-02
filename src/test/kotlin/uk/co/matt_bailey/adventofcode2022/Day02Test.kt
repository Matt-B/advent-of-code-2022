package uk.co.matt_bailey.adventofcode2022

import org.junit.jupiter.api.Test
import java.io.File

class Day02Test {

    private val exampleInputs = listOf(
        "A Y",
        "B X",
        "C Z"
    )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day02().solvePart1(exampleInputs)
        assert(answer == 15)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day2.txt").readLines()
        val answer = Day02().solvePart1(inputs)
        assert(answer == 11873)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day02().solvePart2(exampleInputs)
        println("Answer is $answer")
        assert(answer == 12)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day2.txt").readLines()
        val answer = Day02().solvePart2(inputs)
        println("Answer is $answer")
    }
}
