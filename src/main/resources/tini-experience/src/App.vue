<template>
  <div id="webHeader">
    <web-header-vue></web-header-vue>
  </div>
  <div id="routerView">
    <router-view/>
  </div>
  <div id="sidebar">
    <side-bar></side-bar>
  </div>
  <div id="footer">
    <web-footer></web-footer>
  </div>
</template>

<script>
import SideBar from './components/structure/SideBar.vue';
import WebFooter from './components/structure/WebFooter.vue';

import WebHeaderVue from './components/WebHeader.vue';
//import WebRoutingVue from './components/WebRouting.vue'
export default {
  name: 'App',
  components: {
    WebHeaderVue,
    SideBar,
    WebFooter,
    //WebRoutingVue
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
  display: grid;
  height: 98vh;
  grid-template-columns: 85% 15%;
  grid-template-rows: 9% 80% 11%;
}

#webHeader {
  grid-column-start: 1;
  grid-column-end: 3;
  grid-row-start: 1;
  grid-row-end: 2;
}

#sidebar {
  background-color: brown;
  grid-column-start: 2;
  grid-column-end: 3;
  grid-row-start: 2;
  grid-row-end: 3;
  margin-bottom: 1px;
}

#routerView {
  background-color: chocolate;
  grid-column-start: 1;
  grid-column-end: 2;
  grid-row-start: 2;
  grid-row-end: 3;
  margin-right: 5px;
}

#footer {
  background-color: darkmagenta;
  grid-column-start: 1;
  grid-column-end: 3;
  grid-row-start: 3;
  grid-row-end: 4;
  margin-top: 5px;
}

/* Global SCSS */

.view {
  background-color: lightgray;
  height: 100%;
}
</style>
