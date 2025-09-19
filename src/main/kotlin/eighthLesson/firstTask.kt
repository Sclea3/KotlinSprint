package eighthLesson

import javax.swing.text.View

fun main() {
    val mondayViews = 123
    val tuesdayViews = 321
    val wednesdayViews = 1221
    val thursdayViews = 55
    val fridayViews = 53
    val saturdayViews = 312
    val sundayViews = 42

    val arrayOfViews = intArrayOf(
        mondayViews,
        tuesdayViews,
        wednesdayViews,
        thursdayViews,
        fridayViews,
        saturdayViews,
        sundayViews
    )
    val totalViews = arrayOfViews.sum()
    println("Всего просмотров за неделю: $totalViews")
}
