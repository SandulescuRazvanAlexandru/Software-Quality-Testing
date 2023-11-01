# Student Group Management System

Manage and assess student groups within an academic institution, incorporating various testing paradigms.

## Table of Contents

- [Classes and Interfaces](#classes-and-interfaces)
- [Dependencies](#dependencies)
- [Compilation and Execution](#compilation-and-execution)
- [Testing](#testing)

## Classes and Interfaces

1. **Grupa (Group)**: 
    - Instantiate with a group number.
    - Supports student addition and fetch.
    - Calculates group promovability.

2. **Student**: 
    - Maintain a record of names and grades.
    - Assesses grade status (pass/fail).

3. **IStudent Interface**: 
    - Blueprint for Student-related functionalities.

4. **Test Doubles**: `StudentDummy`, `StudentFake`, `StudentStub`.
    - For testing various scenarios and behaviors.

## Dependencies

- Java SE (version X or above).
- JUnit 5 for testing.

## Compilation and Execution

Navigate to the project directory and execute:

\```bash
$ javac <source-files>.java
$ java <main-class-name>
\```

## Testing

To conduct the tests, ensure JUnit is set up and run:

\```bash
$ java org.junit.runner.JUnitCore <test-class-name>
\```

For categorized tests:

- **CompleteTestSuite**: Executes all tests.
- **CustomTestSuite**: Filters tests based on categories.
