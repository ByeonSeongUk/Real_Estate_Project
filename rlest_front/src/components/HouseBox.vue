<!-- 매물 리스트 -->
<template>
    <div id="HouseBox">
        <HouseBoxInfo></HouseBoxInfo>
        <router-link to="houseDetails">
          <HouseList :getELEST="getELEST[i]" v-for="(roomList, i) in getELEST" :key="i" class="HouseList"/>
        </router-link>


    </div>
</template>

<script>
import HouseBoxInfo from './HouseBoxInfo';
import HouseList from './HouseList.vue';
import {mapGetters} from "vuex";

export default {
    name: 'HouseBox',

    computed: mapGetters({
      getELEST: 'getELEST'
    }),

    components: {
      HouseBoxInfo,
      HouseList
    }
    ,

}
</script>

<style scoped>

a {
  text-decoration: none;
  color: #333333;
}

.hb_list > span {
    font-weight: 600;
    margin-left: 10px;
}

#HouseBox {
  float: right;
  width: 400px;
  height: calc(100vh - 80px);;
  overflow-y: scroll;
}

@media screen and (max-width: 800px) {
  #HouseBox {
    width: 100%;
  }
}
</style>