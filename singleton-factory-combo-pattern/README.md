# Singleton and Factory Pattern Demonstration: Medical Staff

This repository demonstrates the combination of the Singleton and Factory Design Patterns. It shows how to ensure that there's only one instance of a factory used throughout the application, and that factory is used to create instances of different types of medical staff.

## Core Concepts:

### 1. **Singleton Pattern**:
The `SingleFact` class ensures that only one instance of the factory is created and used throughout the application.

### 2. **Factory Pattern**:
The `SingleFact` class (being a Singleton) encapsulates the instantiation logic for different types of medical staff, abstracting away the details from the client code.

### 3. **Types of Medical Staff**:
- **Medic (Doctor)**: Represents a doctor.
- **Asistent (Assistant)**: Represents a medical assistant.
- **Brancardier (Stretcher Bearer)**: Represents a stretcher bearer.

### 4. **Enumeration for Types**:
The `TipPersonal` enumeration provides a clear definition of the available medical staff types.

### 5. **Abstraction and Polymorphism**:
The base class `PersonalMedical` allows for polymorphic behavior, as demonstrated in the `main` method where different staff types are handled via a common reference.

## Usage:

Run the `main` method to observe the Singleton and Factory Patterns in action. You will see instances of `Medic` being created using the Singleton Factory (`SingleFact`) and their details printed to the console.
