<script setup>
</script>

<template>
    
<div class="form-background d-flex justify-center">
  <v-form class="form " @submit.prevent="submit">

    <v-label class="label">Name</v-label>
    <v-text-field
      v-model="name"
      :counter="10"
      :error-messages="name"
    ></v-text-field>

    <v-label class="label">Affilliation</v-label>
    <v-text-field
      v-model="afilliation"
      :counter="7"
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

    
    <v-btn @click="handleReset">
      Cancel
    </v-btn>

    <v-btn
      class="me-4"
      type="submit"
    >
      Send
    </v-btn>

    
  </v-form>
</div>
</template>
<style lang="scss" scoped>
@import '../assets/scss/variables.scss';
    
    .form-background{
        
        // background-image: url(../assets/img/formBackgroundR.png);
        // background-size: cover;
        // width: 100%;
        .form{
            width: 60%;

            .label{
                color: $Golden;
                text-transform: uppercase;
                margin-left: 0.5%;
            }
        }
    }
</style>