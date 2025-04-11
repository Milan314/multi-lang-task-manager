# multi-lang-task-manager

SQL Instructions
1. navigate to top folder `multi-lang-task-manager` (where `tasks.db` resides)
2. run `sqlite3 tasks.db` in terminal
3. then run e.g. `SELECT * FROM tasks;` (you should get table output)

Task API
1. navigato to folder `task-api``
2. run `mvn spring-boot:run`
3. `curl -X POST http://localhost:8080/tasks -H "Content-Type: application/json" -d '{"title": "Learn Java"}'`
TODO: Debug the error curl: (7) Failed to connect to localhost port 8080 after 0 ms: Couldn't connect to server