import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    print("Введите целое число: ")
    val r = readln().toInt()
    println(r.square())

    println("\nЗадание 2")
    print("Введите первое слово: ")
    val  str1 = readln()
    print("Введите второе слово: ")
    val  str2 = readln()
    val reStr = str1.concatenation(str2)
    println(reStr)

    println("\nЗадание 3")
    print("Введите слово: ")
    val  str3 = readln()
    val index = str3.lastIndex()
    println("Индекс - $index, последняя буква ${str3[index]}")

    println("\nЗадание 4")
    print("Введите целое число: ")
    val s = readln().toInt()
    println(s.quadSqrt())
}

fun Int.square(): Int{
    return this * this
}

fun  String.concatenation(str:String): String {
    return "$this $str"
}

fun  String.lastIndex(): Int {
    return this.length-1
}

fun  Int.quadSqrt(): Double {
    return sqrt(this.toDouble())
}