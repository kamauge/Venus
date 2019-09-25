data class Planets (var title: String){

    object Supplier{
        val planets = listOf<Planets>(Planets("Mercury"),
            Planets("Venus"),
            Planets("Earth"),
            Planets("Mars"),
            Planets("Jupiter"),
            Planets("Saturn"),
            Planets("Uranus"))
    }
}