# Decorator Design Pattern Demonstration

This repository showcases the use of the Decorator Design Pattern to enhance the functionalities of an object (`Card`) dynamically. In this case, basic card payment functionalities are extended to include contactless payment methods through card and phone.

## Core Concepts:

### 1. **Decorator Pattern**:
The Decorator Pattern allows new functionalities to be added to objects without altering their structure. This pattern involves a set of decorator classes that are used to wrap concrete components.

### 2. **`CardBancar` Interface**:
This interface defines a contract that ensures any class implementing it provides functionalities for POS and online payments.

### 3. **`Card` Class**:
A concrete implementation of the `CardBancar` interface representing a bank card with a titular. It provides basic functionalities for POS and online payments.

### 4. **Decorator Classes (`DecoratorContactlessCard` and `DecoratorContactlessTelefon`)**:
These classes extend the base functionality of the `Card` class. 
- `DecoratorContactlessCard`: Enhances the card to allow contactless payment via card.
- `DecoratorContactlessTelefon`: Enhances the card to allow contactless payment via phone.

### 5. **`DecoratorAbstract` Class**:
An abstract class implementing the `CardBancar` interface and containing an abstract method `platesteContactless()`. This acts as a base for the actual decorators to extend the functionalities of the `Card` class.

### 6. **Client (`main` Method)**:
Demonstrates the dynamic addition of the new functionalities to the `Card` object using the decorator classes. The client code is able to apply multiple decorators to enhance the functionalities of the card object.

## Usage:

Run the `main` method. You'll observe:
1. Basic functionalities of the `Card` object being executed.
2. The card object's functionality being extended using the `DecoratorContactlessCard` to include contactless payments via card.
3. Further extension of the card object's functionality using the `DecoratorContactlessTelefon` to demonstrate contactless payments via phone.

This demonstration provides a clear understanding of how the Decorator Design Pattern can be applied to enhance functionalities dynamically without altering the original class's code.
