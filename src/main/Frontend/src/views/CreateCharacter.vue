<script setup>
import CreateCharacterForm from '../components/CreateCharacterForm.vue';
import Header from '../components/Header.vue';

</script>

<template>
    <div id="background">
        <Header></Header>
    <h1>Create your character</h1>
    <p>Complete this form to create your character</p>
<CreateCharacterForm></CreateCharacterForm>
</div>
</template>
<style lang="scss" scoped>
@import '../assets/scss/variables.scss';

#background{
        background-image: url(../assets/img/secBackground.png);
        background-size: cover;
        // background-position: center; al quitar esto, la imagen se adapta mejor pero solo se ve la parte superior, quizá con más contenido se arregle
        padding-bottom: 1%;
        width: auto;
    
    h1{
        color: $Golden;
            text-align: center;
            font-size: 3.5rem;
            font-weight: 100;
            text-transform: uppercase;
            display: flex;
            justify-content: center;
            margin-top: 5vh;
            margin-bottom: 10vh;
    }
    p{
        color: $White;
        text-align: center;
        text-transform: uppercase;
        font-size: 1.3em;
        margin-top: -3%;
        margin-bottom: -4%;
    }
}
    
</style>