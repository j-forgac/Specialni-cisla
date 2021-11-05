import java.util.*
import kotlin.math.pow

fun main(){
	val sc = Scanner(System.`in`)
	println("zadejte maximální hodnotu pro vypsání dokonalých čísel (min 0)")
	val upperBound = sc.nextInt()
	for(x in 0..upperBound){
		if(checkIfPerfectNum(x)) println(x)
	}
}

fun checkIfPerfectNum(num:Int): Boolean{
	var sum = 0
	for(x in 1 until num){
		if(num%x == 0) sum += x
	}
	return (sum == num)
}
