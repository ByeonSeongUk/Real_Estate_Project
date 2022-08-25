<template>
  <div app="RegistrationBox">
    <div class="container">
      <img class="mainImg" src="../assets/images/registrationMain.png" alt="방내놓기"/>

<!--   위치 입력 정보 시작   -->
      <div class="row">
        <div class="d-grid gap-2 col-12 mx-auto">
          <span class="title">위치&#32;정보</span>
        </div>
      </div>


      <div class="row">
        <!-- 좌측 주소 입력 폼들 -->
        <div class="col-sm-8">

          <!-- 주소 입력폼 -->
          <div class="row space">
            <div class="col-8 col-sm-12">
              <label class="form-label">주소</label>
              <input type="text" class="form-control">
            </div>
          </div>

          <!-- 번지 입력폼 -->
          <div class="row space">
            <label class="form-label">번지</label>
            <div class="col-6 col-sm-8">
              <input type="text" class="form-control">
            </div>

            <!-- 주소 검색 모달 버튼 -->
            <div class="col-6 col-sm-4 d-grid">
              <button type="button" class="btn btn-secondary" style="text-align: center; font-size: 0.85rem; font-weight: 600">검색</button>
            </div>
          </div>

          <!-- 상세 주소 입력폼 -->
          <div class="row space">
            <div class="col-8 col-sm-12">
              <label class="form-label">상세 주소</label>
              <input type="text" class="form-control">
            </div>
          </div>

        </div>


        <!-- 우측 지도 -->
        <div class="col-sm-4 space">
          <label class="form-label"></label>
          <div style="background: #EC9A39; width:100%; height: 90%; border-radius: 3%">입력한 위치 좌표 찍기</div>
        </div>
      </div>
<!--   위치 정보 입력 끝   -->

<!--   이미지 첨부   -->
      <!--   이미지 첨부 시작   -->
      <div class="row">
        <div class="d-grid gap-2 col-12 mx-auto">
          <span class="title">사진&#32;등록</span>
        </div>
      </div>

      <!-- 사진 목록 첫 번째 줄 헤더 -->
      <div class="row space">
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">대표사진</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">주방</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">화장실</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">방사진1</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">방사진2</label></div>
      </div>

      <!--   사진 목록 첫 번째 줄   -->
      <div class="row">
        <a href="/main" class="d-grid gap-2 col-2 mx-auto imgBox">
          <img src="../assets/images/orImg24824824.jpeg"/>
<!--          <label for="input-img1">주방</label>
          <input type="file" id="input-img1" class="form-control"/>-->
        </a>

        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img2">주방</label>
          <input type="file" id="input-img2" class="form-control"/>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img3">화장실</label>
          <input type="file" id="input-img3" class="form-control"/>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img4">방사진1</label>
          <input type="file" id="input-img4" class="form-control"/>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img5">방사진2</label>
          <input type="file" id="input-img5" class="form-control"/>
        </div>
      </div>

      <!-- 사진 목록 두 번째 줄 헤더 -->
      <div class="row space">
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">방사진3</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">방사진4</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">방사진5</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">방사진6</label></div>
        <div class="d-grid gap-2 col-2 mx-auto imgLabel"><label class="label-control">방사진7</label></div>
      </div>

      <!--   사진 목록 두 번째 줄   -->
      <div class="row">
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img6">방사진3</label>
          <input type="file" id="input-img6" class="form-control"/>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img7">방사진4</label>
          <input type="file" id="input-img7" class="form-control"/>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img8">방사진5</label>
          <input type="file" id="input-img8" class="form-control"/>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img9">방사진6</label>
          <input type="file" id="input-img9" class="form-control"/>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto imgBox">
          <label for="input-img10">방사진7</label>
          <input type="file" id="input-img10" class="form-control"/>
        </div>
      </div>

<!--   상세 정보 입력 시작   -->
      <div class="row">
        <div class="d-grid gap-2 col-12 mx-auto">
          <span class="title">상세&#32;정보</span>
        </div>
      </div>

      <!--   보증금   -->
      <div class="row" style="margin-top: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">보증금</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <input type="text" class="form-control">
        </div>
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="unit">만원</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto" style="text-align: left; line-height:250%; font-size: 12px; color: palevioletred;">
          <span>무보증일&#32;경우&#44;&#32;한달&#32;월세를&#32;입력</span>
        </div>
      </div>

      <!--   월세   -->
      <div class="row" style="margin-top: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">월세</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <input type="text" class="form-control">
        </div>
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="unit">만원</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto">
          <span>전세일&#32;경우&#44;0을&#32;입력</span>
        </div>
      </div>

<!--   상세 정보 입력 끝   -->

    </div><!-- container end -->




  </div>
</template>

<script>
export default {
  name: "RegistrationBox"
}
</script>

<style scoped>
  .container {
    width: 30%;
    /*background: #9F9F9F;*/
    margin-top: 30px;
    border: 1px solid #9F9F9F;
    border-radius: 2%;
  }

  /* 메인 이미지 */
  .mainImg {
    width: 100%;
    margin-top: 10px;
    border-radius: 3%;
  }

  /* 폼 마다의 여백 */
  .space {
    margin-top: 10px;
  }

  /* 큰 단위별 제목 */
  .title {
    text-align: left;
    font-weight: bold;
    font-size: 22px;
    border-bottom: 2px solid #777777;
    margin-top: 30px;
  }

  /* 입력 폼단위 제목 */
  .header {
    text-align: center;
    font-weight: bold;
    font-size: 16px;
    line-height: 250%;
  }

  /* 단위 스타일 (ex: 만원) */
  .unit {
    text-align: left;
    line-height: 250%;
  }

  /* 이미지 박스 */
  .imgLabel{
    text-align: left;
    padding-left: 5px;
  }

  .imgLabel > label {
    font-size: 14px;
    font-weight: 600;
    color: #333333;
  }

  .imgBox{
    padding: 0;
    height: 10vh;
    border-radius: 5%;
    /*border: 1px solid #9F9F9F;*/
    /*box-sizing: border-box;*/
    overflow: hidden;
    box-shadow: 0 4px 5px rgba(0, 0, 0, 0.3);
  }

  .imgBox > img {
    width: 100%;
    height: 100%;
  }

  .imgBox > label {
    text-align: center;
    line-height: 550%;
    font-size:14px;
  }

  .imgBox > input {
    display:none;
  }


</style>