import java.text.DecimalFormat

fun main() {

    val nomeProduto: String = "Tênis Esportivo"
    val precoUnitario: Double = 199.99
    val quantidadeComprada: Int = 3
    val taxaImposto: Double = 12.0 // Percentual
    val margemLucro: Double = 20.0 // Percentual

    val valorTotalSemImpostos: Double = precoUnitario * quantidadeComprada

    val valorImposto: Double = valorTotalSemImpostos * (taxaImposto / 100)

    val valorTotalComImpostos: Double = valorTotalSemImpostos + valorImposto

    val precoVendaNecessario: Double = valorTotalComImpostos * (1 + margemLucro / 100)

    val precoVendaArredondado: Double = "%.2f".format(precoVendaNecessario).toDouble()

    val formatoMoeda = DecimalFormat("R$ #,##0.00")

    val valorTotalFormatado = formatoMoeda.format(valorTotalComImpostos)
    val precoVendaFormatado = formatoMoeda.format(precoVendaArredondado)

    val mensagemFinal: String = """
        Produto: $nomeProduto
        Valor Total com Impostos: $valorTotalFormatado
        Preço de Venda Sugerido: $precoVendaFormatado
    """.trimIndent()

    println("Nome do Produto: $nomeProduto")
    println("Preço Unitário: R$ ${formatoMoeda.format(precoUnitario)}")
    println("Quantidade Comprada: $quantidadeComprada")
    println("Taxa de Imposto: $taxaImposto%")
    println("Margem de Lucro: $margemLucro%")
    println("Valor Total Sem Impostos: R$ ${formatoMoeda.format(valorTotalSemImpostos)}")
    println("Valor do Imposto: R$ ${formatoMoeda.format(valorImposto)}")
    println("Valor Total com Impostos: $valorTotalFormatado")
    println("Preço de Venda Necessário: $precoVendaFormatado")
    println(mensagemFinal)
}
