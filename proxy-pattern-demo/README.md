# Proxy Design Pattern Demonstration

This repository demonstrates the Proxy Design Pattern, a structural design pattern that provides a substitute object (a "proxy") for another object to control the access to it. In this particular demonstration, the Proxy pattern is used to control access based on a specific criterion (number of persons for a reservation).

## Core Concepts:

### 1. **Proxy Pattern**:
The Proxy Pattern is a design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

### 2. **`Rezervabil` Interface**:
The main interface that defines a method for making a reservation (`rezerva`). Both the Real Object (`ManagerRezervari`) and the Proxy (`ProxyManager`) implement this interface.

### 3. **`ManagerRezervari` Class**:
This is the Real Object that performs the actual task (making a reservation). It has an attribute `numeLocal` which represents the name of the restaurant/local.

### 4. **`ProxyManager` Class**:
The proxy class controls access to `ManagerRezervari`. It checks if the number of people for the reservation meets a minimum threshold. If it does, the reservation request is forwarded to `ManagerRezervari`. If not, a message is printed informing the user about the unavailability of the reservation for smaller groups.

### 5. **Client (`main` Method)**:
The client code demonstrates the use of both the Real Object and the Proxy. Initially, a direct reservation is made using `ManagerRezervari`. After that, reservations are attempted through the `ProxyManager`.

## Usage:

Run the `main` method. The client code will attempt to make a reservation directly and via the proxy. When making a reservation through the proxy, if the number of people is less than the threshold, an informative message is displayed. Otherwise, the reservation is forwarded to the real object.

