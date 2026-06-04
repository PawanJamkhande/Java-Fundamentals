# Java-Fundamentals


A comprehensive repository for mastering fundamental concepts of Java programming, core data structures, and essential algorithms. This project aims to provide clean, well-documented, and executable DSA programs.


## Current Contents in Detail

Java Development Notes:

Core Java:

	- Java is object-oriented high level programming language
	- High level language means easy to read, write and understand the code
=======================================================================================================================================================================
Features of java:
	- It is platform independent. It means WORA write once read anywhere.
	- Java code can run on any operating system (OS) without changing the code, It converts code into bytecode
	- Object-oriented, It helps in code reusability
	- Simple, Easy to learn and use no pointers in java which reduces complexity
	- Secure: 1. bytecode verification
		  2. no direct access to memory
   		  3. Security manager protects the  system.
	- Robust: 1. exception handling
		  2. automatic garbage collection
		  3. String memory management.
	- Multi-threading: i. Can run multiple tasks simultaneously
			  ii. Improve CPU performance
	- Portable: Same program runs on different operating system or platforms, no need for modification.
=======================================================================================================================================================================
 - Java was initially introduced as OAK by GREEN TEAM.
 - In 1991, OAK was renamed JAVA by author James Gosling.
 - Java editions:
	1. Java Standard edition (Java SE) :- uses core java platforms.
	2. Java Enterprise edition (Java EE) :- Built on top of Java SE for large-scale, distributed application.
	3. Java Micro Edition (Java ME) :- Subset of Java SE for mobile devices.
	4. Java Card (JC) :- Used in SIM cards, banking cards, NFC, mobile payments etc.
 - Structure of Java code:-
	
	Public class Demo1{
	 public static void main(String[] args){
	
	 }
	}
	
	- every project must have at least one class
	- public - means accessible everywhere
	- static - means no need for object creation manage memory create only one reference object copy
	- void - no return, void itself returns empty data type
	- String[] args - command line argument
	- Execution flow of java:
		1. Load class
		2. Finds main() method
		3. Starts execution from main() method, main method is entry point of java program
	- System is class
	- out is object
	- println is method to write data and also to move to next line
	
  - Characteristics of an object:
   Object defines the behaviour, identity and its description, The characteristics of an object are the qualities or properties that define, describe, and identify the object, such as its size, shape, color, material, weight, and function.

  - Characteristics of an class:
   A class is a blueprint or template that defines the attributes and behaviors of objects. Its characteristics include attributes, methods, encapsulation, abstraction, inheritance, and polymorphism.

Data Types:

 - Data types define what type of data variable can store
 - Data types are of two types
	1. Primitive data types
	2. Non-primitive
PRIMITIVE TYPE	NON-PRIMITIVE TYPE
1. Primitive types are pre defined in java	1. Non-primitive types are created by programmer or java libraries
2. Primitive data types store actual values with fix size	2. Non-primitive types can have inbuilt methods for eg. string.length, string.toLowerCase, array.sort
3. It stores reference to objects and do not have a fix size
	

Primitive data type:
1.byte-1 byte : wrapper class - Byte
2.int - 4 byte  : wrapper class - Integer/ BigInteger
3.long - 10 byte

Variables:-

 - variable is a container of java which is used to store data values
 - variable is random access memory
 - Syntax :- Datatype VariableName = value;

Types of variables:

 1. Local variable:- It is declared inside method, constructor or block
		   - Scope is limited
		   - We cannot local variable outside of the block
 2. instance variable:- It is declared inside the class but outside the main method
		      - Each object has its own copy
		      - it is also called as Non-static variable
 3. Static variable:- It is declared using static keyword
		    - Shared with all objects of the class
		    - Static variable is also called ad class level variable
		    - Can be accessed using class name, object is not needed.

CONSTRUCTOR:

 - Constructor is special method used to initialize the object.
 - It is called automatically when an object of class is created.
 - Rules or features of constructor:
	1. Constructor name and class name should be same.
	2. No return type not even void
	3. Called automatically when "new" keyword is used.
	4. Used to initialize variables also.

Types Of Constructor

 1. Default - No parameters or arguments
	for e.g.:-
		Menu(){
		String menuName = "biryani"
		}
 2. Parameterized - Takes an argument.
	for e.g.:-
		menu(String menuName){
		menuName = "biryani";
		}
 3. Copy Constructor - created manually.
		     - Used to copy object of parameterized constructors to this constructor.
	for e.g.:-
		Menu(Menu m){
		 menuName = m.menuName;
		}

THIS KEYWORD:

 - This keyword is a reference variable in java that referee to the current object.
 - why do we use THIS keyword in java
	- We use this keyword if variable are same in instance vs local.
	- To call current class method or constructor
	- To pass current object we use THIS keyword

