# Library Book Management System

A simple Java application for managing library books.

## Features

- Add books
- List all books
- Lend books with validation

## Build and Run

### Local

```bash
mvn clean install
java -jar target/library-app-1.0.jar
```

### Docker

```bash
docker build -t library-app .
docker run library-app
```

### Kubernetes

```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```

Access via NodePort 30007.