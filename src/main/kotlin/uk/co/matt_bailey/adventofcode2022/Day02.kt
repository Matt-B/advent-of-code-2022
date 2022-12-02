package uk.co.matt_bailey.adventofcode2022

class Day02 {

    private val gameTable = hashMapOf<String, Map<String, Int>>(
        "X" to hashMapOf("A" to 4, "B" to 1, "C" to 7),
        "Y" to hashMapOf("A" to 8, "B" to 5, "C" to 2),
        "Z" to hashMapOf("A" to 3, "B" to 9, "C" to 6)
    )

    fun solvePart1(input: List<String>): Int {
        var totalScore = 0
        for (line in input) {
            var player1 = line.split(" ").first()
            var player2 = line.split(" ").last()

            var score = gameTable[player2]?.get(player1)
            if (score != null) {
                totalScore += score
            }
        }
        return totalScore
    }

    private val resultTable = mapOf<String, Map<String, Int>>(
        "A" to mapOf("X" to 3, "Y" to 4, "Z" to 8),
        "B" to mapOf("X" to 1, "Y" to 5, "Z" to 9),
        "C" to mapOf("X" to 2, "Y" to 6, "Z" to 7)
    )

    fun solvePart2(input: List<String>): Int {
        var totalScore = 0
        for (line in input) {
            var player1 = line.split(" ").first()
            var desiredResult = line.split(" ").last()

            var score = resultTable[player1]?.get(desiredResult)
            if (score != null) {
                totalScore += score
            }
        }
        return totalScore
    }
}
