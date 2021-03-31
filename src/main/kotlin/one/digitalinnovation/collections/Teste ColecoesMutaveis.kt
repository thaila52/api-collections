package one.digitalinnovation.collections

import kotlin.collections.forEach as forEach1

fun main() {
    val joao = Funcionario("Joao",  2000.0,  "CLT")
    val pedro = Funcionario("Pedro",1500.0,  "PJ" )
    val maria = Funcionario("Maria",4000.0, "CLT")
//poderia ter usado o arraylistOf que daria na mesma
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {println(it)}

    println(".......add............")
    funcionarios.add(pedro)
    funcionarios.forEach {println(it)}

    println("........remove...........")
    funcionarios.remove(joao)
    funcionarios.forEach {println(it)}

    println(".......set...........")
    val funcionarios2 = mutableSetOf (joao)
    funcionarios2.forEach{println(it)}

    println(".......add.........")
    funcionarios2.add(pedro)
    funcionarios2.add(maria)
    funcionarios2.add(joao) // o set não permite repetição, portanto, vai imprimir só um joao que já tinha na lista
    funcionarios2.forEach{println(it)}

    println(".......remove.........")
    funcionarios2.remove(maria)
    funcionarios2.forEach{println(it)}

}