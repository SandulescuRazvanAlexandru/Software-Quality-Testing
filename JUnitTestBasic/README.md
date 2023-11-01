# Student Class and Unit Tests

This repository contains the `Student` class which represents a student's details and its respective unit tests in the `StudentTest` class.

## Core Concepts:

### 1. **`Student` Class**:

A representation of a student with attributes like name (`nume`) and a list of grades (`note`). It provides various methods like adding grades, checking if a student has failed subjects, and calculating the average grade.

### 2. **`StudentTest` Class**:

Contains JUnit tests for the `Student` class ensuring the correct functionality of its methods.

## Usage:

1. **Creating a Student**: Create an instance of the Student class using either the default constructor or by providing a name.
2. **Adding Grades**: Use the `adaugaNota` method to add grades between 1 and 10.
3. **Checking Failures**: Use the `areRestante` method to check if a student has failed subjects.
4. **Calculating Average**: Use the `calculeazaMedie` method to get the average grade.

Run the `StudentTest` class to execute all the unit tests and verify the correctness of the `Student` class.
