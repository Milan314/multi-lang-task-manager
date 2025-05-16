# multi-lang-task-manager

SQL Instructions
1. navigate to top folder `multi-lang-task-manager` (where `tasks.db` resides)
2. run `sqlite3 tasks.db` in terminal
3. then run e.g. `SELECT * FROM tasks;` (you should get table output)

Task API
1. navigato to folder `task-api``
2. run `mvn spring-boot:run` to start my application
3. In another terminal tab do a POST request to create a task: 
`curl -X POST http://localhost:8080/tasks -H "Content-Type: application/json" -d '{"title": "Learn Java"}'`
4. Do a GET request to fetch all tasks:
`curl http://localhost:8080/tasks`