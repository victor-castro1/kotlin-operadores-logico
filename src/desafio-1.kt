/*
                                       Desafio:  When
    1.Crie um programa que saiba se o valor passado pelo usuário é fim de semana ( "SAB" ou "DOM" )
                ou se é um dia útil ( "SEG", "TER", "QUA", "QUI" e "SEX" ).

            Caso o usuário não forneça nenhum destes dias corretamente, informar um erro.
 */
fun main() {
    println("\nDigite um dia da semana:")
    println("(SEG, TER, QUA, QUI, SEX, SAB, DOM)")

    // readln() -> ler valor digitado pelo usuário
    // uppercase() -> transformar tudo em MAIÚSCULO
    val dia = readln().uppercase()

    // Condição (when) -> baseado em vários valores (SAB, DOM, SEG.....)
    when (dia) {
        "SAB", "DOM" -> {
            println("É fim de semana")
        }

        "SEG", "TER", "QUA", "QUI", "SEX" -> {
            println("É um dia útil")
        }

        else -> {
            println("Dia informado inválido")
            println("Use apenas: SEG, TER, QUA, QUI, SEX, SAB ou DOM")
        }
    }
}