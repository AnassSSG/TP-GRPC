# Activité Pratique GRPC et Micro -service Multi Connecteurs - GRPC SOAP GraphQL REST
## Introduction
Ce rapport présente la création et l'utilisation d'un service Web gRPC en Java. Il explore les quatre modèles de communication GRPC : Unary, Server Streaming, Client Streaming et BiDirectional Streaming.

## Architecture du service GRPC
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/fd583e1c-2409-451b-9675-29b58ab2ade3)
## Implémentation du Service GRPC
Le service GRPC est implémenté en utilisant les classes générées à partir du fichier `.proto` qui définit quatre méthodes correspondant aux modèles de communication:
- `convert` : Modèle Unary (une requête, une réponse)
- `performStream` : Modèle Server Streaming (une requête, plusieurs réponses)
- `getStream` : Modèle Client Streaming (plusieurs requêtes, une réponse)
- `fullStream`: Modèle BiDirectional Streaming (plusieurs requêtes, plusieurs réponses)
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/bfbf419e-4006-4871-877a-b1bc5a94c94a) <br>
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/cbb50a87-0686-4689-8576-e0caa791f188)
## Démarrage du serveur GRPC
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/e3f7b821-96ca-46b7-86cd-b5122faaab51)
## Création des clients GRPC 
### 1-Client GRPC (Modèle Unary)
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/91fcda12-0151-4ab4-9c79-d90024fd6e95)
### 2-Client GRPC (Server Streaming Modèle)
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/d7dc9f6b-4e86-4c01-ab15-324d7d4e97c3)
### 3-Client GRPC (Client Streaming Modèle)
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/187e80ef-5a97-467f-8221-2a037f9b1e5d)
### 4-Client GRPC (BiDirectional Streaming Modèle)
![image](https://github.com/AnassSSG/TP-GRPC/assets/133109998/fe8d9887-29dd-46fb-b283-d09b5fb5621c)
## Conclusion
Ce projet démontre la mise en œuvre et l'utilisation d'un service GRPC en Java, couvrant les quatre modèles de communication. GRPC offre une communication performante pour les systèmes distribués modernes.
