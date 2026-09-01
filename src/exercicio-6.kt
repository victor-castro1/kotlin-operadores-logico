/*
        6. Crie um programa com 2 variáveis, uma que represente um nome de produto e outra que represente o preço.
        Agora, somente imprima uma mensagem como "desconto aplicado" quando o produto for iMac E o preço for maior ou igual a 10 mil.
                        Imprima também o valor com desconto aplicado de 12% para esse produto.
            Ou seja, a saída deve ser algo como: desconto aplicado de 12%. Total a pagar: R$ 19360
 */

fun main() {
    var produto = "iMac"
    var preco = 12_000

    // Desconto aplicado -> quando duas condições abaixo forem verdadeiras
    if (produto == "iMac" && preco >= 10_000) {

        // Calculando preço total c/ desconto
        val descontoAplicado = preco * 0.88
        println("\nDesconto aplicado: 12%")
        println("Produto: $produto")

        println("Preço a pagar antes: $preco")
        println("Preço a pagar agora: c/ desconto: $descontoAplicado")
    }
}