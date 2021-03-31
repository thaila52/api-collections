package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.created(joao.nome, joao)
    repositorio.created(pedro.nome, pedro)
    repositorio.created(maria.nome, maria)

    println(repositorio.findById( maria.nome))

    println("..............................")
    repositorio.findAll().forEach{println(it)}

    println("..............................")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}



}