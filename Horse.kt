class Horse: Animal("сено","суша") {

    val name: String = "Лощадь"

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