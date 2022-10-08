fun main(args: Array<String>) {
    var likesPeople = 503
    val differentPeople: String = if (likesPeople == 1 || (likesPeople - 1) % 10 == 0) {"человеку"} else {"людям"}
    println("Понравилось $likesPeople $differentPeople")
}