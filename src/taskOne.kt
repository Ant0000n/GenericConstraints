import kotlin.math.sign

/*Создать обобщенный класс States, который содержит функцию getAverage(),
возвращающую среднее значение массива чисел.
Класс имеет ограничение, работать может только с числовыми значениями, T:Number.*/

fun main() {
val statesInt= States(arrayOf(1,2,3,4,5))
    val average = statesInt.getAverage()
    println(average)
}

class States<T: Number>(val array: Array <T>) {
    fun getAverage(): Double {
        var sum = 0.0
        for (i in array.indices) {
            sum += array[i].toDouble()
        }
        return sum / array.size
    }
}