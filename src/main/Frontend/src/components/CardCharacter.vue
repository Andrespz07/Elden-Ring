<script setup>

</script>

<template>
<v-card
width="20%"
height="60vh"
class="card">
      <v-img
      src="https://cdn.vuetifyjs.com/images/cards/sunshine.jpg"
      height="200px"
      width="200px"
    ></v-img>
    <v-card-title>
        Ancient Dragon Lansseax
    </v-card-title>
    <v-list>
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
    </v-list>
</v-card>
        
    
</template>

<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

.card{
    background-image: url(../assets/img/card.png);
    background-size: cover;
}
    
</style>