package eleventhLesson

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {
    val user1 = User(1, "login1", "password1", "add@mail.org")
    val user2 = User(2, "login2", "password2", "add2@mail.org")
    println("User 1: ${user1.id} ${user1.login} ${user1.password} ${user1.email}")
    println("User 2: ${user2.id} ${user2.login} ${user2.password} ${user2.email}")
}