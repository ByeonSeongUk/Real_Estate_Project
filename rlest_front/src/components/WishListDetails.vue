<!-- 검색 컴포넌트 -->
<template>

    <div id="wishListDetails">

      <ImgModal></ImgModal>

      <div id="houseDetailsInfo">
        <div class="container mainBox">

          <div class="row detailBar">
            <div class="col-2">
              <a @click="goBack"><img id="backBtn" src="../assets/images/backBtn.png" alt="backBtn"/></a>
            </div>
            <div class="col-8">
              <h4 id="detailHeader">{{ getWishListDetail[0].rlestAdr }}</h4>
            </div>
            <div class="col-2">
<!--              <a><img id="unitBtn" src="../assets/images/unitChangeBtn.png" alt="unitChangeBtn"/></a>-->
            </div>
          </div>

          <!-- 이미지 -->
          <img data-bs-toggle="modal" data-bs-target="#imgModal" id="mainImg" src="../assets/images/orImg24824824.jpeg"/>

          <!-- 거래 상태 / 등록일 -->
          <div class="row space">

            <div class="col-4">
              <span      v-if="getWishListDetail[0].transStatusCheck == false" class="transStatusFalse">거래&#160;가능</span>
              <span v-else-if="getWishListDetail[0].transStatusCheck == true" class="transStatusTrue">거래&#160;완료</span>
            </div>

            <div class="col-8">
              <span class="regDate">{{ getWishListDetail[0].crtDttm }}&#160;작성</span>
            </div>
          </div>

          <!-- 전월세 구분, 금액 -->
          <div class="row space division">
            <div class="col-10">
              <h4>{{ numberToKorean(getWishListDetail[0].deposit) }}&#160;&#47;&#160;{{ numberToKorean(getWishListDetail[0].monthlyRent) }}</h4>
            </div>

            <!-- 위시리스트 -->
            <div class="col-2 wishList">
              <a @click="wishListCtrDel" v-if="getWishListState == 1"><i class="fa-solid fa-heart"></i></a>
              <a @click="wishListCtrDel" v-if="getWishListState == 0"><i class="fa-regular fa-heart"></i></a>
            </div>

            <p>등록번호&#160;&#58;&#160;{{ getWishListDetail[0].rlestNum }}</p>
          </div>

          <!-- 면적 | 관리비 | 구조 -->
          <div class="row space conHeader">

            <div class="col">
              <h4>면적</h4>
              <p>{{ getWishListDetail[0].roomArea }}m²</p>
            </div>

            <div class="col">
              <h4>관리비</h4>
              <p>{{ numberToKorean(getWishListDetail[0].maintenanceCharge) }}</p>
            </div>

            <div class="col">
              <h4>구조</h4>
              <p>{{ getWishListDetail[0].structure }}&#160;원룸</p>
            </div>
          </div>

          <!-- 매물 정보 -->
          <div class="row space conInfo">
            <h3>매물 정보</h3>
          </div>

          <!-- 매물 정보 내역 시작 -->
          <div class="row infoContents">
            <div class="col infoHead">
              <span>주차</span>
            </div>
            <div class="col-8">
              <span v-if="getWishListDetail[0].structure == false">불가능</span>
              <span v-else>가능</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>엘리베이터</span>
            </div>
            <div class="col-8">
              <span v-if="getWishListDetail[0].elevatorCheck == false">없음</span>
              <span v-else>있음</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>입주가능일</span>
            </div>
            <div class="col-8">
              <span>{{ getWishListDetail[0].moveInDay }}</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>관리비</span>
            </div>
            <div class="col-8">
              <span>{{ numberToKorean(getWishListDetail[0].maintenanceCharge) }}</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>구조</span>
            </div>
            <div class="col-8">
              <span>{{ getWishListDetail[0].structure }}&#160;원룸</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>방향</span>
            </div>
            <div class="col-8">
              <span>{{ getWishListDetail[0].direction }}</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>층수</span>
            </div>
            <div class="col-8">
              <span>{{ getWishListDetail[0].floor }}층&#47;{{ getWishListDetail[0].totalFloor }}층</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>주소</span>
            </div>
            <div class="col-8">
              <span>{{ getWishListDetail[0].rlestAdr }}</span>
            </div>
          </div>
          <!-- 매물 정보 끝 -->

          <!-- 옵션 정보 -->
          <div class="row space conInfo">
            <h3>옵션 정보</h3>
          </div>

          <!-- 옵션 항목 -->
          <div class="row space">
            <ul class="optionListBox">
              <li class="optionList"><p>에어컨</p></li>
              <li class="optionList"><p>냉장고</p></li>
              <li class="optionList"><p>세탁기</p></li>
              <li class="optionList"><p>가스레인지</p></li>
              <li class="optionList"><p>인덕션</p></li>
              <li class="optionList"><p>전자레인지</p></li>
              <li class="optionList"><p>책상</p></li>
              <li class="optionList"><p>책장</p></li>
              <li class="optionList"><p>침대</p></li>
              <li class="optionList"><p>옷장</p></li>
              <li class="optionList"><p>신발장</p></li>
              <li class="optionList"><p>싱크대</p></li>
            </ul>
          </div>

          <!-- 매물 설명 제목 -->
          <div class="row space conInfo">
            <h3>{{ getWishListDetail[0].postTitle }}</h3>
          </div>

          <!-- 매물 설명 내용 -->
          <div class="row">
            <div class="col contents">
              <p>간만에 넓은원룸풀옵션 나왔습니다<br>
                도배장판깔끔 씽크대깔끔 화장실깔끔<br>
                집내부에 세탁실별도 주차는 공동주차장선착순<br>
                모든대출가능 빨리보셔요</p>
            </div>
          </div>

          <!-- 중개사무소 소개 제목 -->
          <div class="row space conInfo">
            <h3>OOOOO부동산중개사무소</h3>
            <p>02-333-2222</p>
          </div>

          <!-- 중개사무소 소개 내용 -->
          <div class="row">
            <div class="col contents">
              <p>🎪 집토스 직영부동산은 깐깐합니다.🎪<br>
                ✅ 등기부등본을 확인해서 안전한 집✅<br>
                🎈 건축물대장을 체크해서 자세히 기록한 집🎈<br>
                💎직접 촬영하고 확인했으니까 믿을 수 있는 집💎</p>
            </div>
          </div>

        </div>


      </div>

    </div>

