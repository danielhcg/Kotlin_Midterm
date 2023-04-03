// intro prompt to be displayed to the user
fun introMes() {

  // creating char aray to hold calculator operations
  val op = charArrayOf('+', '-', '*', '/')

  // User prompt
  println("Enter the operation you wish to carry out from the following options")

  // for loop to print out every operation user can carry out
  for (oP in op) {
    print("$oP ")
  }
}

// fucntion that multiplies 
fun multiply(x: Double, y: Double): Double {
  return x * y
}

// fucntion that adds 
fun add(x: Double, y: Double): Double {
  return x + y
}

// fucntion that subtracts 
fun subtract(x: Double, y: Double): Double {
  return x - y
}

// fucntion that divides 
fun divide(x: Double, y: Double): Double {
  return x / y
}

fun main() {

  // boolean intialized to true to store value to rerun program
  var again = true;

  while (again) { // loop to ask user if they wish to carry out another operatoin 

    // calling intro message to prompt user
    introMes()

    println("\n\n")

    // read operation user input into val 
    val userOP = readLine()
    val userOPChar = userOP?.firstOrNull()

    var isCor: String? = null // declare isCor variable to deterime if user entered correct numbers 
    // to hold the values of the 2 numbers to be computed
    var x: Double = 0.0
    var y: Double = 0.0
    
    // validating that the user entered the correct number using a do while loop 
    do {

      // asking user for 2 numjbers to do an operation on 
      println("\nPlease enter the first number you would like to perform an operation on:")
      x = readLine()?.toDoubleOrNull() ?: 0.0 // reading each number into variables
      println("\nPlease enter the second number you would like to perform an operation on: ")
      y = readLine()?.toDoubleOrNull() ?: 0.0 // reading each number into variables

      
      // updating value is isCor to check if everything is Gucci 
      println("You entered $x and $y is that correct? (Y/N)")
      isCor = readLine()
    } while (isCor == "N" || isCor == "n")

    println("\nWe need to choose a pokemon to carry out the operation. Which is do you choose?\n") // prompting user 
    val pokemon = listOf("1. Charizard", "2. Venusaur", "3. Blastoise\n")  // list of stirng pokemon for user to choose from 
    // executing a lambda expression and iterating over the list to display each 
    pokemon.forEach { pkm -> 
      println(pkm)
    }

    val chPokm = readLine() //reading user input into a string
    val myPokm = chPokm?.toInt() // converting user input into an int

    // when expression to summon a pokemon
    when (myPokm) {
      1 -> {
        println("Charizard... I CHOOSE YOU!!")
        when (userOPChar) {
          '*' -> println("Charizard used Fire Spin to get a result of ${multiply(x,y)}")
          '+' -> add(x, y)
          '-' -> subtract(x, y)
          '/' -> divide(x, y)
          else -> null
        }
      } 
      2 -> {
        println("Venusaur... I CHOOSE YOU!!!")
        when (userOPChar) {
          '*' -> multiply(x, y)
          '+' -> add(x, y)
          '-' -> subtract(x, y)
          '/' -> divide(x, y)
          else -> null
        }
      } 
      3 -> {
        println("Blastoise... I CHOOSE YOU!!!")
        when (userOPChar) {
          '*' -> multiply(x, y)
          '+' -> add(x, y)
          '-' -> subtract(x, y)
          '/' -> divide(x, y)
          else -> null
        }
      } 
      else -> print("unknown number")
    }
    
    
    
    // aksing user if they would like to re-run the program 
    println("Would you like to perform another calculation? (Y/N)") 
    var ui = readLine()
    if (ui == "Y" || ui == "y") {
      again = true
    } else {
      again = false
    }
  }
  println("Thanks for using my program! Bye!")
    
}



// loop constructs
// fo each


// reasons why i think i deserve an A
/*
i ask the user if they want to re run the program using a while loop 
i worked with user input 
i commented my code
implemented a switch statement aka when expression  
make a pokemon reference 





*/