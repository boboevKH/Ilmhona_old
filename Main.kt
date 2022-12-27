

fun main(){

    val dog : Dog = Dog()
    val cat: Cat = Cat()
    val horse: Horse = Horse()

    val animals = listOf<Animal>(dog,cat,horse)

    val veter: Veterinar = Veterinar()


    for(i in animals) {
        veter.treatAnimal(i)


}

    val myStr1 = MyString("Hello world")
    val myStr2 = MyString()

    myStr1.printMyStrint()
    myStr2.printMyStrint()
}


