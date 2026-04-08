# Java-Fundamentals


A comprehensive repository for mastering fundamental concepts of Java programming, core data structures, and essential algorithms. This project aims to provide clean, well-documented, and executable DSA programs.


## Current Contents in Detail

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
compareTo(): It compares it lexigraphically.
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
