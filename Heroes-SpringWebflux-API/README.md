
# Uma API REST para gerenciamento de super heróis da Marvel.

## Stack utilizada

  * Java8
  * Spring webflux
  * Spring data
  * Dynamodb
  * Junit
  * Sl4j
  * Reactor
  
## Executar Dynamo: 

Na pasta em que o jar está baixado: java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
 
Para listar as tabelas criadas:  aws dynamodb list-tables --endpoint-url http://localhost:8000



