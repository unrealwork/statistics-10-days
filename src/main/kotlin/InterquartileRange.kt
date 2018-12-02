fun main(args: Array<String>) {
    readLine()
    val nums: IntArray = readIntArray()
    val frequencies: IntArray = readIntArray()
    val seq = nums.withIndex().asSequence()
            .flatMap { (0..frequencies[it.index]).asSequence().map { _ -> it.value } }
            .sorted()
            .toList()
    val len = seq.size
    val q1 = if (len % 4 == 0) seq[len / 4 - 1].toDouble() else (seq[len / 4 - 1] + seq[len / 4]) / 2.0
    val q3 = if (len % 4 == 0) seq[len / 4 * 3].toDouble()
    else (seq[len / 4 * 3] + seq[(len / 4 * 3) + 1]) / 2.0
    println(q3 - q1)
}


private fun readIntArray() =
        readLine()?.split("\\s".toRegex())
                ?.map { it.toInt() }
                ?.toIntArray()!!