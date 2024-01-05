
**------ CREATE TASK -------**

I have implemented a POST Api Request in  the application. Sample curl for the same is defined below-

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


**------ UPDATE TASK -------**

I have implemented a PUT Api Request in  the application. Sample curl for the same is defined below-

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

**------ DELETE TASK -------**

I have implemented a DELETE Api Request in  the application. Sample curl for the same is defined below-

curl --location --request DELETE 'http://localhost:8080/task/52' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=4C50D37C1CFE7523A34B7C676783FF56'

**------ LIST TASK -------**

I have implemented a GET Api Request in  the application. Sample curl for the same is defined below-

curl --location 'http://localhost:8080/task' \
--header 'Authorization: Basic dXNlcjpjMWU3OTQ4Zi0yZDA3LTRkMmQtYjI2MC1lYTdjZWExZDBjNTE=' \
--header 'Cookie: JSESSIONID=4C50D37C1CFE7523A34B7C676783FF56'

**------ GET SINGLE TASK -------**

I have implemented a GET Api Request in  the application. Sample curl for the same is defined below-

curl --location 'http://localhost:8080/task/52' \
--header 'Authorization: Basic dXNlcjowMmE1MWE2ZS1kMjFhLTRiOTAtOGI5Ni1kZDIwODg5MjlkOTY=' \
--header 'Cookie: JSESSIONID=4C50D37C1CFE7523A34B7C676783FF56'
