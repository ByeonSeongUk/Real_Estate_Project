<!-- 매물 리스트 -->
<template>
    <div id="HouseBox">
        <HouseBoxInfo></HouseBoxInfo>
        <div @click="rlestDetail">
          <HouseList :getRlestListAll="getRlestListAll[i]" v-for="(roomList, i) in getRlestListAll" :key="i" class="HouseList"/>
        </div>
    </div>
</template>

<script>
import HouseBoxInfo from './HouseBoxInfo';
import HouseList from './HouseList.vue';
import {mapGetters} from "vuex";

export default {
    name: 'HouseBox',
    components: {
      HouseBoxInfo,
      HouseList
    }
    ,
    computed:
      mapGetters({
        getRlestListAll: 'getRlestListAll',
        getClickRlestNumber: 'getClickRlestNumber',
        getRlestDetail: 'getRlestDetail'
    })
    ,

    methods:
    {

      getRlestList() {
        this.$store.dispatch('getRlestList')

      }
      ,
      rlestDetail() {
        this.$store.dispatch('rlestDetail')
      }


    }

    ,
    action: {
      getRlestList() {
        this.$store.dispatch('getRlestList')

      }
      ,
      rlestDetail() {
        this.$store.dispatch('rlestDetail')
      }
    }
    ,

    mounted() {
      this.getRlestList();
    }

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
  background: white;
  border-left: 1px solid rgb(225, 225, 225);
  box-sizing: border-box;
}

.HouseList {
  border-bottom: 1px solid rgb(225, 225, 225);
  box-sizing: border-box;
}

@media screen and (max-width: 800px) {
  #HouseBox {
    width: 100%;
  }
}
</style>