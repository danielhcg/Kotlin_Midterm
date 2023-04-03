fun main(args: Array<String>) {
  
  // calling intro message to prompt user 
  introMes()
  
  
}

// intro prompt to be displayed to the user 
fun introMes() {
  
  //creating char aray to hold calculator operations
  val op = charArrayOf('+', '-', '*', '/')
  
  // User prompt
  println("Enter the operation you wish to carry out from the following options")

  // for loop to print out every operation user can carry out 
  for (oP in op) {
    print("$oP ")
  }
}

// loop constructs 
// while loop
// do while 
// fo each 