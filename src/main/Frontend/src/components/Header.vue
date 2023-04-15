<script setup>
import { RouterLink } from 'vue-router';
import CreateCharacterButton from '../components/CreateCharacterButton.vue';
import YourCharactersButton from '../components/YourCharactersButton.vue';
</script>

<template>
    <header>
      <div id="logo">
        <router-link to="/">
        <img src="../components/icons/isotype.png" alt="Logo Elden Ring">
      </router-link>
      </div>
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

header{
  display: flex;
  width: 100vw;
  height: 30vh;
  justify-content: space-between;
#logo{
  display: flex;
  justify-content: flex-start;
  margin-top: 4vh;
  margin-left: 3vw;
  img{
    width: auto;
    height: 15vh;
  }
}

#components{
    display: flex;
    justify-content: flex-end;
    margin: -4% 3% 0 0;
}
}
</style>