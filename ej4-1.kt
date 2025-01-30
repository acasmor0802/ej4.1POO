class Rectangulo(private val base: Double, private val altura: Double) {
    init {
        require(base > 0) { "La base debe ser mayor que 0" }
        require(altura > 0) { "La altura debe ser mayor que 0" }
    }

    fun calcularArea(): Double {
        return base * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Rectangulo(base=$base, altura=$altura)"
    }
}

fun main() {
    val rectangulo1 = Rectangulo(4.0, 5.0)
    val rectangulo2 = Rectangulo(6.0, 3.0)
    val rectangulo3 = Rectangulo(7.5, 2.5)

    val rectangulos = listOf(rectangulo1, rectangulo2, rectangulo3)

    for (rect in rectangulos) {
        println(rect)
        println("Área: ${rect.calcularArea()}")
        println("Perímetro: ${rect.calcularPerimetro()}")
    }
}
