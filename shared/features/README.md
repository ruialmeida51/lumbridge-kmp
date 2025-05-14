# shared:features

This module serves as the primary location for implementing new features that are intended to be shared across different platforms (e.g., Android, iOS, Desktop, Web) using Kotlin Multiplatform. The goal is to maximize code reuse and ensure a consistent feature set and behavior across all supported platforms.

## Purpose

The `shared:features` module is designed to contain the core business logic, data handling, and presentation logic that is platform-agnostic. This includes:

*   **Use Cases and Interactors:** The application's business rules and workflows.
*   **Repositories and Data Sources:** Interfaces and shared implementations for accessing data.
*   **View Models and Presenters:** Logic for preparing data for presentation and handling user interactions.
*   **Shared Domain Models:** Data structures and entities that represent the application's core concepts.
*   **Platform-Agnostic UI Logic:** While platform-specific UI is often handled in platform modules, any shared UI logic or state management that can be reused should reside here.

By implementing features here, we minimize the amount of platform-specific code needed and accelerate development for new platforms.
