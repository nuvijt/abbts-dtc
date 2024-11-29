import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241129
 */

fun main() {

    val aDie = Random
    println("What`s your name?")
    val playerName = readln()
    println("Welcome $playerName")
    var scorePlayer = 0
    var scoreComputer = 0

    println("Want to play? y/n")
    while (readln() == "y") {
        val playerScore = aDie.nextInt(1..6)
        val computerScore = aDie.nextInt(1..6)
        println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")

        when {
            playerScore > computerScore -> {
                println("Du gewinnst")
                scorePlayer += 1
            }

            playerScore < computerScore -> {
                println("Der Computer gewinnt")
                scoreComputer += 1
            }

            else -> println("Unentschieden")
        }
        println("Want to play again? y/n")


    }

    println("$playerName $scorePlayer : $scoreComputer Computer")
}
