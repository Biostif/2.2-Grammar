fun main(args: Array<String>) {
    val likes = 5416464
    if (likes in 11..19 || likes%100 in 11..19){
        println("У Вас $likes лайков")
    } else if (likes in 2..4 || likes%10 in 2..4) {
        println("У Вас $likes лайка")
    } else if (likes == 1 || likes%10 == 1) {
        println("У Вас $likes лайк")
    } else  println("У Вас $likes лайков")
}