# Design Patterns - Exercise 1 Solutions

This repository contains solutions for various *Behavioral, **Creational, and **Structural* design patterns using real-life examples. Each design pattern is demonstrated with multiple files to ensure modularity and clarity.

## Table of Contents

1. [Behavioral Design Patterns](#behavioral-design-patterns)
    - Observer Pattern (Notification System)
    - Chain of Responsibility Pattern (Order Processing System)
2. [Creational Design Patterns](#creational-design-patterns)
    - Prototype Pattern (Document Editor)
    - Factory Method Pattern (Vehicle Factory)
3. [Structural Design Patterns](#structural-design-patterns)
    - Composite Pattern (House Plan)
    - Decorator Pattern (File System)
4. [How to Run](#how-to-run)
5. [Project Structure](#project-structure)

## Behavioral Design Patterns

### 1.1 Notification System (Observer Pattern)
In this example, we simulate a notification system where users (observers) are notified when new content is published by a content publisher (subject).

### 1.2 Order Processing System (Chain of Responsibility Pattern)
In this example, an e-commerce order processing system passes requests through handlers like payment processing, inventory checking, and shipping.

## Creational Design Patterns

### 2.1 Document Editor (Prototype Pattern)
In this example, a document editor allows cloning of templates like letter or report templates to create new documents using the prototype pattern.

### 2.2 Vehicle Factory (Factory Method Pattern)
This example demonstrates a factory method pattern where different vehicle factories (car and bike) create corresponding vehicle objects.

## Structural Design Patterns

### 3.1 House Plan (Composite Pattern)
In this example, a house is composed of multiple rooms, following the composite pattern where a house contains different components (rooms).

### 3.2 File System (Decorator Pattern)
This example demonstrates how the decorator pattern is used to add additional functionality (encryption and compression) to basic files.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/design-patterns-exercise.git
2. Navigate to the directory of the pattern you want to run. For example:
   ```bash
    cd BehavioralDesignPatterns/NotificationSystem

3. Compile and run the Java files:
   ```bash
        javac *.java
        java Main

   Project Structure:

.
├── BehavioralDesignPatterns
│   ├── NotificationSystem
│   │   ├── Observer.java
│   │   ├── User.java
│   │   ├── Subject.java
│   │   ├── ContentPublisher.java
│   │   └── Main.java
│   └── OrderProcessingSystem
│       ├── Order.java
│       ├── OrderHandler.java
│       ├── PaymentHandler.java
│       ├── InventoryHandler.java
│       ├── ShippingHandler.java
│       └── Main.java
├── CreationalDesignPatterns
│   ├── DocumentEditor
│   │   ├── Document.java
│   │   ├── LetterTemplate.java
│   │   ├── ReportTemplate.java
│   │   └── Main.java
│   └── VehicleFactory
│       ├── Vehicle.java
│       ├── Car.java
│       ├── Bike.java
│       ├── CarFactory.java
│       ├── BikeFactory.java
│       └── Main.java
├── StructuralDesignPatterns
│   ├── HousePlan
│   │   ├── HouseComponent.java
│   │   ├── Room.java
│   │   ├── House.java
│   │   └── Main.java
│   └── FileSystem
│       ├── File.java
│       ├── BasicFile.java
│       ├── FileDecorator.java
│       ├── EncryptedFile.java
│       ├── CompressedFile.java
│       └── Main.java
└── README.md

### How to Use:

- Copy this content and save it as **README.md** in the root directory of your GitHub project.
- This README file provides an overview of the project, the design patterns, and instructions to run the code.

Let me know if you'd like to customize it further!

EXCERCISE-2

# Satellite Command System

This project simulates a command-based control system for a satellite. The user can send commands to rotate the satellite, activate or deactivate solar panels, and collect data. The system provides an interactive command-line interface (CLI) to perform these operations.

## Features

- **Rotate Satellite**: Rotate the satellite to one of four directions: North, South, East, or West.
- **Activate/Deactivate Solar Panels**: Activate or deactivate the satellite's solar panels.
- **Collect Data**: Collect data from the satellite if the solar panels are active.
- **Case Insensitive Commands**: Commands can be entered in both lowercase and uppercase.
- **Error Handling**: Handles invalid commands or missing parameters gracefully, with clear error messages.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- A code editor or IDE (such as [VS Code](https://code.visualstudio.com/) or [NetBeans](https://netbeans.apache.org/)).

## Project Structure

### Class Overview

1. **Satellite.java**: 
   - Manages the satellite's state (orientation, solar panels, and collected data).
   - Provides methods to rotate the satellite, activate/deactivate panels, and collect data.

2. **SatelliteCommandSystem.java**: 
   - Main entry point of the application. Handles user input and calls methods from the `Satellite` class directly.
   - Provides a command-line interface for controlling the satellite.

3. **Command.java** (optional): 
   - Interface for command execution.
   - If you extend the project to use more design patterns, you can reintroduce the Command pattern here.

4. **RotateCommand.java, ActivatePanelsCommand.java, CollectDataCommand.java** (optional):
   - These classes are command implementations and were originally used when the CommandInvoker was part of the system.
   - In the current simplified version, these are not necessary and can be removed.

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/satellite-command-system.git
2. Navigate to the project directory:
   ```bash
   cd satellite-command-system/src
3. Compile the Java files:
   ```bash
   javac *.java
4. Run the application:
   ```bash
   java SatelliteCommandSystem
5. Enter one of the following commands in the console:

    rotate <direction>: Rotates the satellite in the specified direction (North, South, East, or West).
    activatepanels: Activates the solar panels.
    deactivatepanels: Deactivates the solar panels.
    collectdata: Collects data from the satellite if the solar panels are active.
    exit: Exits the application.




