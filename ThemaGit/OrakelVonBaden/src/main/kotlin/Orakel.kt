import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Gibt beim Start einen Sinnspruch , ein Glückssymbol und eine Glückszahl
 * aus.
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

// Die Sprüche des Tages
val spells = listOf("Nutze den Tag.", "Heute ist ein toller Tag.", "Bist du nicht tot, lebste noch", "Menschen wie Tee, in einem Sack unter Wasser")
val charms = listOf("Kleeblatt", "Hühnerfuss", "Hasenpfote", "WindowsPC")
val randomZahl = Random
fun main() {
    val random = Random
    val index = random.nextInt(spells.size)
    println("Dein Leitspruch heute: ${spells[index]}")

    println("Dein Glückssymbol: ${charms[index]}")
    println("Deine glückszahl: ${randomZahl.nextInt(1..50)}")
}