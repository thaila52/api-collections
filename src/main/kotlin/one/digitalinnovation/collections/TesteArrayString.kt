package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes [0] = "Maria"
    nomes [1] = "Zazá"
    nomes [2] = "José"

    for(nome in nomes){
        println(nome)
    }
    println("...................")
    nomes.sort()
    nomes.forEach { println(it) }

    println("...................")
    val nome2 = arrayOf ("Maria", "Zazá", "José")
    nome2.sort()
    nome2.forEach { println(it) }

}