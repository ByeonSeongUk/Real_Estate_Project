<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App',

  data() {
    return {

    }
  },

  components: {

  }
}
</script>

<style>
* {
    margin: 0;
    padding: 0;
    font-family: 'Nanum Gothic', sans-serif;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

.navBar {
  border-bottom: solid 1px #999999;
}


</style>