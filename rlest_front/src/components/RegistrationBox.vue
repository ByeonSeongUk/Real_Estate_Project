<!-- 매물 등록 컴포넌트 -->
<template>
  <div app="RegistrationBox">
    <div class="container">
      <div class="row">
        <div class="d-grid gap-2 col-12 mx-auto" style="text-align: center; padding: 30px;">
          <h1 style="border-radius: 10px; background: #224CE6; padding: 15px 0; color: white">매물 등록</h1>
        </div>
      </div>
<!--      <img class="mainImg" src="../assets/images/registrationMain.png" alt="방내놓기"/>-->

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
          <div style="background: #224CE6; width:100%; height: 90%; border-radius: 3%">입력한 위치 좌표 찍기</div>
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
        <div class="d-grid gap-2 col-4 mx-auto addExplanation">
          <span>&#8251;&#32;무보증일&#32;경우&#44;&#32;0을&#32;입력</span>
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
        <div class="d-grid gap-2 col-4 mx-auto addExplanation">
          <span>&#8251;&#32;전세일&#32;경우&#44;&#32;0을&#32;입력</span>
        </div>
      </div>


      <!--   관리비   -->
      <div class="row" style="margin-top: 10px">

        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">관리비</span>
        </div>

        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <input type="text" class="form-control">
        </div>

        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="unit">만원</span>
        </div>

        <div class="d-grid gap-2 col-4 mx-auto">
          <div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">
          </div>
        </div>

        <!-- 관리비 포함의 종류 -->
        <div class="row" style="margin-top: 10px">

          <!-- 헤더 -->
          <div class="d-grid gap-2 col-2 mx-auto">
            <span style="font-size: 0.7rem; line-height: 30px; text-align: center; color: #999999">관리비 포함 항목</span>
          </div>

          <!-- 전기세 -->
          <div class="d-grid gap-2 col-2 mx-auto" style="margin-left: 2px">
            <input type="checkbox" class="btn-check" id="electricity_fee" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="electricity_fee">전기세</label>
          </div>

          <!-- 가스비 -->
          <div class="d-grid gap-2 col-2 mx-auto">
            <input type="checkbox" class="btn-check" id="gas_bill" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="gas_bill">가스</label>
          </div>

          <!-- 수도세 -->
          <div class="d-grid gap-2 col-2 mx-auto">
            <input type="checkbox" class="btn-check" id="water_tax" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="water_tax">수도</label>
          </div>

          <!-- 인터넷 -->
          <div class="d-grid gap-2 col-2 mx-auto">
            <input type="checkbox" class="btn-check" id="internet_cost" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="internet_cost">인터넷</label>
          </div>

          <!-- 티비세 -->
          <div class="d-grid gap-2 col-2 mx-auto">
            <input type="checkbox" class="btn-check" id="tv_cost" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="tv_cost">티비</label>
          </div>

        </div>

      </div>


      <!--   방구조   -->
      <div class="row" style="margin-top: 30px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">방구조</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <select class="form-select iptStyle" aria-label="Default select example">
            <option selected>방구조 선택</option>
            <option value="1">오픈형</option>
            <option value="2">분리형</option>
            <option value="3">복층형</option>
          </select>
        </div>
        <div class="d-grid gap-2 col-6 mx-auto">
        </div>
      </div>


      <!--   평수   -->
      <div class="row" style="margin-top: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">평수</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <input type="text" class="form-control">
        </div>
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="unit">면적&#40;m2&#41;</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto">
          <div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">
          </div>
        </div>
      </div>


      <!--   층수   -->
      <div class="row" style="margin-top: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">층수</span>
        </div>
        <div class="d-grid gap-2 col-2 mx-auto" style="line-height: 200%">
          <input type="text" class="form-control iptStyle" placeholder="현재층">
        </div>
        <div class="d-grid gap-2 col-2 mx-auto">
          <input type="text" class="form-control iptStyle" placeholder="전체층">
        </div>
        <div class="d-grid gap-2 col-6 mx-auto">
        </div>
      </div>


      <!--   방향   -->
      <div class="row" style="margin-top: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">방구조</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <select class="form-select iptStyle" aria-label="Default select example">
            <option selected>집 방향 선택</option>
            <option value="1">북향</option>
            <option value="2">동향</option>
            <option value="3">서향</option>
            <option value="4">남향</option>
          </select>
        </div>
        <div class="d-grid gap-2 col-6 mx-auto">
        </div>
      </div>


      <!--   입주 가능일   -->
      <div class="row" style="margin-top: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header">입주가능일</span>
        </div>
        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <input type="text" class="form-control">
        </div>
        <div class="d-grid gap-2 col-6 mx-auto">
        </div>
      </div>


      <!-- 주차가능 여부 -->
      <div class="row" style="margin-top: 20px; margin-bottom: 15px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header" style="font-size: 0.9rem">주차 가능 여부</span>
        </div>

        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <div class="btn-group" role="parking_check">
            <input type="radio" class="btn-check" name="parking_check" id="parking_check_true" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="parking_check_true">가능</label>

            <input type="radio" class="btn-check" name="parking_check" id="parking_check_false" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="parking_check_false">불가능</label>
          </div>
        </div>

        <div class="d-grid gap-2 col-6 mx-auto">
        </div>
      </div>


      <!-- 엘리베이터 유무 -->
      <div class="row" style="margin-bottom: 15px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header" style="font-size: 0.9rem">엘리베이터</span>
        </div>

        <div class="d-grid gap-2 col-4 mx-auto" style="line-height: 200%">
          <div class="btn-group" role="elevator">
            <input type="radio" class="btn-check" name="elevator" id="elevator_check_true" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="elevator_check_true">있음</label>

            <input type="radio" class="btn-check" name="elevator" id="elevator_check_false" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="elevator_check_false">없음</label>
          </div>
        </div>

        <div class="d-grid gap-2 col-6 mx-auto">
        </div>
      </div>


      <!-- 전세 대출 유무 -->
      <div class="row" style="margin-bottom: 30px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header" style="font-size: 0.9rem">전세 대출</span>
        </div>

        <div class="d-grid gap-2 col-6 mx-auto" style="line-height: 200%">
          <div class="btn-group" role="charter_loan">
            <input type="radio" class="btn-check" name="charter_loan" id="charter_loan_true" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="charter_loan_true">가능</label>

            <input type="radio" class="btn-check" name="charter_loan" id="charter_loan_false" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="charter_loan_false">불가능</label>

            <input type="radio" class="btn-check" name="charter_loan" id="charter_loan_need" autocomplete="off">
            <label class="btn btn-outline-primary option_List" for="charter_loan_need">확인필요</label>
          </div>
        </div>

        <div class="d-grid gap-2 col-4 mx-auto">
        </div>
      </div>



      <!--   옵션의 정보   -->
      <span class="header" style="margin-left: 20px;">옵션 정보</span>
      <div class="row justify-content-start option_info">


        <!-- 에어컨 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="air_conditioner" autocomplete="off" value="air_conditioner">
            <label class="btn btn-outline-primary option_List" for="air_conditioner">에어컨</label>
          </div>
        </div>

        <!-- 냉장고 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="refrigerator" autocomplete="off" value="refrigerator">
            <label class="btn btn-outline-primary option_List" for="refrigerator">냉장고</label>
          </div>
        </div>

        <!-- 세탁기 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="washer" autocomplete="off" value="washer">
            <label class="btn btn-outline-primary option_List" for="washer">세탁기</label>
          </div>
        </div>

        <!-- 가스레인지 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="gas_range" autocomplete="off" value="gas_range">
            <label class="btn btn-outline-primary option_List" for="gas_range">가스레인지</label>
          </div>
        </div>

        <!-- 인덕션 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="induction" autocomplete="off" value="induction">
            <label class="btn btn-outline-primary option_List" for="induction">인덕션</label>
          </div>
        </div>

        <!-- 전자레인지 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="microwave" autocomplete="off" value="microwave">
            <label class="btn btn-outline-primary option_List" for="microwave">전자레인지</label>
          </div>
        </div>

        <!-- 책상 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="desk" autocomplete="off" value="desk">
            <label class="btn btn-outline-primary option_List" for="desk">책상</label>
          </div>
        </div>

        <!-- 책장 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="bookcase" autocomplete="off" value="">
            <label class="btn btn-outline-primary option_List" for="bookcase">책장</label>
          </div>
        </div>

        <!-- 침대 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="bed" autocomplete="off" value="bed">
            <label class="btn btn-outline-primary option_List" for="bed">침대</label>
          </div>
        </div>

        <!-- 옷장 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="closet" autocomplete="off" value="closet">
            <label class="btn btn-outline-primary option_List" for="closet">옷장</label>
          </div>
        </div>

        <!-- 신발장 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="shoe_rack" autocomplete="off" value="shoe_rack">
            <label class="btn btn-outline-primary option_List" for="shoe_rack">신발장</label>
          </div>
        </div>

        <!-- 싱크대 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="the_sink" autocomplete="off" value="the_sink">
            <label class="btn btn-outline-primary option_List" for="the_sink">싱크대</label>
          </div>
        </div>

        <!-- 테스트옵션 -->
        <div class="d-grid col-3 optionStyle">
          <div class="btn-group" role="options">
            <input type="checkbox" class="btn-check" id="test_option" autocomplete="off" value="">
            <label class="btn btn-outline-primary option_List" for="test_option">테스트옵션</label>
          </div>
        </div>

      </div>
      <!--   옵션의 정보 끝   -->



      <!--   매물의 설명 제목   -->
      <div class="row" style="margin-top: 50px; margin-bottom: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header" style="font-size: 1rem">제목</span>
        </div>
        <div class="d-grid gap-2 col-9 mx-auto" style="line-height: 200%">
          <input type="text" class="form-control" placeholder="제목을 입력해 주세요.">
        </div>
        <div class="d-grid gap-2 col-1 mx-auto">
        </div>
      </div>


      <!--   매물의 설명 내용   -->
      <div class="row" style="margin-top: 20px; margin-bottom: 10px">
        <div class="d-grid gap-2 col-2 mx-auto">
          <span class="header" style="font-size: 1rem">매물 설명</span>
        </div>
        <div class="d-grid gap-2 col-9 mx-auto" style="line-height: 200%; height: 300px; margin-bottom: 50px;">
          <textarea class="form-control" rows="3" placeholder="내용을 입력해 주세요."></textarea>
        </div>
        <div class="d-grid gap-2 col-1 mx-auto">
        </div>
      </div>
