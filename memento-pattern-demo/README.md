# Memento Design Pattern Implementation and Miscellaneous Code Snippets

This repository showcases the Memento Design Pattern, useful for capturing and restoring an object's internal state. Additionally, it contains a method for ticket pricing and some mathematical calculations.

## Core Concepts:

### 1. **Memento Pattern**:
Memento is a behavioral design pattern that allows making snapshots of an object's state, as well as restoring its previous state.

**`Memento`**:
- Represents a snapshot of the `Meci`'s state.

**`Meci`**:
- Represents a football match. Can save its state as a memento and can revert its state using a memento.

**`ManagerMemento`**:
- Acts as a caretaker that can store and retrieve mementos.

### 2. **Ticket Pricing (`getTicket` method)**:
Calculates the price of a ticket based on the seating area, base price, and whether there's a group reduction. Note: there are potential issues with the current calculation logic.

### 3. **Mathematical Calculations**:
Performs calculations involving the golden ratio and prints the result.

## Usage:

Run the `main` method. It will demonstrate:
- The usage of the Memento pattern by creating mementos of a `Meci` object, altering the `Meci` object's state, and restoring it.
- The ticket pricing logic.
- The mathematical calculations.
