package secondBlock

fun main() {
    val buffPercent = 0.2
    val minedIron = 11
    val minedCrystal = 7

    val bonusIron = bonusResources(buffPercent, minedIron)
    val bonusCrystals = bonusResources(buffPercent, minedCrystal)
    print("Bonus iron: $bonusIron\nBonus crystals: $bonusCrystals")
}

fun bonusResources(buffPercent: Double, baseValue: Int): Int {
    return (buffPercent * baseValue).toInt()
}