class Utility {
    fun doCalculation(a: Int): Int {
        var b = getB()

        return a * b;
    }

    private fun getB(): Int {
        return 5;
    }
}