<!-- 매물 컴포넌트 -->
<template>
    <div id="HouseList">
        <div class="oneroomImg">
            <img :src="require(`@/assets/images/orImg${getELEST.rlest_num}.jpeg`)" alt="원룸사진"/>
        </div>

        <div class="oneroomInfo">
            <p class="info_content">{{getELEST.structure}} 원룸</p>
            <h4 class="info_header">{{ getELEST.rlest_sort }} {{ getELEST.deposit }} / {{ getELEST.monthly_rent}}</h4>
            <p class="info_content">{{getELEST.room_area}}m², {{getELEST.floor}} 층</p>
            <p class="info_content">{{ getELEST.rlest_adr }}</p>
            <p class="info_content">{{  getELEST.post_title }}</p>
        </div>
    </div>
</template>

<script>

export default {
    name: 'HouseList',
    props: {
      getELEST: Object
    }
    ,

    methods: {
        // 단위 변환
        unitConversion(){
            const meter = 3.3058;
            let testMeter = 7;
            
            testMeter *= meter;
            testMeter.toFixed(3);

        },
    },

}

</script>

<style scoped>
#HouseList {
    display: flex;
    width: 400px;
    height: 140px;
    padding: 10px 18px;
    background-color: white;
    border-left: 0.5px solid RGB(225, 225, 225);
}

#HouseList .oneroomImg {
    display: block;
    width: 35%;
    height: 100%;
    margin-right: 3%;
}

#HouseList .oneroomImg > img {
    width: 100%;
    height: 100%;
}

#HouseList .oneroomInfo {
    display: block;
    width: 62%;
    height: 100%;
}

/* 부트스트랩으로 CSS충돌 떄문에 Class로 따로 잡음 */
.info_header {
    font-size: 1.3rem;
    margin: 3px 0;
    font-weight: bold;
}

.info_content {
    font-size: 0.8rem;
    margin: 3px 0 0 0;

    /* overflow ... 처리 */
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}

.info_content:first-child {
    font-size: 0.6rem;
    color: #777;
    font-weight: 600;
}

@media screen and (max-width: 800px) {
  #HouseList {
    width: 100%;
  }
}

</style>