<script setup>
import { RouterLink } from 'vue-router'
import Characters from '../views/Characters.vue';
</script>

<template>
    <RouterLink to="Characters"><v-btn :class="{'sizeLanding': $route.path === '/'}" variant="text" class=buttons>
        Characters
    </v-btn></RouterLink>
</template>

<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

.buttons {
    font-family: Mantinia-Regular;
    color: $Golden;
    text-transform: uppercase;
    
}
a{
    text-decoration: none;
}
.sizeLanding{
    font-size: 1.4rem;
}
</style>