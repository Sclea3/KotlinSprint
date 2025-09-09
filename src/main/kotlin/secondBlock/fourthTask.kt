package secondBlock

fun main() {
    val buffPercent = 20
    val minedIron = 11
    val minedCrystal = 7

    val bonusIron = bonusResources(buffPercent, minedIron)
    val bonusCrystals = bonusResources(buffPercent, minedCrystal)
    print("Bonus iron: $bonusIron\nBonus crystals: $bonusCrystals")
}

fun bonusResources(buffPercent: Int, baseValue: Int): Int {
    return (baseValue * buffPercent / 100.0).toInt()
}