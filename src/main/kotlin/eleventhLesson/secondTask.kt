package eleventhLesson

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String  = "",
) {
    fun displayInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Email: $email")
        println("Bio: $bio")
    }

    fun updateBio(newBio: String) {
        println("Введите новое описание профиля:")
        val newBio = readln()
        bio = newBio
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен.")
        } else {
            println("Неверный текущий пароль.")
        }
    }
}

fun main() {
    val user = User(1, "user123", "password", "sad@ww.com")
    user.displayInfo()
    user.updateBio("Abc")
    user.changePassword()
    user.displayInfo()
}