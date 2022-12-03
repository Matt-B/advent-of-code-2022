package uk.co.matt_bailey.adventofcode2022

import org.junit.jupiter.api.Test
import java.io.File

class Day03Test {

    private val exampleInputs = listOf(
        "vJrwpWtwJgWrhcsFMMfFFhFp",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
        "PmmdzqPrVvPwwTWBwg",
        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
        "ttgJtRGJQctTZtZT",
        "CrZsJsPPZsGzwwsLwLmpwMDw"
    )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day03().solvePart1(exampleInputs)
        assert(answer == 157)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day3.txt").readLines()
        val answer = Day03().solvePart1(inputs)
        assert(answer == 8153)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day03().solvePart2(exampleInputs)
        assert(answer == 70)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day3.txt").readLines()
        val answer = Day03().solvePart2(inputs)
        assert(answer == 2342)
    }
}
