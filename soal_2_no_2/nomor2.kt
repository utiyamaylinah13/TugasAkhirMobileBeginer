fun replaceOWithA(input: String): String {
    return input.replace('o', 'a')
}

fun main() {
    val originalWord = "Purwokerto"
    val modifiedWord = replaceOWithA(originalWord)
    println("Kata sebelumnya: $originalWord")
    println("Kata yang diganti: $modifiedWord")
}
