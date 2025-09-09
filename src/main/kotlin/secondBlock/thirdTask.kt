package secondBlock

fun main() {
    val hoursDeparture = 9
    val minutesDeparture = 39
    val travelDurationMins = 457

    val minutesFromDayStartDeparture = hoursDeparture * 60 + minutesDeparture
    val minutesFromDayStartArrival = minutesFromDayStartDeparture + travelDurationMins

    val hoursArrival = minutesFromDayStartArrival / 60
    val minutesArrival = minutesFromDayStartArrival % 60
    print("Arrival time is $hoursArrival:$minutesArrival")
}
