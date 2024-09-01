#Spring Boot MongoDB API
Este projeto é uma API desenvolvida com Spring Boot que utiliza MongoDB como banco de dados. A API oferece operações CRUD (Create, Read, Update, Delete) para gerenciar dados de forma eficiente.

## Tecnologias Utilizadas
Spring Boot 3.3.2: Framework principal para a construção da aplicação.
Spring Data MongoDB: Para integração com o banco de dados MongoDB.
Spring Web: Para a criação de endpoints RESTful.
Java 17: Versão do Java utilizada no projeto.

## Configuração do Projeto
Pré-requisitos:
- Java 17 ou superior: Certifique-se de ter o Java 17 instalado.
- Maven: Ferramenta de build utilizada no projeto.
- MongoDB: Instância do MongoDB configurada e em execução.
### Configuração do Banco de Dados
- No arquivo application.properties (ou application.yml), configure as credenciais e a URL de conexão do MongoDB:

```properties
Copy code
spring.data.mongodb.uri=mongodb://localhost:27017/seu_banco_de_dados
Substitua localhost:27017 pelo host e porta onde seu MongoDB está rodando e seu_banco_de_dados pelo nome do banco de dados.
```
### Executando a Aplicação
Clone o repositório:

git clone https://github.com/seu-usuario/spring-mongodb-api.git
Navegue até o diretório do projeto:

cd spring-mongodb
Compile e rode a aplicação:

mvn clean install
mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.

### Documentação da API
Para documentação interativa dos endpoints, utilize o Swagger (se configurado):

Swagger UI: http://localhost:8080/swagger-ui.html

### Contribuição
Faça um fork do projeto.
Crie uma branch para sua feature (git checkout -b feature/nova-feature).
Commit suas mudanças (git commit -m 'Adiciona nova feature').
Faça o push para a branch (git push origin feature/nova-feature).
Abra um Pull Request.

### Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.
