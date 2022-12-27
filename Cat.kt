class Cat: Animal("мясо","суша") {

    val name: String = "Кошка"

    override fun makeNoise() {
        println("${name} спит")
    }

    override fun eat() {
        println("Есть ${food}")
    }

    override fun sleep() {
        println("Спит")
    }
}