</template>

<script>
import { mapGetters } from "vuex";

export default {
    name: 'wishListDetails',
    computed: {
      ...mapGetters({
        getWishListState: 'getWishListState',
        getWishListDetail: 'getWishListDetail',
        getClickRlestNumber: 'getClickRlestNumber'
      })
    }
    ,
    components: {
      ImgModal: 'ImgModal'
    }
    ,
    methods: {
      // 뒤로가기 버튼
      goBack() {
        this.$router.push('myList');
        this.$router.go();
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
      ,
      wishListCtrDel() {
        this.$store.dispatch('wishListCtrDel')
      }
      ,
      wishListCheck() {
        this.$store.dispatch('wishListCheck')
      }
    }
    ,
    action: {
      wishListCtrDel() {
        this.$store.dispatch('wishListCtrDel')
      }
      ,
      wishListCheck() {
        this.$store.dispatch('wishListCheck')
      }

    }
    ,
    created() {
      this.wishListCheck();
    }
}
</script>

<style scoped>
li, ul, ol {
  list-style: none;
}

#wishListDetails {
  width: 100%;
  height: calc(100vh - 160px);

  box-shadow: 0 2px 3px 0 rgba(0, 0, 0, 0.1);
}

#houseDetailsInfo {
  display: flex;
  width: 100%;
  height: 100%;
  border: 1px solid rgb(225, 225, 225);
  box-sizing: border-box;
  background: #FFFFFF;
}

