<script setup>

</script>

<template>
<v-card
class="card">
 
      <figure class="imageContainer">
    <img src="../assets/img/personajes/ancientDragonLansseax.jpg" alt="Ancient Dragon Lansseax" class="imageCharacter">
      </figure>
    
    <!-- <v-list class="list">
      <v-card-title>
        Ancient Dragon Lansseax
    </v-card-title>
        <v-list-item>
        <v-list-item-content>
          <v-list-item-title>Affiliation:</v-list-item-title>
        </v-list-item-content>
      </v-list-item>
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title>Race:</v-list-item-title>
        </v-list-item-content>
      </v-list-item>
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title>Role:</v-list-item-title>
        </v-list-item-content>
      </v-list-item>
    </v-list> -->
</v-card>
        
    
</template>

<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

.card{
  width:18vw;
  height:65vh;
  background-image: url(../assets/img/cardR.png);
  background-size: cover;
  background-position: center;
  .imageContainer{
    width: 75%;
    height: 40vh;
    display: flex;
    justify-content: center;
    align-items: center;
  }
  .imageCharacter{
    display: block;
    width: 100%;
    height: 100%;
    object-fit: contain;
  }
}

    
</style>