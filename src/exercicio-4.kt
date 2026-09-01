/*
        4. Para praticar condições compostas, verifique se é um motorista OU se ele tem 17 anos ou mais
 */

fun main() {
    val motorista = true
    val idade = 16

    // || (OU) -> Somente 1 condição = True, logo if == true
    if (motorista || idade >= 17) {
        println("É um motorista ou é maior que 17 anos")
        println("Motorista: $motorista")
        println("Idade: $idade")

    } else {
        println("Não é um motorista e não é maior ou igual que 17 anos")
        println("Motorista: $motorista")
        println("Idade: $idade")

    }
}