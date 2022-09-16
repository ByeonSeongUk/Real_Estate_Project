a<template>
  <div class="main">
    <HouseMap></HouseMap>
  </div>
</template>

<script>
import HouseMap from '../components/HouseMap.vue'

export default {
  name: "MainView",
  components: {
    HouseMap
  }

}

</script>

<style>
@media screen and (max-width: 800px) {
  #searchBox {
    display: none;
  }

  #map {
    display: none;
  }
}

@media screen and (max-width: 430px) {
  .loginBtn {
    display: none;
  }
}

</style>
