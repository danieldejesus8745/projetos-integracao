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

É possível subir o back-end do projeto Java usando Docker seguindo os seguintes passos:

1. Abrir a pasta `projeto-java` e dentro dela acessar a pasta `back-end`
3. Executar o comando:
> `docker compose up -d`

#### front-end
O front-end que consome a aplicação Java foi desenvolvido em VueJs e para abrí-lo basta seguir os seguintes passos:

1. Ter o NodeJs instalado
2. Abrir a pasta `front-end` em um terminal
3. Executar o comando `npm install`
4. E executar o comando `npm run dev` para subir o app
5. Acessar a URL [http://localhost:5173](http://localhost:5173)

