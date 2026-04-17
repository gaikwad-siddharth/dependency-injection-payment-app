# 💳 Dependency Injection - Payment App

A Java application demonstrating **Dependency Injection (DI)** using multiple payment methods like Credit Card and Debit Card.

---

## 📌 Project Overview

This project showcases how to achieve **loose coupling** by injecting different payment implementations into the application.

Instead of tightly coupling the system with a specific payment method, we use an interface-based design.

---

## 🧠 Concepts Covered

- Dependency Injection (DI)
- Loose Coupling
- Interface-based Programming
- Polymorphism

---

## 🏗️ Project Structure
src/
├── App.java
├── IPayment.java
├── PaymentService.java
├── CreditCardPayment.java
└── DebitCardPayment.java

---

## ⚙️ How It Works

1. `IPayment` is an interface.
2. `CreditCard` and `DebitCard` implement `IPayment`.
3. The main class injects the required payment method.
4. The system processes payment without depending on concrete classes.

---

## ▶️ Example Usage

### Constructor Injection

```java
IPayment payment = new CreditCardPayment();
PaymentService service = new PaymentService(payment);
service.Service(500.00);

