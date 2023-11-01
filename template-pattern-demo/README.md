# Template Method Design Pattern Implementation

This repository illustrates the Template Method Design Pattern, where an abstract class exposes a template method to execute an algorithm's steps in sequence, with the actual implementation of these steps deferred to concrete subclasses.

## Core Concepts:

### 1. **Template Method Design Pattern**:
The Template Method pattern involves an abstract class that provides a concrete template method outlining the steps of an algorithm, and abstract methods representing the steps themselves. Concrete subclasses provide implementations for these steps without changing the template method's structure.

**`Template`**:
- Abstract class with a template method (`intraPeStadion`) that executes a series of steps.
- Contains abstract methods for each step of the algorithm, requiring concrete implementations in subclasses.

**`SpectatorNormal` & `SpectatorVIP`**:
- Concrete classes that extend the `Template` class and provide specific implementations for each step of the algorithm based on the type of spectator.

## Usage:

Run the `main` method. It demonstrates:
- Creating a normal and a VIP spectator.
- Both spectators attempting to enter the stadium by following the steps defined in their respective implementations.
