<script setup>
import { ref } from 'vue';

</script>

<template>
  <v-card class="card" >
    <figure class="imageContainer">
      <img
        src="../assets/img/personajes/ancientDragonLansseax.jpg"
        alt="Ancient Dragon Lansseax"
        class="imageCharacter"
      />
    </figure>

    <v-card-title class="vTitle">
        Ancient Dragon Lansseax
    </v-card-title>
    <v-list class="list">
      
        <v-list-item class="vItemContainer">
        <v-list-item-content>
          <v-list-item-title class="vItem">Affiliation: Dragons</v-list-item-title>
          <v-list-item-title class="vItem">Race: Dragon</v-list-item-title>
          <v-list-item-title class="vItem">Role: Boss</v-list-item-title>
        </v-list-item-content>
      </v-list-item>

    </v-list>
  </v-card>
</template>

<style lang="scss" scoped>
@import "../assets/scss/variables.scss";

*{
  font-family: Mantinia-Regular;

.card {
  width: 22vw;
  height: 70vh;
  background-image: url(../assets/img/cardR.png);
  background-size: cover;
  background-position: center;
  background-color: transparent;
  border: none;
  border-radius: 0;
  
  .imageContainer {
    margin-top: 7%;
    height: 40vh;
    display: flex;
    justify-content: center;
    align-items: center;
  
  .imageCharacter {
    display: block;
    width: 100%;
    height: 100%;
    object-fit: contain;
  }}
  .vTitle {
      font-size: xx-large;
      display: flex;
      white-space: normal;
      color: $Golden;
      text-align: center;
      text-transform: uppercase;
      margin-top: 1vh;
      margin-bottom: -0.5vh;
    }
  .list{
    background-color: transparent;
    color: $White;
    .vItemContainer{
      margin-top: 1vh;
      .vItem{
        text-transform: uppercase;
        margin-left: 1vw;
      }
    }
  }
}
}
</style>
