import sun.font.TrueTypeFont

class Car(val details:String, val color:String){
  fun abc(){
      println("$details with $color is an exceptional car")
  }
}

fun main() {
    fun abcc(message: String, Completion: () -> Unit) {
        println(message)
        Completion()
    }

    abcc("Hi This is a lambda expression", { println("Hi Hello") })

    fun def(maid: String, Completion1: (Car) -> Unit) {
        println(maid)
        val car = Car("Innova crysta", "Silver")
        Completion1(car)
    }

    def("U are a cheater") {
        it.abc()
    }

    fun abcd(mat:String, Completion2:(Car,Boolean)->Unit){
        val webrequest= true
        if (webrequest == true) {
            println(mat)
            val car1 = Car("Tata Harrier", "black")
            Completion2(car1, true)
        }
        else
            println("Do nothing")
    }

    abcd("mon mothma"){car,success ->
        if(success==true){
            car.abc()
        }

println("Hi hello")
println("Demand and supply")

    }

}