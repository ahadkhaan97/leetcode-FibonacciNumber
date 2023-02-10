fun main() {
    print(fib(2))
}

fun fib(n: Int): Int {
    var first = 0
    var second = 1
    var sum = 1
    for (i in 0 until n - 1) {
        sum = first + second
        first = second
        second = sum
    }
    return sum
}