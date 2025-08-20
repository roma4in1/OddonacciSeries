Oddonacci Series Performance Analysis
Overview
This project implements and analyzes different recursive approaches for computing the Oddonacci sequence - a mathematical series similar to the Fibonacci sequence, but where each term is the sum of the three preceding terms instead of two.
The Oddonacci sequence starts with: 1, 1, 1, 3, 5, 9, 17, 31, 57, 105, ...
Where each term after the first three is calculated as: F(n) = F(n-1) + F(n-2) + F(n-3)
Features
This implementation provides three different recursive approaches to calculate the Oddonacci sequence:

Binary Recursion - Direct recursive implementation (exponential time complexity)
Linear Recursion - Optimized recursive approach (linear time complexity)
Tail Linear Recursion - Memory-efficient tail recursive implementation

Implementation Details
Recursive Approaches

oddonacci_binary(int n): Classical recursive implementation that directly follows the mathematical definition. Has exponential time complexity O(3^n).
oddonacci_Linear(int n): Optimized linear recursive approach that maintains state in an array, reducing redundant calculations. Has linear time complexity O(n).
oddonacci_tailLinear(int n): Tail recursive implementation that reuses a single array to store intermediate results, making it memory efficient.
Performance Analysis
The program measures execution time for each approach across different input sizes (5 to 65 in increments of 5) and outputs the results to OddoOut.txt. This allows for empirical comparison of the different algorithmic approaches.
Usage
Prerequisites

Java Development Kit (JDK) 11 or higher
Any Java IDE (IntelliJ IDEA, Eclipse, etc.) or command line

Running the Program

Clone this repository
Compile the Java file:
bashjavac OddonacciSeries.java

Run the program:
bashjava OddonacciSeries


The program will automatically:

Execute all three recursive approaches with varying input sizes
Measure execution times in nanoseconds
Generate performance results in src/OddoOut.txt

Output
The program generates a performance analysis file (OddoOut.txt) containing execution times for each approach. The results demonstrate the significant performance differences between exponential and linear time algorithms.
Educational Purpose
This project serves as an excellent example for:

Understanding different recursive programming techniques
Analyzing algorithmic time complexity
Comparing naive vs. optimized recursive implementations
Performance measurement and benchmarking in Java

Project Structure
├── src/
│   ├── OddonacciSeries.java    # Main implementation
│   └── OddoOut.txt            # Performance results output
├── .gitignore
└── README.md
Author
Romain Corbel (Student ID: 40257534)
COMP 352 - Data Structures and Algorithms
Assignment #1
License
This project is created for educational purposes as part of a university assignment.