SCANNER CLASS:
 - Scanner class is available in java.util package, to take the user input we use scanner class
 - Used To read user input's type of variable we use scanner class
 - Scanner has in
	- nextInt() - to read integer.
	- nextByte() - to read byte value.
	- nextshort() - to read short value.
	- nextBoolean() - to read Boolean value.
	- nextFloat() - to read decimal value.
	- nextLine() - to read whole string content.
=======================================================================================================================================================================
What is java, and why we are using java language.
explain the java components.
What is byte code
Why main method is static. -JVM can call main method without creating object.
What is variable in java and types of variables.
Can we run java program without main method.
Explain the data types in java.
How does the java architecture works.
What is constructor and why we use it.
What is scanner.
Explain the internal working of JVM.
What is garbage collector.
======================================================================================================================================================================
DECISION MAKING/ CONDITIONAL STATEMENTS:

 - Decision making statement
 - It is used to control flow of program based on condition
 - IF statement - It execute only when the condition is true
 	        - Syntax:- if(condition){
			     //block of code
		           }
 - IF-ELSE condition - if condition is true IF block will execute otherwise ELSE block will execute.
		     - Syntax:- if(condition){
				  //block of code
				}
				else{
				  //block of code
				}
 - ELSE-IF Ladder - multiple condition can be checked with else-if condition
		  -Syntax:-If(condition){
				//block of code
			   }
 - Switch case - is used to execute one block of code from multiple options based on variable value
	       - "break" is used to terminate a particular case.
	       - Syntax:-switch(expression){
				case 1:
				  //block of  code
				  break;
				case 2:
				  //block of code
				  break;
			}

LOOPS:

1.While Loop



2.Do-While Loop
 - Do-while loop is a type of loop that is executed at least once and repeat as long as condition is.
 - Do-while execute at least once even of the condition is false.
 - Condition is checked at the end.
 - Must end with semi-colon ";".
 - Syntax:-
	   do{
 		//Block of code
	   }while(condition);




ARRAY:

 - Array is a collection of homogenous data type collection stored in single variable.
 - Array is needed to store multiple items of same data type in a single variable name.
 - Characteristics of Array.
	1. Array index starts from zero.
	2. Array is of fixed size.
	3. Array stores multiple value in single variable.
	4. Array is called static memory allocation.
 - Declaration syntax :- typeOfArray arrayName[] =  {}
			 Type_Of_Array Array_Name = new Type_Of_Array

OOPS CONCEPT IN JAVA:

 - OOP stands for object oriented programming language.
 - It is based on concepts of objects which contain data and behavior.
 - OOP helps to organize the coding structure with improved reusability, provide security.
 - There of fours pillar of oops concept:-
	1. Inheritance
	2. Polymorphism
	3. Encapsulation
	4. Abstraction
 - Class is the blueprint and object is equal to runtime entity which describes identity state behavior class.

ACCESS MODIFIER:

 - Access Modifier control visibility in the code
 - They are use with objects, classes and variables

1.Private
 - Private members are accessible only within the same class
 - It is used for the data hiding security
 - We can access private data outside of the class
 - to access outside class we need getter and setter methods

2.Public
 - Public members can accessed in any class, any method or form anywhere with help of objects.

3.Protected
 - Protected members are accessible within the same and subclass even in different package
 - It is used in Inheritance

ABSTRACTION:
 - Abstraction means hiding the internal details and showing only essential features to user.
 - For e.g. In ATM we can deposit or withdraw money but as an end user no need to check the backend functions.
 - Abstraction is achieved through abstract class.
 - Rules of abstraction:
	i. Abstract class acts as the base class, it is declared using abstract keyword.
	2. Abstract class contains both abstract and non-abstract method.
	3. To declare a method as abstract class should be abstract.
	4. We cannot create object of abstract class.
	5. At a time we can extend only one abstract class.
	6. Abstract class contain static data.

INTERFACE:
 - Interface is used to achieve multiple inheritance in java.
 - Interface is declared using interface keyword.
 - By default all methods are abstract in interface.
 - At a time we can extend more than one interface.
 - class to class -> extends.
 - interface to interface -> extends.
 - class to interface -> implements.
 - By default the variables are static and final.
 - We cannot create object of interface.

EXCEPTION HANDLING:

EXCEPTION:-
 - Exception is an event that occurs and disrupts the flow during program execution.

Types of Exception:-
  |
  |- User Defined Exception.
  |
  |-Built in Exception.
	|
	|-Checked Exception.
	|	|
	|	|- Class not found
	|	|- Interrupted Exception
	|	|- IO Exception
	|	|- Instantiation Exception
	|	|- SQL Exception
	|
	|- Unchecked Exception
		|
		|- Arithmetic Exception
		|- Class cast Exception
		|- Null Pointer Exception
		|- Array index out of bounds
		|- Array store Exception
		|- Illegal thread State Exception

