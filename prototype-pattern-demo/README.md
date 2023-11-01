# Prototype Pattern Demonstration

This repository provides an example of how to implement the Prototype Design Pattern in Java.

## Key Concepts Covered:

### 1. **Prototype Interface**:

- `AbstractPrototype` interface acts as the prototype which declares the `copiaza()` method to clone itself.

### 2. **Concrete Prototype**:

- The `Reteta` class represents a concrete prototype, implementing the `copiaza()` method to return a cloned object.

### 3. **Deep Copy**:

- The `copiaza()` method in `Reteta` ensures a deep copy of the lists, `solutii` and `cantitati`, thereby ensuring the clone is a completely separate instance from the original.

### 4. **Test Demonstrations**:

- The `Main` class demonstrates the prototype pattern by creating an initial `Reteta` object and then two clones from it. The demonstration confirms that the clones and the original have different memory references but share the same values.

## Usage:

Run the `Main` class to observe the Prototype behavior. The cloned instances will have the same values as the original but different memory references.
