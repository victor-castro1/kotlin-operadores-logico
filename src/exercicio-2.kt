/*
        2. Crie uma variável que armazene a sua idade e verifique se, com a idade informada,
                    pode-se dirigir (regra para CNH → +18 anos pode dirigir)
 */

fun main() {
    // Declara idade
    val idade = 19

    // Condição if-else -> idade >= 18
    if (idade >= 18) {
        println("\nSua idade: $idade")
        println("Autorização para dirigir permitida")
    }

    else {
        println("\nSua idade: $idade")
        println("Autorização para dirigir recusada")
    }
}