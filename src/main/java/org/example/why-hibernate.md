What is Hibernate?
Hibernate is a powerful, open-source ORM framework that provides a way to map Java objects to database tables and vice versa.
It abstracts the complexities of JDBC while giving developers fine-grained control over database interactions.

Core Concepts :

1. Session:
   The Hibernate equivalent of a JDBC Connection.
   Used to interact with the database (e.g., save, update, delete, fetch objects).
   Managed by the SessionFactory.
2. SessionFactory:
   A heavyweight object that creates and manages Session instances.
   Typically initialized once per application lifecycle.
3. Configuration:
   Defines how Hibernate connects to the database.
   Includes database URL, username, password, and entity mappings.
4. Transaction:
   Hibernate abstracts database transactions, ensuring consistency and atomicity.
5. HQL (Hibernate Query Language):
   An object-oriented query language similar to SQL but operates on entity objects instead of tables.
6. Entity:
   A Java class mapped to a database table using annotations like @Entity and @Table.