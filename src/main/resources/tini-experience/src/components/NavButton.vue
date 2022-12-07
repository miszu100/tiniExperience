<template>
    <div class="container">
        <button>Text</button>
    </div>
</template>

<script>
export default {
    name: 'Nav-Button'
}
</script>

<style lang="scss">
    .container {
        height: 90px;

        button {
            width: 130px;
            height: 35px;
            margin-top: 40px;
            font-size: 18px;
            color: aliceblue;
            background-color: rgba(0, 0, 0, 0.8);
            border: 2px solid;
            border-color: rgba(0, 0, 0, 0.8);
            border-radius: 5px;
            transition-duration: 0.4s;
            cursor: pointer;
        }

        button:hover {
            background-color: white;
            color: rgba(0, 0, 0, 0.8);
        }
    }
</style>