<!--   상세 정보 입력 끝   -->

      <div class="row" style="margin-bottom: 10px;">
        <div class="d-grid gap-2 col-2 mx-auto"></div>
        <div class="d-grid gap-2 col-4 mx-auto">
          <button class="btn btn-info" style="color: white; font-weight: bold">홈으로</button>
        </div>
        <div class="d-grid gap-2 col-5 mx-auto">
          <button class="btn btn-info postBtn">등록하기</button>
        </div>
        <div class="d-grid gap-2 col-1 mx-auto"></div>
      </div>
    </div><!-- container end -->




  </div>
</template>

<script>
export default {
  name: "RegistrationBox"
}
</script>

<style scoped>
  input::placeholder, textarea::placeholder {
    font-size: 0.8rem;
    color: #777777;
  }

  select aria-label {
    font-size: 0.8rem;
    color: #777777;
  }

  textarea {
    resize: none;
  }

  .container {
    width: 700px;
    margin-top: 30px;
    margin-bottom: 60px;
    border: 1px solid #9F9F9F;
    border-radius: 15px;
  }

  /* 메인 이미지 */
  .mainImg {
    width: 100%;
    margin-top: 10px;
    border-radius: 3%;
  }

  /* 폼 마다의 여백 */
  .space {
    margin-top: 20px;
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
    font-size: 0.9rem;
    line-height: 250%;
  }

  /* 단위 스타일 (ex: 만원) */
  .unit {
    text-align: left;
    font-size: 0.9rem;
    line-height: 250%;
  }

  /* 추가 설명 스타일 */
  .addExplanation {
    text-align: left;
    line-height:250%;
    font-size: 12px;
    color: palevioletred;
  }

  /* input 스타일 */
  .iptStyle {
    font-size: 0.8rem;
    color: #777777;
  }

  /* 체크박스 라벨 스타일 */
  .option_List {
    font-size: 0.8rem;
  }

  /* 옵션 정보 틀 */
  .option_info  {
    margin: 0 auto;
    padding-top: 10px;
    width: 650px;
    height: 100%;
    border-top: 1px solid #224CE6;
    border-bottom: 1px solid #224CE6;
  }
  /* 이미지 박스 */
  .imgLabel{
    text-align: left;
    padding-left: 5px;
  }

  /* 체크박스(옵션) 스타일 */
  .optionStyle {
    line-height: 200%;
    margin-bottom: 10px;
  }

  /* 등록 버튼 스타일 */
  .postBtn {
    background: #224CE6;
    color: white;
    font-weight: bold;
    border: 1px solid #224CE6;
  }

  .imgLabel > label {
    font-size: 14px;
    font-weight: 600;
    color: #333333;
  }

  .imgBox{
    padding: 0;
    height: 12vh;
    border-radius: 5%;
    overflow: hidden;
    box-shadow: 0 4px 5px rgba(0, 0, 0, 0.3);
  }

  .imgBox > img {
    width: 100%;
    height: 100%;
  }

  .imgBox > label {
    text-align: center;
    line-height: 12vh;
    font-size: 14px;
  }

  .imgBox > input {
    display:none;
  }


</style>