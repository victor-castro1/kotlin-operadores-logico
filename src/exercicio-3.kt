/*
                                (Baseado na questão 2)
            3. Inverta a lógica, ou seja, verifique se a idade informada NÃO pode dirigir
 */

fun main() {
    // Declara idade
    val idade = 17
    val adulto = idade >= 18

    // Operador Lógico -> NOT (!)
    if (!adulto) {
        println("\nSua idade: $idade")
        println("Autorização para dirigir RECUSADA")
    }

    else {
        println("\nSua idade: $idade")
        println("Autorização para dirigir PERMITIDA")
    }
}