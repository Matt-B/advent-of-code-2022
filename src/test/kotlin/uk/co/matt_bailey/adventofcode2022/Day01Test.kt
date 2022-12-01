package uk.co.matt_bailey.adventofcode2022

import java.io.File
import kotlin.test.Test

class Day01Test {

    private val exampleInputs = listOf(
        "1000",
        "2000",
        "3000",
        "",
        "4000",
        "",
        "5000",
        "6000",
        "",
        "7000",
        "8000",
        "9000",
        "",
        "10000"
    )

    @Test
    fun `Part 1 - Can solve provided example`() {

        val answer = Day01().solvePart1(exampleInputs)

        assert(answer == 24000)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day1.txt").readLines()

        val answer = Day01().solvePart1(inputs)

        assert(answer == 68442)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {

        val answer = Day01().solvePart2(exampleInputs)

        assert(answer == 45000)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day1.txt").readLines()

        val answer = Day01().solvePart2(inputs)

        assert(answer == 204837)
    }
}
