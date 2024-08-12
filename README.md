# TaskManager Application

## Project Overview

**TaskManager** is a project developed without Spring Boot to help teams manage their tasks. One of the core features of this app is the ability for users to leave comments on tasks. When a comment is published, the application stores it in a database and sends an email notification to a configured email address.

## Project Requirements

The application is required to:

1. Allow users to leave comments on tasks.
2. Store comments in a database.
3. Send an email notification whenever a comment is published.

## Implementation Steps

### Step 1: Identify the Objects (Responsibilities)

The project is broken down into distinct responsibilities, each handled by specific objects.

#### Step 1.1: Identify the Use-Cases

1. **Publish Comment** - This use-case will be handled by an object named `CommentService`.

##### Step 1.1.1: Identify the Actions for Each Use-Case

The `Publish Comment` use-case involves two distinct actions, which will be treated as separate responsibilities:

1. **Storing the Comment in the Database**:
    - This is the first responsibility.
    - Handled by the `CommentRepository` object.

2. **Sending the Comment via Email**:
    - This is the second responsibility.
    - Handled by the `CommentNotificationProxy` object.

### Step 2: Decouple the Responsibilities

To ensure that `CommentService` is not tightly coupled to the specific implementations of its dependencies (`CommentRepository` and `CommentNotificationProxy`), we design these dependencies as interfaces. This allows for flexibility, so when the implementations need to be changed, `CommentService` itself does not need to be altered.

The interfaces define only what `CommentService` needs to implement the use case of storing a comment.

### Explanation of Key Concepts

- **services**: Objects that implement use-cases are represented as services. For example, `CommentService` is a service responsible for handling comments.

- **repositories**: Objects that interact directly with a database are referred to as repositories. `CommentRepository` manages the storage of comments in the database.

- **dao (Data Access Object)**: This is another term sometimes used to describe objects that work directly with a database, similar to a repository.

- **proxies**: Objects responsible for communication with external systems (like sending emails) are known as proxies. `CommentNotificationProxy` handles email notifications.

- **model**: A POJO (Plain Old Java Object) class that represents the data used by the application. Models are simple objects described by their attributes and methods without any dependencies.

## Summary

In this project, we focus on implementing a task management application where comments can be published, stored, and notifications sent. By decoupling the responsibilities through the use of interfaces, we ensure that our application remains flexible and easy to maintain as requirements evolve.

