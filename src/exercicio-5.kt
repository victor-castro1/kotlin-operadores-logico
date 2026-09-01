/*
        5. Para praticar condições compostas, verifique se é um motorista E se ele tem mais de 30 anos
 */

fun main() {
    val idade = 29
    val motorista = true

    // Somente verdadeiro se -> motorista == true e (!(idade <= 30)) == true
    if (motorista && (!(idade <= 30))) {
        println("É um motorista com mais de 30 anos")
        println("Idade: $idade")
        println("motorista: $motorista")

    } else {
        println("Não atende aos dois requisitos")
        println("Idade: $idade")
        println("motorista: $motorista")
    }
}