<script setup>
import { RouterLink } from 'vue-router';
import { reactive, ref } from 'vue';

const items = ['Astrologer', 'Bandit', 'Confessor', 'Hero', 'Prisoner', 'Prophet', 'Samurai', 'Vagabond', 'Warrior', 'Wretch'];

const form = reactive({
  name: '',
  affiliation: '',
  race: '',
  role: '',
  selectedClass: '',
  items,
  errors: {}
})

const select = ref('');

const requiredFields = {
  name: 'Name is required',
  affiliation: 'Affiliation is required',
  race: 'Race is required',
  role: 'Role is required',
  selectedClass: 'Class is required'
}

function validateForm() {
  form.errors = {};

  for (const field of Object.keys(requiredFields)) {
    if (!form[field]) {
      form.errors[field] = requiredFields[field];
    }
  }

  return Object.keys(form.errors).length === 0;
}

function submit() {
  if (validateForm()) {
    // submit form data here
  }
}

function handleReset() {
  Object.keys(form).forEach(key => {
    form[key] = '';
  });
  form.errors = {};
}

</script>
<template>
  <div class="form-background">
    <v-form class="form" @submit.prevent="submit">
      <v-label class="label">Name</v-label>
      <v-text-field
        v-model="form.name"
        :error-messages="form.errors.name"
        class="input"
        required
      ></v-text-field>
      <v-label class="label">Affiliation</v-label>
  <v-text-field
    v-model="form.affiliation"
    :error-messages="form.errors.affiliation"
    class="input"
    required
  ></v-text-field>

  <v-label class="label">Race</v-label>
  <v-text-field
    v-model="form.race"
    :error-messages="form.errors.race"
    class="input"
    required
  ></v-text-field>

  <v-label class="label">Role</v-label>
  <v-text-field
    v-model="form.role"
    :error-messages="form.errors.role"
    class="input"
    required
  ></v-text-field>

  <v-label class="label">Class</v-label>
  <v-select
    v-model="form.selectedClass"
    :items="form.items"
    :error-messages="form.errors.selectedClass"
    class="input"
    required
  ></v-select>

  <v-btn
    class="me-4 buttons"
    type="submit"
    variant="text"
  >
    Submit
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