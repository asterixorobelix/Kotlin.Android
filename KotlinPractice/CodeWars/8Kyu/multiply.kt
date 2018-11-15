//The code does not execute properly. Try to figure out why.
fun main(args: Array<String>) {
    multiply(2.3,4.7)
}

fun multiply(x: Double, y: Double) :Double
{
    var multipliedNumber = x*y
    println("multiply $x by $y equals ${String.format("%.2f",multipliedNumber)}")
    return multipliedNumber
} 