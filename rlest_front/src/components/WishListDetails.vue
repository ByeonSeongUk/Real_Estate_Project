<!-- 검색 컴포넌트 -->
<template>
    <div id="HouseDetails">
      <div id="houseDetailsInfo">
        <div class="container mainBox">

          <div class="row detailBar">
            <div class="col-1">
              <a @click="goBack" href="#"><img id="backBtn" src="../assets/images/backBtn.png" alt="backBtn"/></a>
            </div>
            <div class="col-9">
              <h4 id="detailHeader">OO구 OO동</h4>
            </div>
            <div class="col-2">
              <a href=""><img id="unitBtn" src="../assets/images/unitChangeBtn.png" alt="unitChangeBtn"/></a>
            </div>
          </div>

          <!-- 이미지 -->
          <div class="row" style="width: 100%">
            <img data-bs-toggle="modal" data-bs-target="#imgModal" id="mainImg" src="../assets/images/orImg24824824.jpeg"/>
          </div>

          <!-- 거래 상태 / 등록일 -->
          <div class="row space">
            <div class="col">
              <span class="transStatus">거래 가능</span>
            </div>

            <div class="col">
              <span class="regDate">2022.07.13</span>
            </div>
          </div>

          <!-- 전월세 구분, 금액 -->
          <div class="row space division">
            <div class="col-10">
              <h4>월세 1000&#160;&#47;&#160;80</h4>
            </div>

            <!-- 위시리스트 -->
            <div class="col-2 wishList">
              <a v-if="getWishList == 0" href=""><i class="fa-solid fa-heart"></i></a>
              <a v-if="getWishList == 1" href=""><i class="fa-regular fa-heart"></i></a>
            </div>

            <p>등록번호&#160;&#58;&#160;1234567890</p>
          </div>

          <!-- 면적 | 관리비 | 구조 -->
          <div class="row space conHeader">

            <div class="col">
              <h4>면적</h4>
              <p>24m²</p>
            </div>

            <div class="col">
              <h4>관리비</h4>
              <p>10만원</p>
            </div>

            <div class="col">
              <h4>구조</h4>
              <p>분리형 원룸</p>
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
              <span>불가능</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>엘리베이터</span>
            </div>
            <div class="col-8">
              <span>없음</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>입주가능일</span>
            </div>
            <div class="col-8">
              <span>2022.09.01</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>관리비</span>
            </div>
            <div class="col-8">
              <span>10만원</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>구조</span>
            </div>
            <div class="col-8">
              <span>분리형 원룸</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>방향</span>
            </div>
            <div class="col-8">
              <span>남향</span>
            </div>
          </div>

          <div class="row infoContents">
            <div class="col infoHead">
              <span>층수</span>
            </div>
            <div class="col-8">
              <span>3/10층</span>
            </div>
          </div>

          <div class="row infoContents lastInfo">
            <div class="col infoHead">
              <span>주소</span>
            </div>
            <div class="col-8">
              <span>OO구 OO동 1612-10, 301호</span>
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
            <h3 class="intro-header">등록한 매물 제목</h3>
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
            <h3 class="intro-header">OOOOO부동산중개사무소<p>02-333-2222</p></h3>
          </div>

          <!-- 중개사무소 소개 내용 -->
          <div class="row">
            <div class="col contents last-con">
              <p>🎪 집토스 직영부동산은 깐깐합니다.🎪<br>
                ✅ 등기부등본을 확인해서 안전한 집✅<br>
                🎈 건축물대장을 체크해서 자세히 기록한 집🎈<br>
                💎직접 촬영하고 확인했으니까 믿을 수 있는 집💎</p>
            </div>
          </div>

          <div class="row" style="margin: 0; padding-bottom: 15px">
            <!-- 좌측 주소 입력 폼들 -->
            <div class="d-grid gap-2 col-4 mx-auto">
              <button @click="test" class="btn btn-danger btnStyle">삭제</button>
            </div>
            <div class="d-grid gap-2 col-4 mx-auto">
              <button class="btn btn-success btnStyle">수정</button>
            </div>
            <div class="d-grid gap-2 col-4 mx-auto">
              <button class="btn btn-info btnStyle postBtn">거래완료</button>
            </div>
          </div>

        </div>


      </div>
    </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
    name: 'HouseDetails',
    computed: mapGetters({
      getWishList: 'getWishList',
      getELEST: 'getELEST',
    })
    ,
    methods: {
      // 뒤로가기 버튼
      goBack() {
        this.$router.go(-1);
      }
      ,
      test() {
        // confirm('매물번호 [' + this.getELEST[0].rlest_num + ']을(를) 삭제하시겠습니까?');
        alert('매물번호 [' + this.getELEST[0].rlest_num + ']을(를) 삭제할 수 없습니다!\n - 거래완료 처리 후 다시 시도해주세요!');
      }

    }
}
</script>

<style scoped>
li, ul, ol {
  list-style: none;
}

#HouseDetails {
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