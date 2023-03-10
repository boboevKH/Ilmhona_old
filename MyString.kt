/*
Определите класс MyString для работы со строками, класс String можно использовать, но без его методов!
Вот так можно создавать его объекты:
val myStr1 = MyString("Hello world")
val myStr2 = MyString() - пустая строка

У объектов этого класса можно вызывать следующие методы
(во всех методах, где нужно вернуть строку, строка должна быть типа MyString):
1) myStr1.printMyStrint() - просто печатает строку в консоль
1) myStr1.count() - возвращает количество символов в строке
2) myStr1.reverse() - возвращает строку в обратном порядке
3) myStr1.replace("abc", "123") - возвращает строку, в которой заменили все символы "abc" на "123"
4) myStr1.substring(3, 6) - возвращает подстроку из myStr1, начиная с 3 до 6 символов(без учета 6 символа)
5) myStr1.substring(5) - возвращает подстроку из myStr1, начиная с первого символа до 5(без учета 5 символа)
6) myStr1.asUppercase() - возвращает строку, все символы которой записаны в верхнем регистре
7) myStr1.asLowercase() - возвращает строку, все символы которой записаны в нижнем регистре
 */

class MyString {

    private var innerString = ""

    constructor(string: String)  {
        this.innerString = string
    }

    constructor() {
        this.innerString = ""
    }

    fun printMyString (){
        println(innerString)
    }

    fun count(): Int{
        var count = 0
        for(i in innerString) {
            count++
        }
        return count
    }

    fun reverse(): String{

        val endIndex = MyString(innerString).count()
        var newString = ""

        for (i in endIndex-1 downTo 0)
            newString += innerString[i]

        return newString
    }

    fun uppercase() : String {

        var newUpperString = ""

        for (char in innerString) {
            if (char.code !in 65..90) {
                newUpperString += (char.code - 32).toChar()
            } else newUpperString += char

        }
        return newUpperString
    }

}