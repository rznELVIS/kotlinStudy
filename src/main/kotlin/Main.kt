fun main() {
    println("What's your name?")
    val name = readln()

    val utility = Utility()

    val d = utility.doCalculation(10)
    println("Hello, $name!, $d")
}