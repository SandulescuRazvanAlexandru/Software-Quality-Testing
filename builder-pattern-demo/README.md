# Builder Design Pattern Demonstration: Reservation Configuration

This repository demonstrates the application of the Builder Design Pattern. It showcases two distinct approaches to create complex instances of a `Rezervare` (Reservation) with varying configurations.

## Core Concepts:

### 1. **Builder Pattern**:
The Builder Design Pattern is crucial for constructing objects that have multiple configurations or components. This pattern provides clear and readable object creation, preventing the need for a constructor with numerous parameters or the creation of an inconsistent object state.

### 2. **AbstractBuilder Interface**:
This interface lays down the foundation for builders, mandating the implementation of a `build` method that returns an instance of `Rezervare`.

### 3. **Rezervare Class**:
This class represents a reservation with optional components such as:

- **Food Inclusion**: Whether the reservation includes food.
- **Ergonomic Chair Availability**: Specifies if the reservation setting has ergonomic chairs.
- **Drink Options**: Indicates if the reservation includes a refreshing drink.
- **Ambient Music & Genre**: Specifies if there's ambient music and its genre.

### 4. **BuilderRezervare Class**:
This class is a concrete builder that adheres to the `AbstractBuilder` interface. It uses method chaining to set the fields of an internal `Rezervare` instance. This builder might have potential issues with shallow copying if the same builder instance creates multiple objects.

### 5. **BuilderRezervare_v2 Class**:
An alternate approach to the builder, this class, while still conforming to `AbstractBuilder`, maintains fields as attributes and constructs a new `Rezervare` object during its `build` method, eliminating the shallow copy issue.

## Usage:

To see the Builder Design Pattern in action:

1. Observe the `BuilderRezervare` class to create a `Rezervare` instance:
   ```java
   BuilderRezervare builderRezervare = new BuilderRezervare()
       .setCodRezervare(20)
       .setAreBauturaRacoritoare(true)
       .setGenMuzical("changed");
   Rezervare rezervare1 = builderRezervare.build();
   ```

2. Similarly, the `BuilderRezervare_v2` class constructs another `Rezervare` instance:
   ```java
   BuilderRezervare_v2 builderRezervare_v2 = new BuilderRezervare_v2()
       .setAreMancareInclusa(true)
       .setAreScaunErgonomic(true)
       .setAreBauturaRacoritoare(true);
   Rezervare rezervare4 = builderRezervare_v2.setCodRezervare(1200).build();
   ```

