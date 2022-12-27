class Cat: Animal("мясо","суша") {

    val name: String = "Кошка"

    override fun makeNoise() {
        println("${name} мяукает")
    }

    override fun eat() {
        println("Есть ${food}")
    }

    override fun sleep() {
        println("${name} спит")
    }
}