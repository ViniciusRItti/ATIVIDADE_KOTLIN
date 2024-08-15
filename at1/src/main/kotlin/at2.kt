// Cálculos Básicos e Manipulação de Variáveis em Kotlin

fun main(args: Array<String>) {
    val nome: String = "Vinicius"
    val idade: Int = 20
    val salmensal: Double = 1.500
    val qtdtrabalho: Int = 12
    val qtdproduto: Int = 40

    val salanual: Double = salmensal * qtdtrabalho
    val descsalanual: Double = salmensal - 500
    val salliq: Double = "$descsalanual"
}