<script setup>
import { RouterLink } from 'vue-router';
import CreateCharacterForm from '../components/CreateCharacterForm.vue';

</script>

<template>
    <div id="background">
<CreateCharacterForm></CreateCharacterForm>
</div>
</template>
<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

#background{
        background-image: url(../assets/img/secBackground.png);
        background-size: cover;
        // background-position: center; al quitar esto, la imagen se adapta mejor pero solo se ve la parte superior, quizá con más contenido se arregle
        height: 100vh;
        width: auto;
    }
    
</style>