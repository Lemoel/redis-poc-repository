# redis-poc
Uma POC usando Redis

### Insert

`curl --location --request POST 'http://localhost:8080/v1/students' \
--header 'Content-Type: application/json' \
--data-raw '{
"name": "Nome Sobrenome ultimonome"
}'`

### FindById
`curl --location --request GET 'http://localhost:8080/v1/students/28c798f6-5c5d-4871-988f-75011bc57714'`

### FindAll
`curl --location --request GET 'http://localhost:8080/v1/students'`

### DeleteById
`curl --location --request DELETE 'http://localhost:8080/v1/students/28c798f6-5c5d-4871-988f-75011bc57714'`

### Cliente para acesso ao banco 
Ubuntu unando snap `redis-desktop-manager`
