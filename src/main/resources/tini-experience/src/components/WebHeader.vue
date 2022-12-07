<template>
    <div class="flexbox-container">
        <div class="flexbox-item flexbox-item-1">
            <img src="../assets/logo.png" alt="logo">
        </div>
        <div class="flexbox-item flexbox-item-button">
            <nav-button-vue></nav-button-vue>
        </div>
        <div class="flexbox-item flexbox-item-last">
            <h1>Tini Experience</h1>
        </div>
    </div>
</template>


<script>
import NavButtonVue from './NavButton.vue';
export default {
    name: 'Web-Header',
    components: {
        NavButtonVue
    }
}
</script>

<style lang="scss">

    @font-face {
        font-family: laBelleAurore;
        src: url("../assets/fonts/LaBelleAurore.eot");
        src: url("../assets/fonts/LaBelleAurore.woff") format('woff'),
             url("../assets/fonts/LaBelleAurore-Regular.ttf") format('truetype'),
             url("../assets/fonts/LaBelleAurore.svg") format('svg');  
    }

    .flexbox-container {
        display: flex;
        border-bottom-style: solid;
        border-color: rgba(0, 0, 0, 0.2);
        border-width: 1px;
    }

    .flexbox-item {
        margin: 10px;
        height: 90px;

        img {
            width: 80px;
            height: 80px;
        }
    }

    .flexbox-item-1 {
        
    }

    .flexbox-item-last {
        font-family: laBelleAurore;
        font-size: 32px;
        
        h1 {
            margin: 0;
        }
    }

    .flexbox-item-button {
        
    }
</style>