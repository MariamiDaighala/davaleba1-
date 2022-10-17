import kotlin.math.sqrt
import kotlin.math.pow
fun main() {

    val ritskhvi1 = Fraction(1, 2)
    val ritskhvi2 = Fraction (2, 4)
    println(ritskhvi1, ritskhvi2)

}

open class Point( public val x: Double, public val y: Double) {

    override fun toString(): String {
        return "$x, $y"
    }

    override fun equals(other: Any?): Boolean {
        return super.toString() == other.toString()
    }

    }

    fun symetriaravi(): String {
        val -x = negativeX
        val -y = negativeY
        return "$-x, $-y "
    }

    fun distance(obj: Point): Double {
        val iqsebi: Double = .x - obj.x
        val igrekebi: Double = .y - obj.y
        return sqrt(iqsebi.pow(2.0) + igrekebi.pow(2.0))
    }
}

class Fraction (private var numerator: Int, private var demoninator: Int){
    fun shekvetsa(): String {
        var bulki:Int = numerator
        var mshia:Int = demoninator
        for (i in 2 .. bulki) {
            while(bulki % i ==0  &&  mshia % i == 0) {
                bulki /= i
                mshia /= i
            }
        }
        return "$bulki, $mshia"
    }

    fun plus (frc:Fraction): String {

        var kivi1: Int = numerator
        var banani1: Int = demoninator
        var kivi2: Int = frc.numerator
        var banani2: Int = frc.demoninator
        val vashlatama: Int = demoninator

        if (demoninator != frc.demoninator) {
            kivi1*= banani2
            banani1 *= banani2
            kivi2 *= vashlatama
            banani2 *= vashlatama
        }

        var davighale: Int = kivi1 + kivi2
        var kidetsota = Fraction (davighale, banani2)
        return kidetsota.shekvetsa()
    }

    fun ikosgakopha(frc: Fraction): String{
        val a : Int = numerator/frc.numerator
        val b : Int = demoninator/frc.demoninator
        return "$a, $b"
        println("imedia shebrunebuli gamravleba ar unda dametsera, vitireb((")
    }



}


