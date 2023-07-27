# Projetos Integracao
Projetos de integração com APIs externas

### Projeto Node
Essa é uma integração com uma api que disponibiliza informações de Pessoas Jurídicas. Obtemos dados das empresas passando o CNPJ como parâmetro da requisição

O projeto Node pode ser executado via Docker seguindo os seguintes passos:

1. Clonar este repositório
2. Acessar a pasta "projeto-node"
3. Abrir o terminal dentro dessa pasta
4. Executar o seguinte comando:
> `docker compose up -d`
5. Abrir a URL [http://localhost:4000/api-docs](http://localhost:4000/api-docs) do Swagger

### Projeto Java
Essa é uma integração com a API da Viacep para obter endereços através do CEP

É possível subir o projeto Java usando Docker, seguindo os seguintes passos:

1. Abrir a pasta `projeto-java`
2. Executar o comando:
> `docker compose up -d`
3. Abrir o navegador no endereço [http://localhost:8081](http://localhost:8081)