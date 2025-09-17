package fifthLesson

const val SHIP_NAME = "Heart of Gold"
const val ADMIN_USER_NAME = "Zaphod"
const val ADMIN_USER_PASSWORD = "PanGalactic"

fun main() {
    showWelcomeMessage()

    val userName = getInput("Введите логин:")

    if (userName.isEmpty()) {
        println("Вы не ввели логин")
        return
    }

    if (userName != ADMIN_USER_NAME) {
        println("Вы не зарегистрированы в системе")
        return
    }

    val password = getInput("Введите пароль:")

    if (password.isEmpty()) {
        println("Вы не ввели пароль")
        return
    }

    if (password != ADMIN_USER_PASSWORD) {
        println("Неверный пароль")
        return
    }

    showSuccessMessage()
}

fun getInput(message: String): String {
    println(message)
    return readLine() ?: ""
}

fun showWelcomeMessage() {
    println("Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля " +
            "\"$SHIP_NAME\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли " +
            "приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, " +
            "об этом не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...")
}

fun showSuccessMessage() {
    println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь \"$ADMIN_USER_NAME\", вам " +
            "разрешено входить на борт корабля \"$SHIP_NAME\". Хотя мне всё равно... Ну вперед, войдите... " +
            "Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится " +
            "пребывание здесь больше, чем мне.")
}