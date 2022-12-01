package uk.co.matt_bailey.adventofcode2022

class Day01 {

    fun solvePart1(input: List<String>): Int {

        return getElfCalorieCounts(input).max()
    }

    fun solvePart2(input: List<String>): Int {

        return getElfCalorieCounts(input).sortedDescending().take(3).sum()
    }

    private fun getElfCalorieCounts(input: List<String>): List<Int> {
        var currentCount = 0
        val elfCalorieCounts = mutableListOf<Int>()
        for(line in input) {
            if(line.isEmpty()) {
                elfCalorieCounts += currentCount
                currentCount = 0
            } else {
                currentCount += line.toInt()
            }
        }
        elfCalorieCounts += currentCount
        return elfCalorieCounts
    }

}