ERROR:-
 - Error is a serious problem that occurs in JVM.
 - Generally this errors are not recoverable.
 - Error is a class and it is subclass of throwable class.

Difference between Exception and Error:

Error	Exception
1. Caused by JVM or system resource	1. Exception is caused by application logic or runtime condition
2. Application generally terminates	2. With exception we can continue program execution
3. We are not able to handle errors	3. We can handle exception using try-catch block
4. for e.g.: Out-Of-Memory error	4. Arithmetic exception, Null point exception, etc.

 
Object
 |-> Throwable
	|
	|- Exception
	|   |
	|   |- I/O Exception
	|   |- Class not found Exception
	|   |- SQL Exception
	|   |- Runtime Exception
	|	|
	|	|- Arithmetic exception
	|	|- Null pointer exception
	|	|- Number format exception
	|	|- Index out of bound exception
	|		|
	|		|- String index out of bound exception
	|		|- Array index out of bound exception
	|
	|- Error
	   |
	   |- Stack overflow Error
	   |- Virtual machine Error
	   |- Out of memory Error
	

Throw	Throws
1. Java throw keyword is used to explicitly throw an exception	1. Java throws keyword is used to declare an exception
2. Checked exception cannot be propagated using throw only	2. Checked exception can be propagated with throws.
3. Throw is followed by an instance	3.Throws is followed by class
4. Throw is used within a method	4. Throws is used with method signature
5. You cannot throw multiple exception	5. You can declare multiple exceptions


### `01_Strings`
String is a class which is used to store text. If both strings are equal they are using same memory.
StringBuilder is the class which is used to store mutable strings that can be changed.
A string is a sequence of characters. In Java, strings are objects of the String class and are immutable, meaning once created, their content cannot be changed. Strings can be manipulated using various built-in methods like charAt(): read the character from specific index.
subString(): extract the part of string.
toString(): convert StringBuilder to string.
length(): Return the size of string.
append(): We can add data at the end.
insert(): we can add data at specific position.
replace(): it repaces the character between indexes.
delete(): deletes the character between index.
deleteAtChar(): it deletes specific character at index.
reverse(): it display the reverse the string.
setCharAt(): It update specific character at index.
compareTo(): It compares it lexigraphically. (A to Z = 67 - 90 || a to z = 97 - 122)


  * `ReverseString.java`: Implementation of string reversal using various techniques.
  * `CheckPalindrome.java`: Function to determine if a string is a palindrome.


### `02_Arrays`

An array is a collection of elements of the same data type stored in contiguous memory locations. Each element is accessed by its index (position), starting from 0. Arrays have a fixed size determined at creation and allow fast random access to any element in O(1) time.

  * `FindMaxElement.java`: Algorithm to find the largest element in an array.
  * `RotateArray.java`: Implementations for left and right array rotation.
  * `TwoSumProblem.java`: Solution for the classic Two Sum problem using arrays.

 
### `03_Recursion`

Recursion is a programming technique where a function calls itself directly or indirectly to solve a problem. A recursive function must have:

Base case: A condition that stops the recursion
Recursive case: The function calling itself with modified parameters

  * `Factorial.java`: A program to calculate the factorial of a number using recursion.
  * `FirstOccurence`: A function that calls itself to traverse the array until the desired element is found or the end of the array is reached.

### `04_Linked_list`

A linked list is a linear data structure where elements (called nodes) are stored in non-contiguous memory locations. Each node contains:

Data: The actual value stored in the node
Next pointer: A reference to the next node in the sequence

  * `Addatbeginning.java`: Implementation to add a node at the beginning of a linked list.
  * `RemoveVowels.java`: A linked list traversal example demonstrating node iteration.

## Getting Started

### Prerequisites

You need the following installed on your machine:

  * Java Development Kit (JDK) 8 or higher
  * A code editor or IDE (e.g., IntelliJ, VS Code, Eclipse)

### Cloning the Repository

```bash
git clone https://github.com/YourUsername/Java-Fundamentals.git
cd Java-Fundamentals
```

### Running the Code

To compile and run any `.java` file, navigate to its directory (e.g., `03_Arrays`) and use the following commands in your terminal:

```bash
# Compile the file
javac FileName.java

# Run the compiled class file
java FileName
```



## Contribution

Contributions are always welcome\! If you have a better implementation, fixed a bug, or want to add a new concept, please feel free to submit a **Pull Request**.

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add AmazingFeature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.

## License

This project is licensed under the MIT License - see the `LICENSE` file for details.



**Happy Coding**
