# ATM-Simulation-Using-OOPs-Java
Console-based ATM Simulation project in Java using OOP concepts such as classes, objects, encapsulation, constructors, methods, and custom exception handling.

# ATM Simulation Using OOPs With Java
# Project Description
ATM Simulation Using OOPs With Java is a console-based Java project that simulates basic ATM operations. The project uses object-oriented programming concepts such as classes, objects, encapsulation, methods, constructors, and custom exception handling.

The application allows a user to enter a PIN, access the ATM menu, withdraw money, check account balance, and exit the system. It also validates incorrect PINs, invalid amounts, and insufficient balance cases.

# GitHub Repository Description
Console-based ATM Simulation project in Java using OOP concepts such as classes, objects, encapsulation, constructors, methods, and custom exception handling.

# Features
- PIN-based user authentication
- Menu-driven ATM operations
- Withdraw money
- Check account balance
- Exit option
- Invalid choice handling
- Invalid amount validation
-Insufficient balance validation
- Input mismatch handling for non-numeric values
# OOP Concepts Used
- Class and Object
- Encapsulation
- Constructor
- Method
- Access Modifier
- Exception Handling
- Custom Exceptions
## Project Structure

```text
ATM-Simulation-Using-OOPs-Java/
│
├── ATMApplication.java
├── README.md
├── .gitignore
└── ATM_Simulation_Using_OOPs_With_Java.pptx
```
# Classes Used
# ATMSimulation
This is the main class of the project. It creates the Scanner, Account, and ATM objects and starts the ATM application.

# ATM
This class handles ATM-related operations such as:

- PIN authentication
- Displaying the menu
- Reading user choice
- Processing withdrawal
- Checking account balance
# Account
This class stores and manages the account balance. The balance is private, so it can only be accessed or updated using class methods.

# InvalidAmountException
This custom exception is used when the withdrawal amount is less than or equal to zero.

# InsufficientBalanceException
This custom exception is used when the withdrawal amount is greater than the available balance.

# How to Run the Project
**Step 1.: Install Java JDK**
Make sure Java JDK is installed on your system.

Check Java version:

```bash
java -version
```
Check Java compiler:

```bash
javac -version
```
**Step 2.: Compile the Java File**
Open terminal in the project folder and run:

```bash
javac ATMSimulation.java
```
**Step 3.: Run the Project**
```bash
java ATMSimulation
```
## Sample Output

```text
Enter PIN: 1234

1. Withdraw Money
2. Check Balance
3. Exit
Enter choice: 1
Enter amount: 500
Transaction successful.

1. Withdraw Money
2. Check Balance
3. Exit
Enter choice: 2
Balance: 1500.00

1. Withdraw Money
2. Check Balance
3. Exit
Enter choice: 3
Thank you for using ATM.
```
# Incorrect PIN Output
```text
Enter PIN: 2222
Access denied. Incorrect PIN.
```
# Future Scope
- Add deposit money feature
- Add PIN change feature
- Add transaction history
- Add multiple user accounts
- Store account details in a database
- Create GUI using Java Swing or JavaFX
- Add file handling for permanent data storage
# Conclusion
This project demonstrates how a real-world ATM system can be represented using object-oriented programming in Java. It provides a simple and clear implementation of authentication, transaction processing, balance management, and exception handling.

# Author
Luxmi Gupta
