<template>

  <div>
    <div id="map"></div>
  </div>
</template>

<script>
import {mapGetters} from "vuex";


export default {
  name: "KakaoMap"
  ,

  data() {
    return {
      map: null,
      geocoder: null,
      markers: [],
      latitude: 0,
      longitude: 0
    }
  }
  ,
  computed:
    mapGetters({
      getDetailPointer: 'getDetailPointer'
    })

  ,
  mounted() {
      const script = document.createElement("script");
      /* global kakao */
      script.onload = () => kakao.maps.load(this.initMap);
      script.src = "//dapi.kakao.com/v2/maps/sdk.js?autoload=false&appkey=64c1e136c39b4d5babf8df5c8ac78958&libraries=services";

      document.head.appendChild(script);
    //
  }
  ,
  // state의 매물의 주소가 변할때마다 마커 주소 이동
  watch: {
    getDetailPointer: function() {
      this.detailMarker(this.getDetailPointer);
    }
  }
  ,
  methods: {
    initMap() {
      const container = document.getElementById("map"); // 지도를 표시할 div
      const options = {
        center: new kakao.maps.LatLng(37.566680, 126.978527), // 지도의 중심 좌표(시작점)
        level: 5, // 지도의 확대 레벨
      };
      const map = new kakao.maps.Map(container, options);
      this.map = map;

      // // 지도를 클릭한 위치에 표출할 마커
      // const marker = new kakao.maps.Marker({
      //   position: map.getCenter() // 지도 중심좌표에 마커를 생성
      // });
      // //  지도에 마커를 표시
      // marker.setMap(this.map);

      // 주소-좌표 변환 객체를 생성
      this.geocoder = new kakao.maps.services.Geocoder();

      // 주소로 좌표를 검색합니다
      this.geocoder.addressSearch(this.getDetailPointer, function (result, status) {
        // console.log(status);
        // 정상적으로 검색이 완료됐으면®
        if (status === kakao.maps.services.Status.OK) {

          const coords = new kakao.maps.LatLng(result[0].y, result[0].x);

          // 결과값으로 받은 위치를 마커로 표시합니다
          const marker = new kakao.maps.Marker({
            map: map,
            position: coords
          });

          // 인포윈도우로 장소에 대한 설명을 표시합니다
          const infowindow = new kakao.maps.InfoWindow({
            content: '<div style="width:150px;text-align:center;padding:6px 0;">매물 주소</div>'
          });
          infowindow.open(map, marker);

          // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
          map.setCenter(coords);
        }
      });

      // // 반경만들기
      // let circle = new kakao.maps.Circle({
      //   map: this.map,
      //   center : new kakao.maps.LatLng(this.latitude, this.longitude),
      //   radius: this.distance,
      //   strokeWeight: 1,
      //   strokeColor: '#00a0e9',
      //   strokeOpacity: 0.1,
      //   strokeStyle: 'solid',
      //   fillColor: '#00a0e9',
      //   fillOpacity: 0.2
      // });
      // circle.setMap(this.map);
      //
      // // 클릭한 곳 좌표 받아오기
      // kakao.maps.event.addListener(this.map, 'click', function(mouseEvent) {
      //
      //   // 클릭한 위도, 경도 정보를 가져옴
      //   let latlng = mouseEvent.latLng;
      //   this.latitude = latlng.getLat()                //바인딩되지 않음.
      //   this.longitude = latlng.getLng()
      //   console.log(this.latitude, this.longitude)

      // // 원 중심좌표 이동
      // if(circledis == true && this.distance != 0){
      //   let position = new kakao.maps.LatLng(this.latitude, this.longitude);
      //   circle.setPosition(position);
      // }

      // // 마커 위치를 클릭한 위치로 옮깁니다
      // marker.setPosition(latlng);
      //   });
      },
    detailMarker(e) {
      const container = document.getElementById("map"); // 지도를 표시할 div
      const options = {
        center: new kakao.maps.LatLng(37.566680, 126.978527), // 지도의 중심 좌표(시작점)
        level: 5, // 지도의 확대 레벨
      };
      const map = new kakao.maps.Map(container, options);
      // this.map = map;

      // 주소-좌표 변환 객체를 생성
      this.geocoder = new kakao.maps.services.Geocoder();

      // 주소로 좌표를 검색합니다
      this.geocoder.addressSearch(e, function(result, status) {
        // console.log(status);
        // 정상적으로 검색이 완료됐으면®
        if (status === kakao.maps.services.Status.OK) {

          const coords = new kakao.maps.LatLng(result[0].y, result[0].x);

          // 결과값으로 받은 위치를 마커로 표시합니다
          const marker = new kakao.maps.Marker({
            map: map,
            position: coords
          });

          // 인포윈도우로 장소에 대한 설명을 표시합니다
          const infowindow = new kakao.maps.InfoWindow({
            content: '<div style="width:150px;text-align:center;border-radius:5px;padding:6px 0;">매물 주소</div>'
          });
          infowindow.open(map, marker);

          // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
          map.setCenter(coords);
        }
      });
    }


  }




}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#map {
  position: absolute;

  width: calc(100vw - 400px);
  height: calc(100vh - 80px);
  z-index: 1;
}
.button-group {
  z-index: 9999;
  position: absolute;
  top: 500px;
  left: 200px;
}
button {
  margin: 0 3px;
}
</style>