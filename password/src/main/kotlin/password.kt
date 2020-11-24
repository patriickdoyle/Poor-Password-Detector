//This program detects if a password is poor or strong
//CIS 211
//Prof. Liss
//Last edited by Pat Doyle 10/02/2020
fun main() {
    //ask the user to input a password
    println("Enter a password.")
    var password = readLine().toString()

    //use passwordStrengthDetector() to determine if the password is weak
    passwordStrengthDetector(password)
}

//function to test if the password has <= 8 characters
fun passwordLength(password: String): Boolean {
    if(password.length <= 8)
    {
        return false
    }//end if

    else
    {
        return true
    }//end else
}//end passwordLength

//function to test if password only contains letters
fun passwordLetters(password: String): Boolean {

    var allLetters = true

    for(element in password)
    {
        if(element.isDigit())
        {
            allLetters = false
        }//end if
    }//end for
    return allLetters
}//end passwordLetters()

//function to test if password only contains numbers
fun passwordNumbers(password : String): Boolean {
    var allNumbers = true

    for (element in password)
    {
        if(element.isLetter())
        {
            allNumbers = false
        }//end if
    }//end for
    return allNumbers
}//end passwordNumbers

//function to determine if password is poor
fun passwordStrengthDetector(password: String){
    //call functions to detect if password is poor
    var length = passwordLength(password)
    var letters = passwordLetters(password)
    var numbers = passwordNumbers(password)

    //inform the user if the password is poor and why
    when(length) {
        false -> println("Your password is too short!")
        else -> println("Your password length is good!")
    }//end when

    when(letters) {
        true -> println("Your password is weak. It is all letters.")
        else -> println("Your password is not all letters.")
    }//end when

    when(numbers) {
        true -> println("Your password is weak. It is all numbers.")
        else -> println("Your password is not all numbers.")
    }//end when
}//end passwordStrengthDetector()
