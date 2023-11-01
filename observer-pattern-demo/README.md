# Observer Design Pattern Implementation

This repository illustrates the Observer Design Pattern, where a subject notifies its observers about changes in its state.

## Core Concepts:

### 1. **Observer Design Pattern**:
The Observer pattern is a behavioral design pattern that allows objects to notify other objects about changes without needing to know who or what those objects are.

**`Observer`**:
- An interface defining the method observers need to implement to receive updates.

**`ClientAbonat`**:
- A concrete observer that gets updates about sports matches and prints a reception message.

**`Subiect`**:
- A generic subject class that manages and notifies its observers.

**`ManagerSala`**:
- A concrete subject that notifies its observers about specific sports matches being held in an arena.

## Usage:

Run the `main` method. It demonstrates:
- Creation of a subject (`ManagerSala`) and observers (`ClientAbonat`).
- Registering observers to the subject.
- Notifying observers about an event (football match).
- Deregistering one observer.
- Notifying remaining observers about another event (volleyball match).
