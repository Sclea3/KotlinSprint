package firstBlock

fun `KB 1-3`() {
    val year = 1961
    var hour = "09"
    var minute = "07"
    print("$year\b$hour\n$minute\n")
    hour = "10"
    minute = "55"
    print("$hour:$minute")
}

fun main() {
    `KB 1-3`()
}