
### Smart Library Management System (CLI)
Developer: Vedant Sunil Patil
Registration Number: 24BAI10122
Course: Programming in Java Evaluated Course Project

### 📌 About the Project
Being a student at VIT, I realized that managing our Library book collection manually was very difficult. Sometimes we forget which books are available or which ones we have already borrowed.
To solve this, I built a Smart Library Management System using Java. It is a command-line based application that allows users to manage a digital inventory of books. The goal was to apply Object-Oriented Programming (OOP) to create a functional tool that is easy to navigate directly from the terminal.

### ✨ Key Features
Interactive Menu: The program uses a continuous loop so users can perform multiple actions in one session.
Real-time Inventory: View all books with their current status (Available or Borrowed).
Borrow/Return Logic: Users can check out books by ID and return them to update the system.
Data Validation: The system handles case-sensitivity (e.g., 'b001' works as 'B001') and invalid IDs.
Encapsulated Design: Uses a dedicated 'Book' class to handle data securely.

### 💻 Concepts Used
While building this project, I applied several core Java concepts:
Classes & Objects: Created a Book class to represent real-world entities.
Encapsulation: Used private fields with public getters/setters for data security.
Collections (ArrayList): Used java.util.ArrayList to manage the book list dynamically.
Control Flow: Used while loops and switch-case statements for the menu.
Methods: Modularized the code into displayBooks() and processTransaction() for better readability.

### ⚙️ How to Run
To run this project, you need the Java Development Kit (JDK) installed.
Download or copy the LibrarySystem.java file.
Open your terminal or Command Prompt (or IntelliJ/VS Code).
Navigate to the file location.
Compile the code: javac LibrarySystem.java
Run the application: java LibrarySystem

### 📌 Conclusion
This project helped me understand how Java's Object-Oriented nature makes it easy to model real-world systems. It is a practical application of the concepts learned in class and can be expanded further by adding file handling or a database.

### Output 
=== Welcome to VIT Library Management (BYOP) ===
Developer: Vedant Sunil Patil (24BAI10122)

Main Menu:
1. View Books
2. Borrow Book
3. Return Book
4. Exit
Select Option: 1

--- Current Inventory ---
B001 - Java Programming Essentials [Available]
B004 - Harry potter [Available]
B005 - Rich Dad Poor Dad [Available]

Select Option: 2
Enter Book ID: B004
Success: You have borrowed Harry potter

### Output Images
<img width="1701" height="585" alt="image" src="https://github.com/user-attachments/assets/4d58849c-61ac-4a38-a233-fe019cce07f1" />
<img width="1701" height="585" alt="Screenshot 2026-03-29 122256" src="https://github.com/user-attachments/assets/b7176448-cea5-468d-bbbd-7e2c24c2991c" />

