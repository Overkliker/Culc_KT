import kotlin.math.pow


fun culc(){
    while (true)
    {
        try {
            println("Введите знак")
            var znak : String = readLine()!!

            when (znak) {
                "+" -> {
                    println("Введите перое число")
                    var f : Int = readLine()!!.toInt()
                    println("Введите второе число")
                    var s : Int = readLine()!!.toInt()

                    println(f + s)
                }
                "-" -> {
                    println("Введите перое число")
                    var f : Int = readLine()!!.toInt()
                    println("Введите второе число")
                    var s : Int = readLine()!!.toInt()

                    println(f - s)
                }
                "/" -> {
                    println("Введите перое число")
                    var f : Int = readLine()!!.toInt()
                    println("Введите второе число")
                    var s : Int = readLine()!!.toInt()

                    println(f / s)
                }
                "*" -> {
                    println("Введите перое число")
                    var f : Int = readLine()!!.toInt()
                    println("Введите второе число")
                    var s : Int = readLine()!!.toInt()

                    println(f * s)
                }
                "^" -> {
                    println("Введите перое число")
                    var f : Float = readLine()!!.toFloat()
                    println("Введите второе число")
                    var s : Float = readLine()!!.toFloat()

                    val stepen = f.pow(s)
                    println(stepen)
                }
                "!" -> {
                    println("Введите число для факториала")
                    var f : Long = readLine()!!.toLong()
                    var sum : Long = 1
                    for (i in 1..f){
                        sum *= i
                    }
                    println(sum)
                }
                else -> {
                    print("такого знака нету")
                }
            }

        }catch (e: Exception){
            println(e.message)
        }
    }
}

fun main(args: Array<String>) {
    culc()
}