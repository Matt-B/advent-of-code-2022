package uk.co.matt_bailey.adventofcode2022

class Day03 {

    private val priority = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun solvePart1(input: List<String>): Int {
        var totalPriority = 0
        for (line in input) {
            var compartment1 = line.substring(0 until (line.length / 2))
            var compartment2 = line.substring((line.length / 2) until line.length)
            var common = compartment1.toList().intersect(compartment2.toList().toSet())
            totalPriority += (priority.indexOf(common.first()) + 1)
        }
        return totalPriority
    }

    fun solvePart2(input: List<String>): Int {
        var index = 0
        var totalPriorities = 0

        while (index < input.size) {
            var firstIntersect = input[index].toCharArray().toSet().intersect(input[index + 1].toCharArray().toSet())
            var secondIntersect = firstIntersect.intersect(input[index + 2].toCharArray().toSet())
            totalPriorities += (priority.indexOf(secondIntersect.first()) + 1)
            index += 3
        }
        return totalPriorities
    }
}
