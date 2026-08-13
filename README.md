<div align="center">

<h1>🏋️ Gym Management System</h1>

<h3>Java Desktop Application for Gym Member Management</h3>

<p>
<strong>
A desktop-based Gym Management System developed in Java to simplify
the management of gym members, trainers, and workout records.
</strong>
</p>

<p>
<img src="https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/Java%20Swing-GUI-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java Swing">
<img src="https://img.shields.io/badge/JDBC-Database%20Connectivity-007396?style=for-the-badge&logo=java&logoColor=white" alt="JDBC">
<img src="https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
<img src="https://img.shields.io/badge/OOP-Java-5382A1?style=for-the-badge&logo=java&logoColor=white" alt="OOP">
</p>

</div>

<hr>

<h2>📌 Overview</h2>

<p>
The <strong>Gym Management System</strong> is a desktop-based application
developed using Java to streamline common gym management operations.
It provides administrators with a user-friendly interface for managing
gym member information and maintaining records efficiently.
</p>

<p>
The application demonstrates practical implementation of
<strong>Object-Oriented Programming, database connectivity, Java Swing,
JDBC, and layered software architecture</strong>.
</p>

<p>
The project follows a modular structure using separate packages for
database operations, business logic, models, utilities, and the graphical
user interface.
</p>

<hr>

<h2>🎯 Objectives</h2>

<ul>
<li>Simplify the management of gym member records.</li>
<li>Provide an easy-to-use desktop interface.</li>
<li>Store member information securely in a MySQL database.</li>
<li>Implement CRUD operations for member management.</li>
<li>Demonstrate Object-Oriented Programming concepts.</li>
<li>Implement database connectivity using JDBC.</li>
<li>Follow a modular and maintainable software architecture.</li>
</ul>

<hr>

<h2>✨ Features</h2>

<ul>
<li>🔐 Role-based login interface</li>
<li>👤 Add new gym members</li>
<li>📋 View member records</li>
<li>✏️ Update member details</li>
<li>🗑️ Delete members</li>
<li>🔍 Search members by name</li>
<li>💾 MySQL database integration</li>
<li>🖥️ Java Swing graphical user interface</li>
<li>🔗 JDBC database connectivity</li>
<li>📂 DAO and Model-based architecture</li>
<li>🧩 Modular package structure</li>
</ul>

<hr>

<h2>🛠️ Technologies Used</h2>

<table>
<thead>
<tr>
<th>Technology</th>
<th>Purpose</th>
</tr>
</thead>

<tbody>

<tr>
<td>☕ Java</td>
<td>Core programming language</td>
</tr>

<tr>
<td>🖥️ Java Swing</td>
<td>Desktop graphical user interface</td>
</tr>

<tr>
<td>🔗 JDBC</td>
<td>Database connectivity</td>
</tr>

<tr>
<td>🐬 MySQL</td>
<td>Database management</td>
</tr>

<tr>
<td>📦 MySQL Connector/J</td>
<td>Java-to-MySQL connectivity</td>
</tr>

<tr>
<td>🧱 Object-Oriented Programming</td>
<td>Application design and implementation</td>
</tr>

</tbody>
</table>

<hr>

<h2>📂 Project Structure</h2>

<pre>
gym-management-system/
│
├── src/
│   └── com/
│       └── gym/
│           ├── dao/
│           ├── model/
│           ├── service/
│           ├── ui/
│           └── util/
│
├── lib/
│   └── MySQL Connector/J
│
├── .vscode/
│
└── README.md
</pre>

<hr>

<h2>🧩 Source Code Structure</h2>

<pre>
src/
└── com/
    └── gym/
        │
        ├── dao/
        │   └── Database Access Objects
        │
        ├── model/
        │   └── Entity / Data Classes
        │
        ├── service/
        │   └── Business Logic
        │
        ├── ui/
        │   └── Java Swing Interface
        │
        └── util/
            └── Database Utilities
</pre>

<hr>

<h2>🏗️ Architecture</h2>

<p>
The application follows a layered architecture to separate different
responsibilities within the system. This improves maintainability,
readability, and scalability.
</p>

<pre>
                ┌──────────────────────┐
                │     User / Admin     │
                └──────────┬───────────┘
                           ↓
                ┌──────────────────────┐
                │      UI Layer        │
                │     Java Swing       │
                └──────────┬───────────┘
                           ↓
                ┌──────────────────────┐
                │   Service Layer      │
                │   Business Logic     │
                └──────────┬───────────┘
                           ↓
                ┌──────────────────────┐
                │      DAO Layer       │
                │ Database Operations  │
                └──────────┬───────────┘
                           ↓
                ┌──────────────────────┐
                │    MySQL Database    │
                └──────────────────────┘
</pre>

<h3>UI Layer</h3>

<p>
The UI layer provides the graphical interface using Java Swing.
Users can interact with the application through forms, buttons,
tables, search functionality, and other interface components.
</p>

<h3>Service Layer</h3>

<p>
The Service layer contains the application's business logic and
coordinates operations between the user interface and database layer.
</p>

<h3>DAO Layer</h3>

<p>
The Data Access Object (DAO) layer handles database operations such as
inserting, retrieving, updating, deleting, and searching member records.
</p>

<h3>Model Layer</h3>

<p>
The Model layer contains the entity classes used to represent application
data such as gym members and other records.
</p>

<h3>Utility Layer</h3>

