class Dog : Animal("кость", "суша") {

    val name: String = "Собака"

    override fun makeNoise() {
        println("${name} гавкает")
    }

    override fun eat() {
        println("Есть ${food}")
    }

    override fun sleep() {
        println("${name} спит")
    }
}