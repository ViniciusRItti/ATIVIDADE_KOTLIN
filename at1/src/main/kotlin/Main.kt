//1 - Manipulação de Variáveis Simples em Kotlin
fun main() {
    val idade: Int = 16
    val altura: Double = 1.5
    val nome: String = "Vinicius"
    val estudante: Boolean = true
    val outraIdade: Int = 25
    val somaIdades: Int = idade + outraIdade
    val multiplicaAltura: Double = altura * 2
    val saudacao: String = "Ola $nome"

    println("A idade é: $idade")
    println("Altura: $altura")
    println("Nome: $nome")
    println("É Estudante: $estudante")
    println("Soma das Idades: $somaIdades")
    println("Altura dobrada: $multiplicaAltura")
    println("Saudacao: $saudacao")
}