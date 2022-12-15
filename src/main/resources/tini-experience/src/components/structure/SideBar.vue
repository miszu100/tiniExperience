<template>
    <div class="flex-container">
        <div class="flex-item">

        </div>
        <div class="flex-item">
            
        </div>
        <div class="flex-item">
            
        </div>
        <div class="flex-item">
            
        </div>
        <div class="flex-item">
            
        </div>
        <div class="flex-item">
            
        </div>
    </div>
</template>

<script>
export default {
  name: 'Side-Bar'
}
</script>

<style lang="scss">
    .flex-container {
        display: flex;
        border-bottom-style: solid;
        border-color: rgba(0, 0, 0, 0.2);
        border-width: 1px;
        justify-content: space-evenly;
        background-color: lightblue;
        height: 100%;
        flex-flow: column wrap;
        align-content: center;
    }

    .flex-item {
        background-color: black;
        width: 90%;
        height: 10vh;
        margin-top: 25px;
    }
</style>