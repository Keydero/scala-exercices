package keyprolab
package lectures


object ValuesVariablesTypes extends App {


  def sayHello(to: String): String = "Hi " + to + "!"
  print(sayHello("Den"))

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
  }
  //print(factorial(5))

  def fib(n: Int): Int = {
   if (n <= 2) 1
   else fib(n - 1) + fib(n - 2)
  }
  print(fib(8))

}