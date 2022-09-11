<template>
  <div id="WishListBox">
    <router-link to="myListDetails" class="houseList">
      <HouseList :getELEST="getELEST[i]" v-for="(roomList, i) in getELEST" :key="i" class="houseList"/>
    </router-link>
  </div>
</template>

<script>
import {mapGetters} from "vuex";
import HouseList from "@/components/HouseList";

export default {
  name: "WishListBox",

  computed: mapGetters({
    getELEST: 'getELEST'
  }),

  components: {
    HouseList
  }

}
</script>

<style scoped>
a {
  text-decoration: none;
  color: #333333;
  display: block;
}

.houseList {
  box-shadow: 0 2px 3px 0 rgba(0, 0, 0, 0.1);
  border-top: 0.5px solid rgb(225, 225, 225);
  box-sizing: border-box;
}
</style>