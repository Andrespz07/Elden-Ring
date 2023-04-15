<script setup>
import { RouterLink } from 'vue-router';
</script>

<template>
    <RouterLink to="/CreateCharacter">
    <v-btn :class="{'sizeLanding': $route.path === '/'}" variant="text" class=buttons>
        Create your character
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
}
}
.sizeLanding{
    font-size: 1.4rem;
}

</style>
