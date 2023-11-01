# Factory Pattern Demonstration: Medical Staff

This repository demonstrates the Factory Design Pattern through a simple example of creating instances of medical staff.

## Core Concepts:

### 1. **Factory Pattern**:
The `Factory` class encapsulates the instantiation logic for different types of medical staff, abstracting away the details from the client code.

### 2. **Types of Medical Staff**:
- **Medic (Doctor)**: Represents a doctor.
- **Asistent (Assistant)**: Represents a medical assistant.
- **Brancardier (Stretcher Bearer)**: Represents a stretcher bearer.

### 3. **Enumeration for Types**:
The `TipPersonal` enumeration provides a clear definition of the available medical staff types.

### 4. **Abstraction and Polymorphism**:
The base class `PersonalMedical` allows for polymorphic behavior, as demonstrated in the `main` method where different staff types are handled via a common reference.

## Usage:

Run the `main` method to observe the Factory Pattern in action. You will see instances of `Medic` and `Asistent` being created using the Factory and their details printed to the console.
