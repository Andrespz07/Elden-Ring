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

    <v-list class="list">
      <v-card-title class="vTitle">
        Ancient Dragon Lansseax
    </v-card-title>
        <v-list-item class="vItem">
        <v-list-item-content>
          <v-list-item-title>Affiliation: Dragons</v-list-item-title>
        </v-list-item-content>
      </v-list-item>
      <v-list-item class="vItem">
        <v-list-item-content>
          <v-list-item-title>Race: Dragon</v-list-item-title>
        </v-list-item-content>
      </v-list-item>
      <v-list-item class="vItem">
        <v-list-item-content>
          <v-list-item-title>Role: Boss</v-list-item-title>
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
  .list{
    background-color: transparent;
    color: $Golden;
    .vTitle{
      font-size: xx-large;
      display: flex;
      
    }
    
  }
}
.v-card-title{
      white-space: normal;
    }}
</style>
