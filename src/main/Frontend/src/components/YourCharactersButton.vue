<script setup>
import { RouterLink } from 'vue-router'
import Characters from '../views/Characters.vue';
</script>

<template>
    <RouterLink to="Characters"><v-btn variant="text" class=buttons>
        All characters
    </v-btn></RouterLink>
</template>

<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

.buttons {
    font-family: Mantinia-Regular;
    color: $Golden;
    text-transform: uppercase;
    font-size: 1.1rem;

a{
    text-decoration: none;
}}
</style>