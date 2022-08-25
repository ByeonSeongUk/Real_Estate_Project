<!-- 로그인 페이지 -->
<template>
    <div id="JoinPage">

        <!--  이메일 모달  -->

        <div class="container">


            <!-- 상단부 -->
            <div class="row justify-content-md-center" style="margin-top: 150px">
                <div class="col"></div>
                <div class="col title">
                  <h4>회원가입</h4>
                </div>
                <div class="col"></div>
            </div>


            <!-- 아이디 입력 -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="userId" class="form-label">아이디</label>
              <input type="text" id="userId" class="form-control" placeholder="ID">
            </div>


            <!-- 비밀번호 입력 -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="password" class="form-label">비밀번호</label>
              <input type="password" id="password" class="form-control" placeholder="Password">
            </div>


            <!-- 비밀번호 확인 -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="password2" class="form-label">비밀번호 확인</label>
              <input type="password" id="password2" class="form-control" placeholder="Password Check">
            </div>


            <!-- 이메일  -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="email" class="form-label">이메일</label>
              <div class="input-group mb-3">
                <input type="text" id="email" class="form-control" placeholder="Email" readonly>
                <button
                    class="btn btn-outline-primary"
                    type="button"
                    data-bs-toggle="modal"
                    data-bs-target="#emailModal">인증</button>
              </div>
            </div>


          <!-- 로그인 버튼 -->
            <div class="d-grid gap-2 col-3 mx-auto">

              <button class="btn btn-primary" type="button" style="margin-top: 20px; background: #224CE6; border: 1px solid #224CE6; font-weight: 600">
                회원가입
              </button>


              <router-link to="/" id="joinBtn">
                홈으로
              </router-link>

            </div>

        </div>

    </div>
</template>

<script>

export default {
    name: "JoinPage",

}
</script>

<style scoped>
/* 제목 (회원가입)*/
.title {
  text-align: center;
  vertical-align: middle;
  margin-bottom: 30px;
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

#joinBtn {
  text-align: right;
  color: #333;
  text-decoration: none;
}
#joinBtn:hover {
  text-decoration: cornflowerblue wavy underline;
}

</style>