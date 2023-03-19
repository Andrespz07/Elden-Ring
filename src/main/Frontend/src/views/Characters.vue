<script setup>
import Header from'../components/Header.vue'
</script>

<template>
<section id="background">
<Header></Header>
 <main id="cardsContainer">

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
        background-position: center;
        height: 100vh;
        width: auto;
    }
}
</style>