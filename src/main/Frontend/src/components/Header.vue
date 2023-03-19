<script setup>
import { RouterLink } from 'vue-router';
import CreateCharacterButton from '../components/CreateCharacterButton.vue';
import YourCharactersButton from '../components/YourCharactersButton.vue'
</script>

<template>
    <header>
        <v-breadcrumbs id="components">
    <v-breadcrumbs-item class="buttons">
      <YourCharactersButton  />
    </v-breadcrumbs-item>
    <v-breadcrumbs-item class="buttons">
      <CreateCharacterButton />
    </v-breadcrumbs-item>
  </v-breadcrumbs>
   </header>
</template>

<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

#components{
    display: flex;
    justify-content: flex-end;
}

</style>