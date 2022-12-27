class Horse: Animal("сено","суша") {

    val name: String = "Лощадь"

    override fun makeNoise() {
        println("${name} икает")
    }

    override fun eat() {
        println("Есть ${food}")
    }

    override fun sleep() {
        println("${name} спит")
    }
}