.mainBox {
  padding: 0;
  overflow-y: scroll;
}

.mainBox::-webkit-scrollbar {
  display: none; /* Chrome, Safari, Opera*/
}

.space {
  margin: 10px 10px 0 10px;
}

/* 상단 바 */
.detailBar {
  margin: 0;
  padding-top: 10px;
  width: 100%;
  height: 50px;
  background: #FFFFFF;
}

.detailBar > img {
  width: 30px;
  height: 30px;
}

#detailHeader {
  float: left;
  padding-top: 2px;
  font-size: 1.3rem;
}

#unitBtn {
  float: right;
}

/* 대표 이미지 */
#mainImg {
  padding: 0;
  width: 100%;
  height: 40vw;
}

/* 거래 상태 */
#houseDetailsInfo .transStatus {
  font-weight: bold;
  font-size: 1.2rem;
  color: forestgreen;
}

#houseDetailsInfo .regDate {
  float: right;
  font-weight: 600;
  font-size: 1rem;
}

/* 전월세 구분 / 금액 */
.division {
  border-bottom: 2px solid #F5F5F5;
}

.division > div > h4 {
  font-weight: bold;
  font-size: 2rem;
}

.division > p {
  font-size: 0.8rem;
  color: #777777;
}

.division .wishList i {
  float: right;
  padding-top: 7px;
  font-size: 1.5rem;
  color: red;
}

.conHeader {
  padding-top: 10px;
}

.conHeader > div > h4 {
  font-weight: 600;
  font-size: 1rem;
}

.conHeader > div > p {
  margin-bottom: 5px;
  font-weight: bold;
  font-size: 1.2rem;
  color: #295797;
}

/* 매물 정보 */
.conInfo {
  border-top: 15px solid #F5F5F5;
  padding-top: 10px;
}

.conInfo > h3 {
  font-weight: bold;
  font-size: 1.5rem;
}

/* 매물 정보의 칸별 스타일 */
.infoContents {
  margin: 5px 10px 0 10px;
  padding: 5px;
  border-top: 0.5px solid rgb(225, 225, 225);
  box-sizing: border-box;
}

.lastInfo {
  border-bottom: 0.5px solid rgb(225, 225, 225);
  box-sizing: border-box;
}

/* 소제목 */
.infoHead {
  text-align: center;
  border-right: 0.5px solid rgb(225, 225, 225);
  box-sizing: border-box;
}

.infoHead > span {
  font-weight: bold;
}

/* 옵션 전체 박스 */
.optionListBox > li {
  float: left;
}

.optionListBox > li:nth-child(5n) {
  margin-right: 0;
}

/* 옵션의 리스트들 */
.optionList {
  float: left;
  text-align: center;
  line-height: 7.5vw;
  padding: 2px;
  margin: 0 1.25% 2% 0;
  width: 19%;
  height: 7.5vw;
  font-weight: 600;
  font-size: 0.9rem;
  color: #333333;
  border: 1px solid #F5F5F5;
  border-radius: 5%;
  box-sizing: border-box;
  box-shadow: 0 2px 3px 0 rgba(0, 0, 0, 0.1);

}

/* 매물소개, 중개사소개 제목*/
.intro-header {
  padding-bottom: 10px;
  border-bottom: 1px solid rgb(225, 225, 225);
  box-sizing: border-box;
}

.intro-header > p {
  float: right;
  font-weight: 500;
  font-size: 1rem;
  color: #333333;
}

/* 매물소개, 중개사소개 내용 */
.contents p {
  padding: 0 20px;
}
.last-con {
  padding-bottom: 20px;
  padding-right: 0;
}

/* 버튼 스타일 */
.btnStyle {
  color: white;
  font-weight: bold;
  padding: 10px;
}

.postBtn {
  background: #224CE6;
  border: 1px solid #224CE6;
}
</style>