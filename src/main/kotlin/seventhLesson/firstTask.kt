package seventhLesson

fun main() {
    val counter = 6
    var password = ""
    val digits = ('1'..'9')
    val letters = ('a'..'z')

    for (i in 1..counter) {
        password += if (i % 2 != 0) digits.random() else letters.random()
    }
    println(password)
}