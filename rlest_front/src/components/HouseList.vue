<!-- 매물 컴포넌트 -->
<template>
    <div id="HouseList">
        <div class="oneroomImg">
<!--            <img :src="require(`@/assets/images/orImg${getELEST.rlest_num}.jpeg`)" alt="원룸사진"/>-->
        </div>

        <div class="oneroomInfo" @click="setClickRlestNumber(getRlestListAll.rlestNum)">
          <div class="wishList">
            <a v-if="getWishList == 0" href=""><i class="fa-solid fa-heart"></i></a>
            <a v-if="getWishList == 1" href=""><i class="fa-regular fa-heart"></i></a>
          </div>
          <p class="info_content">{{ getRlestListAll.structure }} 원룸</p>
          <h4 class="info_header">{{ getRlestListAll.rlestSort }} {{ numberToKorean(getRlestListAll.deposit) }} / {{ numberToKorean(getRlestListAll.monthlyRent) }}</h4>
          <p class="info_content">{{ getRlestListAll.roomArea}}m², {{ getRlestListAll.floor }} 층</p>
          <p class="info_content">{{ getRlestListAll.rlestAdr }}</p>
          <p class="info_content">{{ getRlestListAll.rlestIntro }}</p>
        </div>
    </div>
</template>

<script>

import {mapGetters} from "vuex";

export default {
    name: 'HouseList',
    props: {
      getELEST: Object, // Dummy Data
      getRlestListAll: Object, // 매물 리스트
    }
    ,
    computed: {
      ...mapGetters([
          'getWishList',
          'getRlestDetail'
      ])
    }
    ,
    methods: {
        setClickRlestNumber(e) {
          console.log(e);
          this.$store.commit('setClickRlestNumber', e)
        }


        ,
        // 단위 변환
        unitConversion(){
            const meter = 3.3058;
            let testMeter = 7;

            testMeter *= meter;
            testMeter.toFixed(3);

        }
        ,
        // 받아온 금액을 한글로 변환
        numberToKorean(number){
          let inputNumber  = number < 0 ? false : number;
          let unitWords    = ['', '만원', '억', '조', '경'];
          let splitUnit    = 10000;
          let splitCount   = unitWords.length;
          let resultArray  = [];
          let resultString = '';

          for (let i = 0; i < splitCount; i++){
            let unitResult = (inputNumber % Math.pow(splitUnit, i + 1)) / Math.pow(splitUnit, i);
            unitResult = Math.floor(unitResult);
            if (unitResult > 0){
              resultArray[i] = unitResult;
            }
          }

          for (let i = 0; i < resultArray.length; i++){
            if(!resultArray[i]) continue;
            resultString = String(resultArray[i]) + unitWords[i] + resultString;
          }

          return resultString;
        }

    },

}

</script>

<style scoped>
#HouseList {
    display: flex;
    width: 100%;
    height: 140px;
    padding: 10px 18px;
    background-color: white;
    border-left: 0.5px solid RGB(225, 225, 225);
}
#HouseList:hover {
  background: rgb(225, 225, 225);
}

#HouseList .oneroomImg {
    display: block;
    width: 150px;
    height: 100%;
    margin-right: 3%;

     background: darkseagreen;
}

#HouseList .oneroomImg > img {
    width: 100%;
    height: 100%;
}

#HouseList .oneroomInfo {
    display: block;
    width: 80%;
    height: 100%;
}

/* 부트스트랩으로 CSS충돌 떄문에 Class로 따로 잡음 */
.info_header {
    font-size: 1.1rem;
    margin: 3px 0;
    font-weight: bold;
}

.info_content {
    font-size: 0.8rem;
    margin: 3px 0 0 0;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}

.info_content:first-child {
    font-size: 0.6rem;
    color: #777;
    font-weight: 600;
}

.wishList i {
  float: right;
  padding-top: 7px;
  font-size: 1.5rem;
  color: red;
}

@media screen and (max-width: 800px) {
  #HouseList {
    width: 100%;
  }
}

</style>