a<template>
  <div class="main">
    <HouseMap :deposit="deposit" :monthlyRent="monthlyRent"></HouseMap>
  </div>
</template>

<script>
import HouseMap from '../components/HouseMap.vue'

export default {
  data() {
    return {
      deposit: 0, // 보증금
      monthlyRent: 0, // 월세
      contract: 'contractAll', // 계약 방법(전체, 전세, 월세)
      structure: 'structureAll', // 방구조
    }
  },

  components: {
    HouseMap
  },
  updated() {
    this.monthlyRent = 0;
  }

}

</script>

<style>
@media screen and (max-width: 800px) {
  #searchBox {
    display: none;
  }

  .loginBtn {
    display: none;
  }
}

</style>
