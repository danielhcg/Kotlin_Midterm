fun main() {

  // boolean intialized to true to store value to rerun program
  var again = true;

  while (again) { // loop to ask user if they wish to carry out another operatoin 

    // calling intro message to prompt user
    introMes()

    println("\n\n")

    // read user input into val 
    val userOP = readLine()!!.first()

    var isCor: String? = null // declare isCor variable to deterime if user entered correct numbers 

    // validating that the user entered the correct number using a do while loop 
    do {

      // asking user for 2 numjbers to do an operation on 
      println("\nPlease enter the first number you would like to perform an operation on:")
      var x = readLine()?.toIntOrNull() ?: 0 // reading each number into variables
      println("\nPlease enter the first number you would like to perform an operation on: ")
      var y = readLine()?.toIntOrNull() ?: 0 // reading each number into variables

      // updating value is isCor to check if everything is Gucci 
      println("You entered $x and $y is that correct? (Y/N)")
      isCor = readLine()
    } while (isCor == "N" || isCor == "n")

    println("We need to choose a pokemon to carry out the operation. Which is do you choose?") // prompting user 
    val pokemon = listOf("Charizard", "Venusaur", "Blastoise")  // list of stirng pokemon for user to choose from 
    // executing a lambda expression and iterating over the list to display each 
    pokemon.forEach { pkm -> 
      println(pkm)
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

// loop constructs
// fo each


// reasons why i think i deserve an A
/*
i ask the user if they want to re run the program using a while loop 
i worked with user input 
i commented my code





*/