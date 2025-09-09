package secondBlock

const val MINS_IN_HOUR = 60

fun main() {
    val hoursDeparture = 9
    val minutesDeparture = 39
    val travelDurationMins = 457

    val minutesFromDayStartDeparture = hoursDeparture * MINS_IN_HOUR + minutesDeparture
    val minutesFromDayStartArrival = minutesFromDayStartDeparture + travelDurationMins

    val hoursArrival = minutesFromDayStartArrival / MINS_IN_HOUR
    val minutesArrival = minutesFromDayStartArrival % MINS_IN_HOUR
    print("Arrival time is $hoursArrival:$minutesArrival")
}
