fun main(args: Array<String>) {

  // variable declaration section
  var userOP: Char // to hold value of operation user wants to use
  var userST: String

  // calling intro message to prompt user
  introMes()

  // reading in the stringvariable of the user to carry out a specific operation
  userST = readLine()

  // while loop to ask user to continually re-enter selection acceptable operation is entered
  while (userST.isEmpty()) {
    print("Invalid Entry. Please try again")
    userST = readLine()
  }
  userOP = userST.first()

  print("You selected " + userOP + "is this correct?")
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
// while loop
// do while
// fo each
