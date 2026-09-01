/*
        1. Criar um programa que deverá comparar a igualdade de duas Strings.
                    Ou seja, a string A é igual a string B?
 */

fun main() {
    // Declaração de variáveis
    val jogo = "Minecraft"
    val jogo1 = "Terraria"

    // Compara -> conteúdo das variáveis
    val comparacao = (jogo == jogo1)

    // Exibe o conteúdo de cada variáveis
    println("\nPrimeiro Jogo: $jogo")
    println("Segundo Jogo: $jogo1")

    // Resultado da comparação
    println("\nOs jogos são iguais? -> $comparacao")
}