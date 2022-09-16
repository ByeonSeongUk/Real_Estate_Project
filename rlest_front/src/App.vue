<template>
  <div id="app">
    <NavBar></NavBar>
    <router-view></router-view>
  </div>
</template>

<script>
import NavBar from "@/components/NavBar";
export default {
  name: 'App',

  data() {
    return {

    }
  },

  components: {
    NavBar
  }
  ,
  methods: {
    loginCheck() {
      this.$store.dispatch('loginCheck');
    }
  }
  ,
  action: {
    loginCheck() {
      this.$store.dispatch('loginCheck');
    }
  }
  ,
  mounted() {
    this.loginCheck();
  }

}
</script>

<style>
/* background : #224CE6 */
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