# Singleton Pattern Demonstration

This repository provides an example of how to implement the Singleton Design Pattern in Java using both eager and lazy initialization techniques.

## Key Concepts Covered:

### 1. **Eager Initialization**:

- Demonstrated by the `Parlament` class.
- The Singleton instance is created during class loading.
- **Advantage**: No need for synchronization during access.
- **Disadvantage**: The instance might be created even if it isn't accessed.

### 2. **Lazy Initialization with Synchronization**:

- Demonstrated by the `ParlamentLazy` and `Star` classes.
- The Singleton instance is created only when `getInstance()` is called for the first time.
- Thread safety is ensured using a synchronized block.
- **Advantage**: Instance is created only when required.
- **Disadvantage**: Synchronization might introduce some overhead, especially in multi-threaded scenarios.

### 3. **Test Demonstrations**:

- Singleton property is showcased in the main function.
- Even with multiple initializations, all references point to a single instance of the Singleton class.

## Usage:

Run the main function to observe the Singleton behavior. Multiple initializations of the Singleton classes will still result in references to a single instance.
