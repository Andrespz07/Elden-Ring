<script setup>

const props = defineProps({
  character: {
    type: Object,
    required: true,
  }
})

</script>

<template>
  <v-card class="card" >
    <figure class="imageContainer">
      <img
        :src="`http://localhost:8080/`+ character.url_image"
        alt="Ancient Dragon Lansseax"
        class="imageCharacter"
      />
    </figure>

    <v-card-title class="vTitle">
        {{ character.name }}
    </v-card-title>
    <v-list class="list">
      
        <v-list-item class="vItemContainer">
        <v-list-item-content>
          <v-list-item-title class="vItem">Affiliation: {{ character.affiliation }}</v-list-item-title>
          <v-list-item-title class="vItem">Race: {{ character.race }}</v-list-item-title>
          <v-list-item-title class="vItem">Role: {{ character.role }}</v-list-item-title>
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
  width: 20vw;
  height: 74vh;
  background-image: url(../assets/img/cardR.png);
  background-size: cover;
  background-position: center;
  background-color: transparent;
  border: none;
  border-radius: 0;
  margin: 2% 0 2% 0;
  
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
    display: flex;
    .vItemContainer{
      margin-top: 1vh;
      // display: flex;
      .vItem{
        text-transform: uppercase;
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
        justify-content: flex-start;
      }
    }
  }
}
}
</style>
