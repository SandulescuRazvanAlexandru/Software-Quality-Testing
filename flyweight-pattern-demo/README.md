# Flyweight Design Pattern Demonstration

This repository demonstrates the Flyweight Design Pattern, which is a structural design pattern used for efficiently sharing a large number of fine-grained objects to save system resources.

## Core Concepts:

### 1. **Flyweight Pattern**:
The Flyweight Pattern reduces the load on memory by sharing objects. The intrinsic state remains the same, whereas the extrinsic state is passed as arguments to methods, thus differentiating between shared objects.

### 2. **`FlyWeightAbstract` Interface**:
The main interface for Flyweights. It declares a method `printeaza` which takes in an extrinsic state (`Rezervare` in this case).

### 3. **`Client` Class**:
The concrete class that implements the `FlyWeightAbstract` interface. It contains intrinsic state data (`numeClient`, `nrTelefon`, and `email`). The client's phone number is used as the key to check if an instance of the client already exists.

### 4. **`FlyWeightFactory` Class**:
This is the factory class responsible for creating and managing Flyweight objects. It ensures that objects are shared/reused appropriately, rather than creating unnecessary duplicates.

### 5. **`Rezervare` Class**:
This class represents the extrinsic state, which is independent of the Flyweight and can vary. It's passed as an argument to Flyweight objects.

### 6. **Client (`main` Method)**:
The client code demonstrates the creation and sharing of Flyweight objects. When a client with a specific phone number is requested, the factory checks if it already exists. If it does, the existing object is returned, otherwise, a new one is created.

## Usage:

Run the `main` method. The client code will create a few reservations and clients. The Flyweight Factory will either provide a new client instance or return an existing one based on the phone number. This demonstration illustrates the power of the Flyweight Design Pattern in managing resources efficiently by sharing objects.

