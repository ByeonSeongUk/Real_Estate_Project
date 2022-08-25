<!-- 매물 리스트 -->
<template>
    <div id="HouseBox">
        <div id="houseBoxInfo">
            <div class="hb_list">
                <span>지역 목록 OO 개</span>
            </div>
            <div class="hb_unit">
                <a href=""><img src="../assets/images/unitChangeBtn.png"></a>
            </div>
        </div>
        <router-link to="houseDetails">
          <HouseList :getELEST="getELEST[i]" v-for="(roomList, i) in getELEST" :key="i"/>
        </router-link>


    </div>
</template>

<script>
import HouseList from './HouseList.vue';
import {mapGetters} from "vuex";

export default {
    name: 'HouseBox',

    computed: mapGetters({
      getELEST: 'getELEST'
    }),

    components: {
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

#houseBoxInfo {
    display: flex;
    width: 100%;
    height: 50px;
    border: 1px solid rgb(225, 225, 225);
    background: white;
}

.hb_list {
    padding-left: 10px;
    width: 80%;
    height: 100%;
    line-height: 50px;
    background: #FFFFFF;
}

.hb_list > span {
    font-weight: 600;
    margin-left: 10px;
}

.hb_unit {
    width: 20%;
    height: 100%;
    line-height: 50px;
    text-align: center;
    background: #FFFFFF;
}
@media screen and (max-width: 800px) {
  #HouseBox {
    width: 100%;
  }
}
</style>