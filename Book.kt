/*
Опишите класс Book (Книга).
 */

class Book (
    val name: String,
    val year: Int,
    val author: String,
    val genre: String,
    val isPaperback: Boolean = true,
    val translateToRussian: Boolean = false,
    val minAge: Int = 0
){

    override fun toString(): String {
        return "Название: ${name}   Год:${year}     Жанр:${genre}"
    }

    fun main () {

        //Затем создайте список из 10 книг и определите следующее:
        val books = mutableListOf<Book>()
        books.add(Book("451° по Фаренгейту",2008,"Рэй Брэдбери","проза",false,true,16))
        books.add(Book("1984",2008,"Джордж Оруэлл","фантастика",true,false,16))
        books.add(Book("Мастер и Маргарита",2006,"Михаил Булгаков","проза",true,true,16))
        books.add(Book("Шантарам",2003,"Грегори Дэвид Робертс","приключения",false,true,18))
        books.add(Book("Три товарища",2000,"Эрих Мария Ремарк","проза",true,true,12))
        books.add(Book("Цветы для Элджернона",2012,"Дэниел Киз","фантастика",false,true,12))
        books.add(Book("Портрет Дориана Грея",1890,"Оскар Уайльд","фантастика",false,true,16))
        books.add(Book("Маленький принц",2005,"Антуан де Сент-Экзюпери","детская литература",true,true,6))
        books.add(Book("Над пропастью во ржи",2008,"Джером Д. Сэлинджер","проза",false,true,16))
        books.add(Book("Аленький цветочек",1857,"Аксаков","детская литература",true,true,5))

        //1) Сколько книг были выпущены начиная с 2010 года ?
        println(books.filter { it.year >= 2010 }.count())

        //2) Выведите авторов тех книг, жанр которых относится к фантастике.
        for (i in books.filter {it.genre == "фантастика"}) {
            println(i.author.toString())
        }

        //3) Определите есть ли в списке книги с мягким переплетом ?
        if (books.filter { it.isPaperback == true }.count()>0) {
            println(true)
        } else println(false)

        //4.1) Выведите из списка книги, у которых есть перевод на русский язык,
        for (i in books.filter { it.translateToRussian == true })
            println(i.toString())

        //4.2...........затем среди них найдите те книг, которые относятся исключительно для детей до 6 лет
        for (i in books.filter { it.translateToRussian == true }.filter { it.minAge < 6 })
            println(i.toString())
    }
}