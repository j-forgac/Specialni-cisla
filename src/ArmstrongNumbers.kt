import java.util.*
import kotlin.math.pow

fun main(){
	val sc = Scanner(System.`in`)
	println("zadejte maximální hodnotu pro vypsání armstrong čísel (min 0)")
	val upperBound = sc.nextInt()
	for(x in 0..upperBound){
		if(checkIfArmstrongNum(x)) println(x)
	}
}

fun checkIfArmstrongNum(num:Int): Boolean{
	val ciphers = num.toString()
	var sum = 0.0
	for(x in ciphers){
		sum += Character.getNumericValue(x).toDouble().pow(ciphers.length)
	}
	return (sum.toInt() == num)
}
