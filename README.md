# Laboratorna6-TR23 https://github.com/RomanZalizniy/Laboratorna6-TR23 - link to the project on Git
Zavd1: https://github.com/RomanZalizniy/Laboratorna6-TR23/blob/main/Zavd1.java

This code creates two objects of class Person and calls their move() and talk() methods. The person1 object is created using a constructor without parameters, so its fullName and age fields receive the default values - an empty string and 0, respectively. The person2 object is created using a constructor with parameters, so its fields receive the values passed in the constructor.


Zavd2: https://github.com/RomanZalizniy/Laboratorna6-TR23/blob/main/Zavd2.java

In the task, you need to create three instances of the Phone class and display the values of their variables on the console. You also need to add the receiveCall and getNumber methods that accept parameters and return the value of the phone number.

Next, you need to add constructors: with three parameters (number, model, weight), with two parameters (number, model), and without parameters.

You also need to add an overloaded receiveCall method that takes two parameters - the name of the caller and the phone number, and call this method.

Finally, you need to create a sendMessage method with variable-length arguments. This method takes as input the phone numbers to which the message will be sent and displays them on the console.


Zavd4: https://github.com/RomanZalizniy/Laboratorna6-TR23/blob/main/Zavd4.java - File with main body.
zavd4pusk: https://github.com/RomanZalizniy/Laboratorna6-TR23/blob/main/zavd4pusk.java - Startup file.
Sedan: https://github.com/RomanZalizniy/Laboratorna6-TR23/blob/main/Sedan.java - Class Sedan for class Zavd4
Truck: https://github.com/RomanZalizniy/Laboratorna6-TR23/blob/main/Truck.java - Class Truck for class Zavd4

The main Car class is abstract and contains the model, color, and maximum speed fields. It also contains the gas() method, which simply displays the message "Accelerate!" and the abstract brake() method, which will be implemented in subclasses.

The Sedan and Truck classes are derived from the Car class and implement the brake() method. In our case, they simply display a message that the corresponding car is braking.

The Main class creates objects of the Sedan and Truck classes and executes their gas() and brake() methods to check the correctness of the code.


Zavd5: 

In this code, we declared a Baggage class with two private fields numberOfItems and totalWeight. The input() method allows the user to enter the number of items and the weight of each item separately using the Scanner object. The printTotalWeight() method displays the total weight of the luggage.

In this code, we create a new Baggage object, call the input() method to enter the number of items and the weight of each item, and call the printTotalWeight() method to display the total weight of the luggage.
