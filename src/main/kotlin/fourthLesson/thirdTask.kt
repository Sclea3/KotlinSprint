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
    val perfectWeather = WeatherForBeans(
        isSunny = true,
        isAwningOpen = true,
        humidity = 20,
    )
    println(chechIsWeatherSuitable(todayWeather, perfectWeather))
}

fun chechIsWeatherSuitable(todayWeather: WeatherForBeans, perfectWeather: WeatherForBeans): String {
    return "Благоприятные ли условия сейчас для роста бобовых? ${todayWeather.isSunny == perfectWeather.isSunny && todayWeather.isAwningOpen == perfectWeather.isAwningOpen && todayWeather.humidity == perfectWeather.humidity && todayWeather.season != "winter"}"
}