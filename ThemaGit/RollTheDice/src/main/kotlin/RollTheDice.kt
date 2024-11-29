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


    // Todo: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat
    println("Want to play? y/n")
    while (readln() == "y") {
        val playerScore = aDie.nextInt(1..6)
        val computerScore = aDie.nextInt(1..6)
        println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
        when {
            playerScore > computerScore -> println("Du gewinnst")
            playerScore < computerScore -> println("Der Computer gewinnt")
            else -> println("Unentschieden")
        }

    }


}
