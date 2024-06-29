# Projeto de API REST com Spring Boot

Este projeto é uma API RESTful desenvolvida com Spring Boot que fornece endpoints para gerenciar usuários, pedidos e categorias.

## Endpoints

### Usuários

#### Obter todos os usuários

**GET** `/users`

Retorna uma lista de todos os usuários.

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Array de objetos `User`

#### Obter um usuário por ID

**GET** `/users/{id}`

Retorna um usuário específico com base no ID fornecido.

**Parâmetros**:
- **id**: ID do usuário (Long)

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Objeto `User`

#### Criar um novo usuário

**POST** `/users`

Cria um novo usuário.

**Corpo da Requisição**:
- Objeto `User`

**Resposta de Sucesso**:
- **Código**: 201 Created
- **Corpo**: Objeto `User` criado

#### Atualizar um usuário

**PUT** `/users/{id}`

Atualiza um usuário existente com base no ID fornecido.

**Parâmetros**:
- **id**: ID do usuário (Long)

**Corpo da Requisição**:
- Objeto `User`

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Objeto `User` atualizado

#### Deletar um usuário

**DELETE** `/users/{id}`

Deleta um usuário específico com base no ID fornecido.

**Parâmetros**:
- **id**: ID do usuário (Long)

**Resposta de Sucesso**:
- **Código**: 204 No Content

### Pedidos

#### Obter todos os pedidos

**GET** `/orders`

Retorna uma lista de todos os pedidos.

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Array de objetos `Order`

#### Obter um pedido por ID

**GET** `/orders/{id}`

Retorna um pedido específico com base no ID fornecido.

**Parâmetros**:
- **id**: ID do pedido (Long)

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Objeto `Order`

### Categorias

#### Obter todas as categorias

**GET** `/categories`

Retorna uma lista de todas as categorias.

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Array de objetos `Category`

#### Obter uma categoria por ID

**GET** `/categories/{id}`

Retorna uma categoria específica com base no ID fornecido.

**Parâmetros**:
- **id**: ID da categoria (Long)

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Objeto `Category`

#### Criar uma nova categoria

**POST** `/categories`

Cria uma nova categoria.

**Corpo da Requisição**:
- Objeto `Category`

**Resposta de Sucesso**:
- **Código**: 200 OK
- **Corpo**: Objeto `Category` criado

## Tecnologias Utilizadas

- **Java 11**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (para testes)
- **Maven**


