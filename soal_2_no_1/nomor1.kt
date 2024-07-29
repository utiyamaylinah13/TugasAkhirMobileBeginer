fun getGrade(average: Double): Char {
    return when {
        average in 90.0..100.0 -> 'A'
        average in 80.0..89.9 -> 'B'
        average in 70.0..79.9 -> 'C'
        average in 60.0..69.9 -> 'D'
        average in 0.0..59.9 -> 'E'
        else -> 'X' // Invalid grade range
    }
}

fun main() {
    val subjects = listOf("Bahasa Indonesia", "Bahasa Inggris", "Matematika", "IPA")
    val scores = mutableListOf<Double>()

    println("Masukkan nilai untuk setiap mata pelajaran:")

    for (subject in subjects) {
        while (true) {
            print("$subject: ")
            val input = readLine()
            try {
                val score = input?.toDoubleOrNull() ?: throw NumberFormatException()
                if (score < 0 || score > 100) throw IllegalArgumentException("Nilai harus antara 0 dan 100")
                scores.add(score)
                break
            } catch (e: Exception) {
                println("Input tidak valid: ${e.message}. Silakan coba lagi.")
            }
        }
    }

    val average = scores.average()
    val grade = getGrade(average)

    println("\nRata-rata nilai: %.2f".format(average))
    println("Grade: $grade")
}
