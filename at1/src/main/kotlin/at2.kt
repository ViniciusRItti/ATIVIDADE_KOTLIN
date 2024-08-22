fun main() {
    val nome: String = "João Silva"
    val idade: Int = 30
    val salarioBrutoMensal: Double = 2500.00
    val mesesTrabalhados: Int = 12
    val quantidadeProdutosComprados: Int = 15


    val salarioAnualBruto: Double = salarioBrutoMensal * mesesTrabalhados

    val desconto: Double = 500.00

    val salarioAnualLiquido: Double = salarioAnualBruto - desconto

    val mensagem: String = "Olá, $nome! Seu salário anual líquido é R$ $salarioAnualLiquido."

    println("Nome: $nome")
    println("Idade: $idade anos")
    println("Salário Bruto Mensal: R$ $salarioBrutoMensal")
    println("Quantidade de Meses Trabalhados: $mesesTrabalhados")
    println("Quantidade de Produtos Comprados: $quantidadeProdutosComprados")
    println("Salário Anual Bruto: R$ $salarioAnualBruto")
    println("Salário Anual Líquido: R$ $salarioAnualLiquido")
    println(mensagem)
}
