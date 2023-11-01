# Composite Design Pattern Demonstration

This repository demonstrates the use of the Composite Design Pattern to model hierarchical structures. The pattern enables you to build structures of objects in the form of trees to represent part-whole hierarchies, ensuring that individual objects and composite objects can be treated uniformly.

## Core Concepts:

### 1. **Composite Pattern**:
The Composite Pattern helps in modeling tree-like structures where both the composites and the individual objects need to be treated uniformly. In this demonstration, we have a menu comprising sections, and these sections can have sub-sections or products.

### 2. **`ComponentaAbstracta` Interface**:
The primary interface that both composite (`Sectiune`) and leaf (`Produs`) components implement. It defines the operations that are applicable to both composites and leaf nodes.

### 3. **`Produs` Class**:
Represents a leaf node in the composite pattern. It implements `ComponentaAbstracta` but throws an exception for operations that don't apply to leaf nodes.

### 4. **`Sectiune` Class**:
Represents a composite node in the pattern. A `Sectiune` can have other sections or products. It maintains a list of child nodes and implements methods to manage them.

### 5. **Client (`main` Method)**:
The client demonstrates the creation of a menu structure using the composite pattern. The client can add products to sections, sections to the main menu, and print the entire menu structure. The ability to treat both `Sectiune` and `Produs` uniformly is a significant advantage showcased in the client.

## Usage:

Run the `main` method. The client code creates a menu structure with sections and products. Initially, the complete menu is printed, followed by a modification in the structure and reprinting the updated menu.

This demonstration illustrates the power of the Composite Design Pattern in modeling and working with tree-like structures in a consistent and uniform way.
