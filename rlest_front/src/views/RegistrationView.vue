<template>
  <div id="RegistrationView">
    <NavBar></NavBar>
    <RegistrationBox></RegistrationBox>
  </div>
</template>

<script>
import NavBar from '../components/NavBar.vue'
import RegistrationBox from '../components/RegistrationBox'

export default {
  name: "RegistrationView",

  components: {
    NavBar,
    RegistrationBox
  }
}
</script>

<style scoped>

</style>