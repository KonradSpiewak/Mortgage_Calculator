Markdown

# Java Mortgage Calculator

A Java application designed to calculate mortgage payment schedules and simulate overpayment scenarios.

> **Status:** Active Development (Work in Progress)

## Project Overview
This project aims to build a flexible mortgage calculator that models installment schedules, handles high-precision financial logic, and simulates overpayment scenarios (comparing loan term reduction vs. monthly payment reduction).

## Current Features & Progress

### Completed Modules
- [x] **Input Data Handling** – Encapsulation and validation of input parameters (Loan Amount, Interest Rate, Term, etc.).
- [x] **Input Data Printing** – Formatting and console output of provided mortgage input parameters.

### Planned / In Progress
- [ ] **Mortgage Calculation Service** – Core domain engine for generating complete amortization schedules.
- [ ] **Rate Calculation Service** – Dedicated business logic for computing fixed and decreasing installment components (`BigDecimal`).
- [ ] **Overpayment Simulation** – Logic to calculate financial savings from one-time or recurring extra payments.
- [ ] **JavaFX Desktop GUI** – Interactive visual UI built with FXML, Controllers, and Scene Builder.

## Tech Stack & Standards
- **Language:** Java 17+
- **Precision Handling:** `BigDecimal` for currency and interest rate precision
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub Workflow
