## Objective
The goal of this project is to develop a web-based Task Management System that allows users to create, update, and manage tasks.

## Note
for accessing any Api, Please use the following userName and Password

UserName - user

Password - password

## Requirements
For building and running the application you need:

- Java 17


## Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `TaskManagement.example.TaskManagementApplication` class from your IDE.

**------ CREATE TASK -------**

Using the below Api a task with the following fields will be stored in database. The id of the task will be auto generated inside the code only which can be further used for accessing the data.
- title (mandatory) (String)
- description (String)
- startDate (Formated date String)
- completionDate (Formated date String)

I have implemented a POST Api Request for the same. Sample curl for the same is defined below-
```shell
curl --location 'http://localhost:8080/task' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=4C50D37C1CFE7523A34B7C676783FF56' \
--data '{
    "title":"travel",
    "description":"The places that I have to travel in near future",
    "startDate":"2022-04-28T14:45:15",
    "completionDate":"2023-04-28T14:45:15"
}'
```

**------ UPDATE TASK -------**

Using the below Api a task with the following fields will be updated in database. The id of the task should be provided in the url itself which can be further used for updating the data.
- title (mandatory) (String)
- description (String)
- startDate (Formated date String)
- completionDate (Formated date String)

I have implemented a PUT Api Request for the same. Sample curl for the same is defined below-
```shell
curl --location --request PUT 'http://localhost:8080/task/2' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=8397FA4EEB1879C10A711BDA301774B9' \
--data '{
    "title":"purchase",
    "description":"The things that I have to purchase in near future",
    "startDate":"2022-04-28T14:45:15",
    "completionDate":"2023-04-28T14:45:15"
}'
```

**------ DELETE TASK -------**

Using the below Api a task with the following id will be deleted from database. The id of the task should be provided in the url itself which can be further used for deleting the data.

I have implemented a DELETE Api Request for the same. Sample curl for the same is defined below-
```shell
curl --location --request DELETE 'http://localhost:8080/task/52' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=4C50D37C1CFE7523A34B7C676783FF56'
```

**------ LIST TASK -------**

Using the below Api all tasks will be returned from the database.

I have implemented a GET Api Request for the same. Sample curl for the same is defined below-
```shell
curl --location 'http://localhost:8080/task' \
--header 'Authorization: Basic dXNlcjpjMWU3OTQ4Zi0yZDA3LTRkMmQtYjI2MC1lYTdjZWExZDBjNTE=' \
--header 'Cookie: JSESSIONID=4C50D37C1CFE7523A34B7C676783FF56'
```

**------ GET SINGLE TASK -------**

Using the below Api a task will be returned from the database. The id of the task should be provided in the url itself which can be further used for accessing the data.

I have implemented a GET Api Request in  the application. Sample curl for the same is defined below-
```shell
curl --location 'http://localhost:8080/task/52' \
--header 'Authorization: Basic dXNlcjowMmE1MWE2ZS1kMjFhLTRiOTAtOGI5Ni1kZDIwODg5MjlkOTY=' \
--header 'Cookie: JSESSIONID=4C50D37C1CFE7523A34B7C676783FF56'
```
