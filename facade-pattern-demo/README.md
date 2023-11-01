# Facade Design Pattern Demonstration

This repository demonstrates the use of the Facade Design Pattern to simplify interactions with a set of related classes (`OperatorMese` and `Picolo`). The `Facade` class offers a single method to determine if a table (`Masa`) is prepared, abstracting away the complex internal logic from the client.

## Core Concepts:

### 1. **Facade Pattern**:
The Facade Pattern is instrumental in abstracting complex subsystem operations into a single, easy-to-use interface. In this case, the `Facade` class offers a single method to determine if a table is ready.

### 2. **`Masa` Class**:
Represents a table with attributes for its number (`nrMasa`) and the number of seats (`nrLocuri`).

### 3. **`OperatorMese` Class**:
A utility class to determine if a table is free based on its number. This is a representative of the subsystems that `Facade` abstracts.

### 4. **`Picolo` Class**:
Represents a waiter. Provides methods to check if a table is cleared (`esteDebarasataMasa`) and set (`esteAranjataMasa`). Another crucial part of the subsystem that `Facade` interacts with.

### 5. **Client (`main` Method)**:
Initially, the client code directly interfaced with both `OperatorMese` and `Picolo`, leading to complex nested conditions. With the introduction of the `Facade`, this complexity is abstracted away, leading to cleaner and more readable client code.

## Usage:

Run the `main` method. The client code uses the `Facade` to determine if a table is prepared. If the table is ready, a message inviting the guest to the table is printed. Otherwise, a waiting message is shown.

This demonstration provides a clear understanding of how the Facade Design Pattern can simplify interactions with a set of related classes, leading to cleaner and more maintainable code.