<p>
The Utility layer contains reusable components such as database
connection and configuration utilities.
</p>

<hr>

<h2>🔄 Application Workflow</h2>

<pre>
User Login
    ↓
Authentication
    ↓
Main Dashboard
    ↓
Member Management
    ↓
┌───────────┬───────────┬───────────┬───────────┐
↓           ↓           ↓           ↓
Add       View        Update      Delete
Member    Members     Member      Member
    \         |          |          /
     \        |          |         /
      └───────┴──────────┴────────┘
                    ↓
              MySQL Database
</pre>

<hr>

<h2>💾 Database Operations</h2>

<p>
The system uses MySQL as the backend database and JDBC for communication
between the Java application and the database.
</p>

<p>
The application supports standard CRUD operations:
</p>

<table>
<thead>
<tr>
<th>Operation</th>
<th>Function</th>
</tr>
</thead>

<tbody>

<tr>
<td><strong>Create</strong></td>
<td>Add new gym member records.</td>
</tr>

<tr>
<td><strong>Read</strong></td>
<td>View and search existing member records.</td>
</tr>

<tr>
<td><strong>Update</strong></td>
<td>Modify existing member information.</td>
</tr>

<tr>
<td><strong>Delete</strong></td>
<td>Remove member records from the database.</td>
</tr>

</tbody>
</table>

<hr>

<h2>🚀 Getting Started</h2>

<h3>Prerequisites</h3>

<ul>
<li>Java JDK 17 or later</li>
<li>MySQL Server</li>
<li>MySQL Connector/J</li>
<li>VS Code or IntelliJ IDEA</li>
</ul>

<h3>1. Clone the Repository</h3>

<pre><code>git clone https://github.com/kuunalmistry/gym-management-system.git</code></pre>

<h3>2. Navigate to the Project</h3>

<pre><code>cd gym-management-system</code></pre>

<h3>3. Configure MySQL</h3>

<p>
Create the required MySQL database and configure the database
connection credentials in the application's database connection
utility.
</p>

<p>
Make sure the following information matches your local MySQL setup:
</p>

<ul>
<li>Database URL</li>
<li>Database name</li>
<li>MySQL username</li>
<li>MySQL password</li>
<li>MySQL port</li>
</ul>

<h3>4. Configure MySQL Connector/J</h3>

<p>
Make sure the MySQL Connector/J library is available in the project's
classpath or included inside the <code>lib/</code> directory.
</p>

<h3>5. Run the Application</h3>

<p>
Open the project in VS Code or IntelliJ IDEA, configure the Java
environment and database connection, and run the application's
main class.
</p>

<hr>

<h2>🖥️ User Interface</h2>

<p>
The application uses Java Swing to provide a desktop-based graphical
user interface.
</p>

<p>
The interface is designed to allow administrators to perform common
member management operations without directly interacting with the
database.
</p>

<ul>
<li>🔐 Login interface</li>
<li>👤 Member registration form</li>
<li>📋 Member records table</li>
<li>🔍 Member search functionality</li>
<li>✏️ Member update functionality</li>
<li>🗑️ Member deletion functionality</li>
</ul>

<hr>

<h2>🧱 Object-Oriented Programming</h2>

<p>
The project demonstrates several fundamental Object-Oriented Programming
concepts through its modular Java implementation.
</p>

<table>
<thead>
<tr>
<th>Concept</th>
<th>Application</th>
</tr>
</thead>

<tbody>

<tr>
<td><strong>Encapsulation</strong></td>
<td>Data and methods are organized within classes.</td>
</tr>

<tr>
<td><strong>Abstraction</strong></td>
<td>Database and business operations are separated from the UI.</td>
</tr>

<tr>
<td><strong>Inheritance</strong></td>
<td>Reusable class structures can be extended where appropriate.</td>
</tr>

<tr>
<td><strong>Polymorphism</strong></td>
<td>Methods and interfaces can support flexible implementations.</td>
</tr>

</tbody>
</table>

<hr>

<h2>🔍 Key Functionalities</h2>

<h3>👤 Member Management</h3>

<p>
Administrators can add, view, update, delete, and search gym member
records through the graphical interface.
</p>

<h3>🔐 Login System</h3>

<p>
The application provides a login interface to control access to
the management system.
</p>

<h3>🔎 Search</h3>

<p>
Members can be searched by name to quickly locate specific records.
</p>

<h3>💾 Persistent Storage</h3>

<p>
Member information is stored in a MySQL database, allowing records
to persist between application sessions.
</p>

<hr>

<h2>📌 Limitations</h2>

<ul>
<li>The current system primarily focuses on member management.</li>
<li>Advanced trainer and attendance modules are not included.</li>
<li>Payment and billing functionality is not currently implemented.</li>
<li>The application requires a local MySQL database connection.</li>
<li>Database credentials must be configured before running the application.</li>
</ul>

<hr>

<h2>👨‍💻 Author</h2>

<h3>Kuunal Mistry</h3>

<p>
<strong>B.Tech Student | Artificial Intelligence &amp; Machine Learning</strong>
</p>

<p>
Interested in developing software applications using Java,
Object-Oriented Programming, databases, and modern technology.
</p>

<hr>

<div align="center">

<h3>🏋️ Managing Gym Operations Through Java</h3>

<p>
<strong>Built with Java, Swing, JDBC &amp; MySQL</strong>
</p>

</div>
