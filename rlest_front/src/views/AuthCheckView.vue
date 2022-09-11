<template>
  <div id="ChangeInfoView">
    <div class="container">

      <!-- 상단부 -->
      <div class="row justify-content-md-center" style="margin-top: 50px">
        <div class="col"></div>
        <div class="col title">
          <h4>비밀번호 확인</h4>
        </div>
        <div class="col"></div>
      </div>


      <!-- 비밀번호 입력 -->
      <div class="d-grid gap-2 col-3 mx-auto formStyle">
        <label for="password" class="form-label">비밀번호 확인</label>
        <input type="password" id="password" class="form-control" name="member.mmbrPw" placeholder="Password Check">
      </div>

      <!-- 로그인 버튼 -->
      <div class="d-grid gap-2 col-3 mx-auto">

        <router-link to="/changeInfo" class="btn btn-primary" type="button" id="join" style="margin-top: 10px; background: #224CE6; border: 1px solid #224CE6; font-weight: 600">
          확인
        </router-link>

        <router-link to="/" id="homeBtn" >
          홈으로
        </router-link>

      </div>
    </div>

  </div>
</template>

<script>
export default {
  name: "ChangeInfoView",
  data() {
    return {}
  }

}
</script>

<style scoped>

/* 제목 (회원가입)*/
.title {
  text-align: center;
  vertical-align: middle;
  margin-bottom: 50px;
}

/* 제목 글자 스타일 */
.title > h4 {
  font-weight: 600;
  font-size: 1.7rem;
}

.formStyle {
  margin-bottom: 30px;
}

.formStyle > label {
  margin-bottom: 3px;
}

#homeBtn {
  text-align: right;
  color: #333;
  text-decoration: none;
}
#homeBtn:hover {
  text-decoration: cornflowerblue wavy underline;
}

</style>