<script setup>
import { onBeforeMount } from 'vue';
import Header from'../components/Header.vue';
import CardCharacter from '../components/CardCharacter.vue';
import { useCharacterStore } from '../stores/charactersStore';

const charactersStore = useCharacterStore()

onBeforeMount(() => {
    charactersStore.getAllCharacters()
})

</script>

<template>
<section id="background">
<Header></Header>
<h1>Characters</h1>
 <main id="cardsContainer">
<CardCharacter v-for="character of charactersStore.allCharacters" :character="character"></CardCharacter>
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
        width: auto;
        h1{
            color: $Golden;
            text-align: center;
            font-size: 3.5rem;
            font-weight: 100;
            text-transform: uppercase;
            display: flex;
            justify-content: center;
            margin-top: 6vh;
            margin-bottom: 10vh;
        }
        #cardsContainer{
            display: flex;
            flex-direction: row;
            flex-wrap: wrap;
            justify-content: space-between;
            width: 93%;
            margin: auto;
        }
    }
}
</style>