/*Создать класс по имени GenericMethod и обобщенную функцию внутри класса по имени isItIncluded().
Функция isItIncluded() определяет, является ли объект членом массива.
Он может быть использован с любым типом объектов и массивов до тех пор,
пока массив содержит объекты, совместимые с типом искомого объекта.*/

fun main() {
    val generic = GenericMethods()
    print(generic.isItIncluded(10, arrayOf(1, 2, 3, 4, 5, 6)))
}

class GenericMethods {
    fun <T> isItIncluded(value: T, array: Array<T>): Boolean {
        for (i in array.indices) {
            if (value == array[i]) {
                return true
                break
            }
        }
        return false
    }
}