📄 Description - Exercise Statement
This project involves creating a class named "Product" with the attributes name and price, and another class named "Venda". The "Venda" class contains:

A collection of Product objects.
A totalPrice attribute for the sale.
The Cart class includes a method named calculateTotalPrice(), which throws a custom exception "VendaBuidaException" if the product collection is empty. The exception should display the message: "To make sale you must first add products" ("To make a sale, you must first add products"). If the collection contains products, the method should iterate through them, summing their prices into the totalPrice attribute.

The custom exception "EmptyCartException" should extend Exception. Its constructor should receive the message "To make sale you must first add products" and, when the exception is caught, it should be displayed using the getMessage() method.

Additionally, the project must include code to generate and catch an IndexOutOfBoundsException. In order to work with these exceptions I made a Exception teaser Class.

💻 Technologies Used
Java
Java Standard Library
Exception Handling
Collections Framework
📋 Requirements
To run this project, you need:

Java Development Kit (JDK) 8 or higher
An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or VS Code with Java support
🛠️ Installation
Ensure you have JDK 8 or higher installed.
Clone this repository:
git clone <https://github.com/IgnaSubirachs/S1.02_Exceptions_Level1_Ex1.git>
Open the project in your preferred IDE.
Compile the Java files.
▶️ Execution
Navigate to the folder containing the compiled files.
Run the application using:
java Main
The output should display:
The correct total price if products were added.
The exception message if no products were added.
An example of IndexOutOfBoundsException handling.
