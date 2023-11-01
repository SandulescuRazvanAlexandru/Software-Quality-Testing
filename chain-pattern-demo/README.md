# Chain of Responsibility Design Pattern Implementation

In this repository, we are showcasing the Chain of Responsibility Design Pattern, a behavioral pattern that decouples the sender from the receiver by allowing more than one object to handle a request.

## Core Concepts:

### 1. **Chain of Responsibility Pattern**:
The pattern lets multiple objects handle a request. The request is sent from one object to another along the chain until one of them will process it.

### 2. **`Cont` (Abstract Handler)**:
The `Cont` is an abstract class representing a bank account with a balance (`sold`). Each account has a successor (`succesorCont`), the next account in the chain. If an account cannot handle a payment (`realizeazaPlata`), it delegates the request to its successor.

### 3. **Concrete Handlers**:
There are three concrete classes, `ContCurent`, `ContCredit`, and `ContEconomii`. Each of these classes represents a specific type of bank account. They define how to process the payment depending on the balance.

### 4. **Client (`main` Method)**:
The client sets up the chain of accounts and initiates payments. If one account can't fulfill the payment, it gets delegated to the next account in the chain. If no account can fulfill the payment, a message is displayed.

## Usage:

Run the `main` method. It sets up a chain with a Current account (`ContCurent`), a Credit account (`ContCredit`), and a Savings account (`ContEconomii`). Payments are then made, and depending on the account balances, they are either processed by the current account or delegated to the next account in the chain.
