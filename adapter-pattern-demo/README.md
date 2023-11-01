# Adapter Design Pattern Demonstration

This repository demonstrates the use of the Adapter Design Pattern. It showcases how classes with incompatible interfaces can be made compatible, enabling them to work together seamlessly. In this demonstration, a `Leasing` class, which was initially not compliant with the `Creditable` interface, is adapted using both Object and Class Adapters.

## Core Concepts:

### 1. **Adapter Pattern**:
The Adapter Pattern is a structural design pattern that provides a way to interoperate classes with incompatible interfaces by providing a middle layer that translates one interface for the other.

### 2. **`Creditable` Interface**:
A simple interface defining a contract with a single method - `crediteaza()`. This method is expected to be implemented by any class that wishes to provide credit-related functionalities.

### 3. **`Leasing` Class**:
Represents a leasing operation. It has its own method, `oferaLeasing()`, which is independent of the `Creditable` interface.

### 4. **Object Adapter (`AdapterLeasing`)**:
An implementation of the Adapter Pattern using composition. This adapter holds an instance of the `Leasing` class and maps the `crediteaza()` method of the `Creditable` interface to the `oferaLeasing()` method of the `Leasing` class.

### 5. **Class Adapter (`AdapterLeasingClase`)**:
An implementation of the Adapter Pattern using inheritance. By inheriting from the `Leasing` class and implementing the `Creditable` interface, this adapter class effectively bridges the gap between the two.

### 6. **Client (`Main` Class)**:
Demonstrates the usage of both Object and Class Adapters, showing how the `Leasing` class can be made to work where a `Creditable` object is expected.

## Usage:

Run the `main` method in the `Main` class. This will showcase:

1. The functionality of the `Leasing` class being accessed via the `AdapterLeasing` object adapter.
2. The same functionality being accessed through the `AdapterLeasingClase` class adapter.

By observing the output, you can appreciate how the Adapter Pattern enables the `Leasing` class to be compliant with the `Creditable` interface without altering its original implementation.
