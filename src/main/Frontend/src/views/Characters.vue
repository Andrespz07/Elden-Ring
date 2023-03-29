<script setup>
import Header from'../components/Header.vue';
import CardCharacter from '../components/CardCharacter.vue';
</script>

<template>
<section id="background">
<Header></Header>
 <main id="cardsContainer">
<CardCharacter></CardCharacter>
 </main>
 </section>
</template>

<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

*{
    font-family: Mantinia-Regular;
    #background{
        background-image: url(../assets/img/secBackground.png);
        background-size: cover;
        // background-position: center; al quitar esto, la imagen se adapta mejor pero solo se ve la parte superior, quizá con más contenido se arregle
        height: 100vh;
        width: auto;
    }
}
</style>