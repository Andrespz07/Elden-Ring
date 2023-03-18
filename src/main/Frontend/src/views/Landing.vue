<script setup>

</script>

<template>
<section id="background">
 <header>
<v-img>
<img src="../components/icons/isotype.png" alt="Logo de Elden Ring" id="headerIcon">
</v-img>
 </header>
 <main id="title">
    <v-img>
    <figure>
<img src="../assets/img/logo.png" alt="Título Elden Ring" id="centerLogo">
<figcaption>Cross the fog, to the lands between, to stand before the Elden Ring.<br>
    And become the Elden Lord.
</figcaption>
    </figure>
</v-img>

 </main>
 </section>
</template>

<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

*{
    font-family: Mantinia-Regular;
    #background{
        background-image: url(../assets/img/primaryBackgroundIA.png);
        background-size: cover;
        width: 100vw;
        height: 100vh;
    header{
        display: flex;
        width: 100vw;
        height: 30vh;
        #headerIcon{
            width: auto;
            height: 15vh;
            margin-top: 1%;
            margin-left: 2%;
        }
    }
    #title{
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        margin-top: -10vh;
        #centerLogo{
            display: flex;
            width: 47vw;
            height: 30vh;
        }
        figcaption{
            display: flex;
            margin-top: -6vh;
            color: $White;
            text-align: center;
            text-transform: uppercase;
            font-size: 0.9em;
        }
    }
}}
</style>