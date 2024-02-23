import kotlin.math.pow

fun main() {
    val n = 10
    var message = " HappY Valentines DaY <3 "
    val printMessage = 4

    if (message.length % 2 != 0) {
        message += " "
    }

    for (a in 0 until n) {
        for (b in 0..(4 * n)) {
            val distance1 = kotlin.math.sqrt((a - n).toDouble().pow(2) + (b - n).toDouble().pow(2))
            val distance2 = kotlin.math.sqrt((a - n).toDouble().pow(2) + (b - 3 * n).toDouble().pow(2))

            if (distance1 < n + 0.5 || distance2 < n + 0.5) {
                print("S")
            } else {
                print(" ")
            }
        }
        println()
    }

    for (a in 1 until 2 * n) {
        for (b in 0 until a) {
            print(" ")
        }

        for (b in 0 until (4 * n + 1 - 2 * a)) {
            if (a >= printMessage - 1 && a <= printMessage + 1) {
                val point = b - (4 * n - 2 * a - message.length) / 2

                if (point < message.length && point >= 0) {
                    if (a == printMessage) {
                        print(message[point])
                    } else {
                        print(" ")
                    }
                } else {
                    print("S")
                }
            } else {
                print("S")
            }
        }
        println()
    }
}
