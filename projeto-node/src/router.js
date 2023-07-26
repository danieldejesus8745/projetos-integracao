const express = require("express");

const router = express.Router();

const url = 'https://api-publica.speedio.com.br/buscarcnpj?cnpj=';

router.get('/api/v1/:cnpj/cnpj', (request, response) => {
  const { cnpj } = request.params;
  
  const options = {
    headers: {
      'Accept': 'application/json'
    },
    method: 'GET'
  }

  fetch(`${url}${cnpj}`, options)
  .then(response => response.json())
  .then(data => handleResponse(data, response));
});

function handleResponse(data, response) {
  return response.status(200).send(data);
}

module.exports = router;