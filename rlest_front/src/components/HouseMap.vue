<!-- 지도 -->
<template>
    <div id="mapPage">
        <SearchBox></SearchBox>
        <KakaoMap></KakaoMap>
        <router-view></router-view>
        <router-link to="houseBox"></router-link>
        <router-link to="houseDetails"></router-link>
    </div>
</template>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d88ad0c94a7c0ac04c5862f5b2537001"></script>
<script>

import SearchBox from './SearchBox.vue'
import KakaoMap from "./KakaoMap.vue";

export default {
    name: 'app',

    components: {
        SearchBox,
        KakaoMap
    }
}
</script>

<style scoped>
#mapPage {
    width: 100%;
    height: calc(100vh - 80px);
    background:cornsilk;
}


</style>