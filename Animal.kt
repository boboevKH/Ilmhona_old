/*
Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
Dog, Cat, Horse переопределяют методы makeNoise, eat соответственно.
Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.

Создайте класс Ветеринар, в котором определите метод treatAnimal(Animal animal).
Пусть этот метод распечатывает food и location пришедшего на прием животного.
В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте их на прием к ветеринару.
 */

 open class Animal  (
     val food: String,
     val location: String
         ) {

    open fun makeNoise(){
         println("Животное шумит")
     }

    open fun eat(){
         println("Животное кушает")
     }

    open fun sleep(){
         println("Животное спит")
     }
}