<script setup>
import { RouterLink } from 'vue-router';
import { reactive, ref } from 'vue';

// const items = ['Astrologer', 'Bandit', 'Confessor', 'Hero', 'Prisoner', 'Prophet', 'Samurai', 'Vagabond', 'Warrior', 'Wretch'];

// const data = () => ({
//   select: null,
//   items
// })

const items = ['Astrologer', 'Bandit', 'Confessor', 'Hero', 'Prisoner', 'Prophet', 'Samurai', 'Vagabond', 'Warrior', 'Wretch'];
const data = () => ({
  name: '',
  affiliation: '',
  race: '',
  role: '',
  select: '',
  items
})

const select = ref('');
</script>

<template>
    
<div class="form-background ">
  <v-form class="form " @submit.prevent="submit">

    <v-label class="label">Name</v-label>
    <v-text-field
      v-model="name"
      :error-messages="name"
      class="input"
      required
    ></v-text-field>

    <v-label class="label">Affilliation</v-label>
    <v-text-field
      v-model="afilliation"
      :error-messages="phone"
      class="input"
    ></v-text-field>

    <v-label class="label">Race</v-label>
    <v-text-field
      v-model="race"
      :error-messages="email"
      class="input"
    ></v-text-field>

    <v-label class="label">Role</v-label>
    <v-text-field
      v-model="role"
      :error-messages="email"
      class="input"
    ></v-text-field>

    <v-label class="label">Class</v-label>
    <v-select
      v-model="select"
      :items="items"
      value="items"
      :error-messages="select"
      class="input"
    ></v-select>

    <v-btn
      class="me-4 buttons"
      type="submit"
      variant="text"
    >
      Send
    </v-btn>
    
    <router-link to="Characters">
    <v-btn @click="handleReset" class="buttons" variant="text">
      Cancel
    </v-btn>
    </router-link>
  
  </v-form>
</div>
</template>
<style lang="scss" scoped>
@import '../assets/scss/variables.scss';
    
    .form-background{
        display: flex;
        justify-content: center;
        margin: auto;
        background-image: url(../assets/img/formBackground.png);
        background-size: cover;
        width: 55%;
        margin-bottom: 10%;
        background-color: transparent;
        .form{
            width: 84%;
            margin-bottom: 16%;
            margin-top: 17%;
            .label{
                color: $White;
                text-transform: uppercase;
                margin-left: 0.5%;
            }
            .input{
              color: $White;
              background: linear-gradient(90deg, rgba(30, 30, 30, 0.5) 0%, rgba(49, 49, 49, 0.5) 53.74%,  100%);
            }
            
            .buttons {
    color: $Golden;
    text-transform: uppercase;
    font-size: 1.1rem;
}
        }
    }
</style>