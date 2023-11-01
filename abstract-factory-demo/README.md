# Abstract Factory Design Pattern: Football Team

This repository demonstrates the Abstract Factory Design Pattern to model the creation of football (soccer) players based on their roles: Forward, Goalkeeper, Midfielder, and Defender.

## Core Concepts:

### 1. **Abstract Factory Pattern**:
The `FabricaJucator` interface acts as the Abstract Factory, defining the creation method for player objects.

### 2. **Concrete Factories**:
- **FabricaAtacant (Forward Factory)**
- **FabricaPortar (Goalkeeper Factory)**
- **FabricaMijlocas (Midfielder Factory)**
- **FabricaFundas (Defender Factory)**

Each concrete factory provides a specific implementation for creating a player of a particular role.

### 3. **Abstraction and Polymorphism**:
The `afiseazaInfoJucator` method in the `Main` class demonstrates polymorphism by accepting any factory implementing the `FabricaJucator` interface.

## Usage:

Run the `Main` class to observe the Abstract Factory Pattern in action. You will see instances of different player roles being created using their respective factories and their details printed to the console.
