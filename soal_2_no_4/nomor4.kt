//fun main() {
//    val baris = 6
//    for (i in 0 until baris) {
//        for (j in 0 until baris - i) {
//            print("* ")
//        }
//        println()
//    }
//    val baris2 = 6
//    for (i in 1..baris) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//
//    }
//}

fun printPattern(height: Int) {
    // Bagian pertama: segitiga terbalik
    for (i in height downTo 1) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }

    // Bagian kedua: segitiga normal
    for (i in 1..height) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun main() {
    val height = 6 // Sesuaikan angka ini untuk mengubah tinggi segitiga
    printPattern(height)
}
