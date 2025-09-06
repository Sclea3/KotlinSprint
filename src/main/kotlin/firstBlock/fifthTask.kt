package firstBlock

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    print(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}