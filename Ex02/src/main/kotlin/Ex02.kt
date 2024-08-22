fun main() {
    // 1. Criação de Variáveis
    val nomePessoa: String = "Ana" // Nome da pessoa
    val idadePessoa: Int = 30 // Idade da pessoa
    val salarioBrutoMensal: Double = 4500.00 // Salário bruto mensal
    val quantidadeMesesTrabalhados: Int = 12 // Quantidade de meses trabalhados em um ano
    val quantidadeProdutosComprados: Int = 20 // Quantidade de produtos comprados
    val valorTotalGasto: Double = 1500.00 // Valor total gasto com produtos

    // 2. Atribuição de Valores
    // Os valores foram atribuídos ao declarar as variáveis acima

    // 3. Operações Simples
    // Calcular o salário anual bruto
    val salarioAnualBruto: Double = salarioBrutoMensal * quantidadeMesesTrabalhados

    // Valor fixo de desconto
    val desconto: Double = 2500.00

    // Calcular o salário anual líquido
    val salarioAnualLiquido: Double = salarioAnualBruto - desconto

    // Calcular a média do valor gasto por produto
    val mediaValorGastoPorProduto: Double = if (quantidadeProdutosComprados > 0) valorTotalGasto / quantidadeProdutosComprados else 0.0

    // Concatenação da string com o nome da pessoa e o salário anual líquido
    val mensagem: String = "Olá, $nomePessoa! Seu salário anual líquido é R$$salarioAnualLiquido."

    // 4. Exibição de Resultados
    println("Nome da pessoa: $nomePessoa")
    println("Idade da pessoa: $idadePessoa")
    println("Salário bruto mensal: R$$salarioBrutoMensal")
    println("Quantidade de meses trabalhados em um ano: $quantidadeMesesTrabalhados")
    println("Quantidade de produtos comprados: $quantidadeProdutosComprados")
    println("Valor total gasto com produtos: R$$valorTotalGasto")
    println("Salário anual bruto: R$$salarioAnualBruto")
    println("Salário anual líquido: R$$salarioAnualLiquido")
    println("Média do valor gasto por produto: R$$mediaValorGastoPorProduto")
    println(mensagem)
}
