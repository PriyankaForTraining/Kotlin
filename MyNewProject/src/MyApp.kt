fun main(){

        var number = 13
        var result = when (number){
            11 ->"Eleven"
            12 ->"Twelve"
            in 13 .. 19 -> "Teen"
            else -> "Not in Range"
        }
        println(result)

}
