fun main() {
val number = 2
    for(i in 1..10) {
        // 2 x 1 = 2, 2 x 2 = 4
//        println(number.toString() + "x" + i + "=" + (number * i))
        //String Templating
        println("$number x $i = ${number*i}")
   }
}