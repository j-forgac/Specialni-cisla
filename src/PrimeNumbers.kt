import java.util.*
import kotlin.math.sqrt

fun main(){
	val sc = Scanner(System.`in`)
	println("zadejte maximální hodnotu pro vypsání prvočísel (min 2)")
	val upperBound = sc.nextInt()
	for(x in 2..upperBound){
		if(checkIfPrimeNum(x)) println(x)
	}
}

fun checkIfPrimeNum(num:Int): Boolean{
	for(x in 2..sqrt(num.toDouble()).toInt()){
		if(num%x == 0) return false
	}
	return true
}