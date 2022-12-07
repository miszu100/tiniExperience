<template>
  <web-header-vue></web-header-vue>
</template>

<script>

import WebHeaderVue from './components/WebHeader.vue';
export default {
  name: 'App',
  components: {
    WebHeaderVue
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 10px;
}
</style>
