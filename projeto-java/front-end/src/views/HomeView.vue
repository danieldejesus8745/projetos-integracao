<script setup lang="ts">
import { ref } from 'vue';

let cep = ref('');
const address = ref([]);
const url = "http://localhost:8080/api/v1/addresses";

function addressSearch() {
  const options = {
    method: 'GET'
  }

  fetch(`${url}/${cep?.value}/address`, options)
  .then(response => response.json())
  .then(data => address.value = data)
  .catch(error => console.log(error))
  .finally(() => cep.value = '');
}
</script>

<template>
  <main class="w-full h-screen flex flex-col items-center font-sans">
    <p class="my-10 text-2xl">Busca de Endereço</p>
    <form ref="myform" @submit.prevent="addressSearch">
      <input
        type="text"
        placeholder="CEP"
        required
        autocomplete="off"
        class="p-3 border-solid border-2 border-gray-400 outline-none rounded-lg"
        maxlength="8"
        v-model="cep"
      />
      <input
        type="submit"
        class="bg-teal-600 p-3.5 text-white rounded-lg cursor-pointer ml-3 w-32"
      />
    </form>
    <div class="mt-10 py-6 text-left w-3/12">
      <p class="my-4">Endereço: <span class="text-teal-600">{{ address?.address?.logradouro }} {{ address?.address?.bairro }}</span></p>
      <p class="my-4">Cidade: <span class="text-teal-600">{{ address?.address?.localidade }}</span></p>
      <p class="my-4">Estado: <span class="text-teal-600">{{ address?.address?.uf }}</span></p>
      <p class="my-4">CEP: <span class="text-teal-600">{{ address?.address?.cep }}</span></p>
      <p class="my-4">DDD da região: <span class="text-teal-600">{{ address?.address?.ddd }}</span></p>
      <p class="my-4">Número IBGE: <span class="text-teal-600">{{ address?.address?.ibge }}</span></p>
    </div>
  </main>
</template>