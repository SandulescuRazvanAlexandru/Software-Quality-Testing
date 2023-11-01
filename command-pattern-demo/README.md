# Command Design Pattern Implementation

In this repository, we are showcasing the Command Design Pattern, a behavioral pattern that turns a request into a stand-alone object that contains information about the request. This decoupling allows the sender and the receiver to operate independently.

## Core Concepts:

### 1. **Command Pattern**:
The Command Pattern is about encapsulating a command request as an object, thereby allowing users to parameterize other objects with different requests.

### 2. **`ComandaAbstracta` (Abstract Command)**:
This is the abstract base class for all concrete commands. It defines an abstract `executa()` method which every concrete command has to implement. Each command knows about the receiver (`Executant`) and invokes a method of the receiver.

### 3. **Concrete Command Classes**:
There are three concrete command classes `ComandaCreare`, `ComandaDepunere`, and `ComandaRetragere`. Each of these commands has its own specific logic and interacts with the `Executant` (receiver) differently.

### 4. **Receiver (`Executant` Class)**:
The `Executant` class represents the receiver that performs the actual action associated with the command. It has methods `creeazaCont`, `retragere`, and `depunere` to create an account, withdraw money, and deposit money respectively.

### 5. **Invoker (`ManagerComenzi` Class)**:
The `ManagerComenzi` class is the invoker. It keeps a list (queue) of commands and executes them. When the `executaComanda` method is called, it picks the first command from the list, executes it, and then removes it from the list.

### 6. **Client (`main` Method)**:
The client decides which commands to execute at which points. To do this, it passes a command object to the invoker object.

## Usage:

Run the `main` method to observe how different commands interact with the `Executant` object. This will showcase the decoupling of command issuing and command execution.
