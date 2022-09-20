    fun main(args: Array<String>) {
        var sum = 0
        for (arg in args) {
            sum += arg.toInt()
        }
        println("The sum is $sum.")
    }
