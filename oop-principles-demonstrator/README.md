# OOP Principles Demonstrator

A concise Java project showcasing fundamental object-oriented programming (OOP) principles, including inheritance, encapsulation, and polymorphism through a zoo simulation.

## Features

- **Inheritance**: The project demonstrates inheritance through the `Animal` class hierarchy. Specific animal types like `Girafa` extend the base `Animal` class, inheriting its properties and methods.
- **Encapsulation**: Classes such as `Zookeeper` and `Zoo` encapsulate specific behaviors and data. The `Animal` class uses private modifiers for its data members and provides public getters and setters, safeguarding the principle of data hiding.
- **Polymorphism**: Though not explicitly demonstrated in the provided code, the design permits polymorphism. For instance, various animals can override a potential `makeSound` method, allowing different animals to make different sounds.
- **Composition**: The `Zoo` class demonstrates composition, as it contains a list of `Animal` objects and an instance of `Zookeeper`.
- **Method Overloading**: The `Zoo` class has multiple constructors, showcasing constructor overloading based on the given parameters.

## Getting Started

### Prerequisites

Ensure the Java Development Kit (JDK) is installed on your machine to compile and run the program.

### Running the Program

1. Clone the repository.
2. Navigate to the directory containing the source files.
3. Compile the files:
   ```java
   javac program/*.java
   ```
4. Run the main program:
   ```java
   java program.Main
   ```

## Contributing

For contributions, please fork the repository and create a pull request. For any issues encountered, kindly report them in the issue tracker.

## License

This project is licensed under the MIT License (or insert your preferred license here).
