# State Design Pattern Implementation

In this repository, we are showcasing an alternative demonstration of the State Design Pattern, a behavioral pattern that allows an object (in this case, a dining table or 'Masa') to change its behavior when its internal state changes. This design pattern encapsulates state into separate classes and delegates the object representing the current state.

## Core Concepts:

### 1. **State Pattern**:
The State Pattern is about allowing an object to change its behavior when its internal state changes, thus ensuring that behavior changes along with the state.

### 2. **`Stare` Interface**:
This interface, which means "State" in English, is a representation of the different states an object (like a dining table) can possess. This interface mandates the implementation of the `modificaStare` method which is responsible for changing the state of the `Masa` object.

### 3. **State Classes**:
There are three classes `StareLibera`, `StareRezervata`, and `StareOcupata` that implement the `Stare` interface:

- `StareLibera`: Indicates the table is free.
- `StareRezervata`: Indicates the table has been reserved.
- `StareOcupata`: Indicates the table is occupied.

Each of these classes has a method `modificaStare` that tries to change the state of the given `Masa` object based on the current state it's in.

### 4. **`Masa` Class**:
The `Masa` class represents a dining table and maintains its current `Stare`. The class provides methods to reserve, occupy, or liberate the table. Depending on the current state of the table, these methods try to change its state or output a message indicating that the operation is not possible.

### 5. **Client (`main` Method)**:
The client code in the `main` method showcases the state transitions for a table. This includes a sequence of operations on a table and shows the respective output based on the current state of the table.

## Usage:

Run the `main` method to observe the sequence of state transitions for the dining table. This will showcase how the table reacts to different operations based on its current state.
