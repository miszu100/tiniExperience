<template>
    <div class="container">
        <router-link :to="('/' + checkIfHome(title).toLowerCase())">
            <button>{{ title }}</button>
        </router-link>
    </div>
</template>

<script>
export default {
    name: 'Nav-Button',
    props: {
        title: String
    },
    methods: {
        checkIfHome: function (title) {
            if (title === "Home") {
                return '';
            }
            return title;
        }
    }
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
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }
    }
</style>