package tenthLesson

fun main() {
    println("Введите длину пароля:")
    val length = readln().toInt()
    println("Ваш пароль: ${passwordGenerator(length)}")
}

fun passwordGenerator(passwLength: Int): String {
    val digits = (0..9)
    val specialSymbols = "!\"#$%&'()*+,-./"
    val spacebar = " "

    require(passwLength >= 3) { "Пароль должен быть не короче 3 символов" }

    val pool = digits + specialSymbols + spacebar
    val base = listOf(
        digits.random(),
        specialSymbols.random(),
        spacebar.first()
    )

    val rest = (1..(passwLength - base.size)).map { pool.random() }

    return (base + rest).shuffled().joinToString("")
}