package firstLesson

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTES_IN_HOUR

fun main() {
    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / SECONDS_IN_HOUR
    val minutes: Int = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds: Int = totalSeconds % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}