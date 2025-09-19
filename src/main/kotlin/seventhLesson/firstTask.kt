package seventhLesson

fun main() {
    val counter = 6
    var password = ""
    var pool = ('a'..'z')+('1'..'9')
    for (i in 1..counter) {
        val charForPassw: Char = pool.random()
        password += charForPassw
    }
    println(password)
}