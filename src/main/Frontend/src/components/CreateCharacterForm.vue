<script setup>
</script>

<template>
    
<div class="form-background ">
  <v-form class="form " @submit.prevent="submit">

    <v-label class="label">Name</v-label>
    <v-text-field
      v-model="name"
      :error-messages="name"
    ></v-text-field>

    <v-label class="label">Affilliation</v-label>
    <v-text-field
      v-model="afilliation"
      :error-messages="phone"
    ></v-text-field>

    <v-label class="label">Race</v-label>
    <v-text-field
      v-model="race"
      :error-messages="email"
    ></v-text-field>

    <v-label class="label">Role</v-label>
    <v-text-field
      v-model="role"
      :error-messages="email"
    ></v-text-field>

    <v-label class="label">Class</v-label>
    <v-select
      v-model="select"
      :items="items"
      :error-messages="select"
    ></v-select>

    <v-btn
      class="me-4 buttons"
      type="submit"
      variant="text"
    >
      Send
    </v-btn>
    
    <v-btn @click="handleReset" class="buttons" variant="text">
      Cancel
    </v-btn>

    
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
                color: $Golden;
                text-transform: uppercase;
                margin-left: 0.5%;
            }
            .buttons {
    color: $Golden;
    text-transform: uppercase;
    font-size: 1.1rem;
}
        }
    }
</style>