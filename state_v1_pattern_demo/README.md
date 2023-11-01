# State Design Pattern Demonstration

This repository illustrates the State Design Pattern, a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The pattern ensures that behavior changes along with the state.

## Core Concepts:

### 1. **State Pattern**:
The State Pattern allows an object to change its behavior dynamically based on its state. It encapsulates states into separate classes and delegates the behavior to the object representing the current state.

### 2. **`State` Interface**:
This interface is a representation of different states an object can have. In this demo, different states of a dining table (Masa) are represented by classes that implement the `State` interface.

### 3. **State Classes**:
There are three classes `Libera`, `Rezervata`, and `Ocupata` that implement the `State` interface. Each of them represents a different state of the `Masa` (dining table):

- `Libera`: Represents the state when the table is free.
- `Rezervata`: Represents the state when the table is reserved.
- `Ocupata`: Represents the state when the table is occupied.

### 4. **`Masa` Class**:
The `Masa` class has a `State` attribute representing its current state. It provides methods to request table reservation, occupation, and liberation. Depending on the current state of the table, these methods will change the table's state or notify that the requested operation is not possible.

### 5. **Client (`main` Method)**:
The client code in the `main` method demonstrates the state transitions of a dining table. Initially, the table is in the "Libera" state. Several state transitions are demonstrated, such as liberation (which is redundant initially), reservation, occupation, and so on.

## Usage:

Run the `main` method. The client code will show the sequence of state transitions for a dining table and how it behaves in response to different requests based on its current state.

