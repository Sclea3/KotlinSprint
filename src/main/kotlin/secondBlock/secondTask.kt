package secondBlock

fun main() {
    val staffCount = 50
    val staffPersonalSalary = 30000
    val internCount = 30
    val internPersonalSalary = 20000

    val staffSalary = staffCount * staffPersonalSalary
    val internSalary = internCount * internPersonalSalary
    val commonSalary = staffSalary + (internSalary)
    val averageSalaryPerEmployee = commonSalary / (internCount + staffCount)

    print("Staff salary: $staffSalary\nCommon salary: $commonSalary\nAverage salary: $averageSalaryPerEmployee")
}