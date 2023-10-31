# Aplicant Tracking System (ATS)

## Introduction
The Aplicant Tracking System (ATS) is a technical showcase of various object-oriented programming principles and Java-specific features. This system is designed around managing applicants within an educational institution, but its primary purpose is to demonstrate coding and design patterns.

## Technical Concepts Demonstrated

### Inheritance
- Base class: `Aplicant`
- Subclasses: `Angajat`, `Elev`, `Student`
- Demonstrates inheriting properties and methods from a parent class.

### Abstraction
- Abstract class: `Readable`
- Provides a blueprint for child classes (`AngajatiReader`, `EleviReader`, `StudentiReader`) to define specific implementations of the `readAplicanti` method.

### Polymorphism
- Method overriding showcased with `readAplicanti` in `Readable` and its child classes.
- The abstract method `getFinantare` in `Aplicant` gets concrete implementations in its subclasses.

### Encapsulation
- Class properties (e.g., `nume`, `varsta`) are kept protected/private, ensuring data integrity.
- Use of accessors (getters) and mutators (setters) for controlled data access and modification.

### Composition
- The `Program` class composes a `Readable` object (like `EleviReader`) to read a list of applicants, adhering to the "composition over inheritance" principle.

### File Handling
- Classes extending `Readable` utilize Java's file handling capabilities (via `Scanner` and `File`) for data input.

### Collections
- Implements Java Collections Framework, particularly the `List` interface and its `ArrayList` implementation for managing `Aplicant` objects.

### Good Practices
- Clear, descriptive variable naming.
- Separation of concerns with distinct classes for different functionalities.

### Error Handling
- Basic error handling using the `try-catch` block in the `Program` class to manage potential `FileNotFoundException`.

### Interfaces and Implementation
- Design hints at using interfaces for refining structure, e.g., interfaces for all "readable" sources like files, databases, etc.

## Conclusion
The ATS codebase serves as an exemplary demonstration of intermediate-level Java coding, putting into practice several core Object-Oriented Programming (OOP) concepts and Java-specific implementations.
