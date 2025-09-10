package fourthLesson

data class WeatherForBeans(
    val isSunny: Boolean,
    val isAwningOpen: Boolean,
    val humidity: Int,
    val season: String? = null,
)

fun main() {
    val todayWeather = WeatherForBeans(
        isSunny = true,
        isAwningOpen = true,
        humidity = 20,
        season = "winter",
    )

    println(checkIsWeatherSuitable(todayWeather))
}

fun checkIsWeatherSuitable(weather: WeatherForBeans): String {
    val isSuitable = weather.isSunny &&
            weather.isAwningOpen &&
            weather.humidity == 20 &&
            weather.season != null &&
            weather.season != "winter"

    return "Благоприятные ли условия сейчас для роста бобовых? $isSuitable"
}