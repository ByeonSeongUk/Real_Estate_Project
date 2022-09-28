<!-- 이미지 슬라이드 배너 -->
<template>
  <div id="ImgBanner">
    <a @click="setPrevImg"><i class="fa-solid fa-chevron-left" id="leftBtn"/></a>
      <transition-group  name="fade" tag="div" mode="in-out" id="imgListBox">
        <div v-for="(a, i) in [getCurrentIndex]" :key="i" class="imgList">
          <img :src="srcChg(getCurrentImg)" :alt="'매물이미지' + {i}"/>
        </div>
      </transition-group>
    <a @click="setNextImg"><i class="fa-solid fa-chevron-right" id="rightBtn"/></a>
  </div>
</template>

<script>
import {mapGetters, mapMutations} from "vuex";

export default {
  name: "ImgBanner",

  computed : {
    ...mapGetters({
      getCurrentIndex: 'getCurrentIndex',
      getCurrentImg: 'getCurrentImg'
    })

  }
  ,
  methods : {   
    ...mapMutations({
      setPrevImg: 'setPrevImg',
      setNextImg: 'setNextImg',
    })
    ,
    srcChg(fileNameArr) {
      return require('../assets/images/' + fileNameArr);
    }
  }
  ,

}
</script>

<style scoped>
a {
  text-decoration: none;
  color: #333333;
}
li, ul, ol {
  list-style: none;
  padding: 0;
}
#ImgBanner {
  position: relative;
  width: 100%;
  height: auto;
}
#imgListBox {
  position: absolute;
  width: 100%;
  height: auto;
  top: 0;
  left: 0;

}

#imgListBox img {
  width: 100%;
  height: auto
}
.imgList {
  float: left;
  width: 60vw;
}

#leftBtn, #rightBtn {
  position: fixed;
  top: 50%;
  z-index: 9999;
  font-size: 5rem;
}

#leftBtn {
  left: 5vw;
}
#rightBtn {
  right: 5vw;
}

#leftBtn:hover, #rightBtn:hover {
  color: white;
}

.fade-enter-active,
.fade-leave-active {
  transition: all .5s ease;
  opacity: 1;
}
.fade-enter,
.fade-leave-to {
  opacity: 0;
}
.fade-leave-to {
  display:none;
}
</style>