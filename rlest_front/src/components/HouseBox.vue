<!-- 매물 리스트 -->
<template>
    <div id="HouseBox">
        <HouseBoxInfo></HouseBoxInfo>

        <div v-if="getRlestListAll.length != 0" @click="rlestDetail">
          <HouseList :getRlestListAll="getRlestListAll[i]" v-for="(roomList, i) in getRlestListAll" :key="i" class="HouseList"/>
        </div>
        <div v-else-if="getRlestListAll.length === 0">
          <h2 style="font-size: 1.2rem; text-align: center; padding: 30px 0">조건에 만족하는 매물이 없습니다!</h2>
        </div>

        <div  v-if="getRlestListAll.length != 0" class="row" style="padding-top: 20px; margin-left: 0; margin-right: 0;">
          <div class="col-2"></div>
          <div class="col-8">
            <nav aria-label="Page navigation example">
              <ul class="pagination"  style="justify-content: center; text-align: center;">

                <li class="page-item">
                  <a @click="setCurrentPage(getPaging.before == 0 ? Math.floor(getPaging.count / getPaging.offset) + 1 : getPaging.before)" class="page-link" aria-label="Previous">
                    <span aria-hidden="true">
                      <i class="fa-solid fa-chevron-left" id="leftBtn"/>
                    </span>
                  </a>
                </li>

                <li v-for="(currentNum, i) in range(getPaging.startPage, getPaging.endPage)" :key="i" class="page-item">
                  <a @click="setCurrentPage(currentNum)" class="page-link">{{currentNum}}</a>
                </li>


                <li class="page-item">
                  <a class="page-link" @click="setCurrentPage(getPaging.nextSection ? getPaging.forward: 1)" aria-label="Next">

                    <span aria-hidden="true">
                      <i class="fa-solid fa-chevron-right" id="rightBtn"/>
                    </span>
                  </a>
                </li>

              </ul>
            </nav>
            <div class="col-2"></div>
          </div>
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
        getRlestDetail: 'getRlestDetail',
        getListCount: 'getListCount',
        getCurrentPage: 'getCurrentPage',
        getPaging: 'getPaging'
    })
    ,

    methods: {

      rlestDetail() {
        this.$store.dispatch('rlestDetail')
      }
      ,
      setCurrentPage(e) {
        console.log(e);
        this.$store.commit('setCurrentPage', e);
      }
      ,
      // 페이징 버튼 맞추기
      range: function (start, end){
        let list = []
        for (let i = start; i <= end ; i ++) list.push(i);
        return list;
      }
    }

    ,
    action: {

      rlestDetail() {
        this.$store.dispatch('rlestDetail')
      }
    }
    // ,
    //
    // mounted() {
    //   this.getRlestList();
    // }
    // ,
    // // 페이징 처리 번호를 받아옴
    // watch: {
    //   getCurrentPage: function() {
    //     console.log('watcher')
    //     this.getRlestList();
    //   }
    // }

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