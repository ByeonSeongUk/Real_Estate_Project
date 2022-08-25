<template>
  <div id="EmailModal">
    <div class="modal fade" id="emailModal" tabindex="-1" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">

          <!-- modal header -->
          <div class="modal-header">
            <h5 class="modal-title">이메일 인증</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>

          <!-- modal body -->
          <div class="modal-body">

            <!-- 이메일  -->
            <div class="d-grid gap-2 col-12 mx-auto formStyle">
              <label for="email" class="form-label">이메일</label>
              <div class="input-group mb-3">
                <input type="text" id="email" class="form-control" placeholder="Email">
                <button
                    class="btn btn-outline-primary"
                    type="button">인증번호 요청</button>
              </div>
            </div>

            <!-- 인증 번호  -->
            <div class="d-grid gap-2 col-12 mx-auto formStyle">
              <label for="email" class="form-label">인증번호</label>
              <div class="input-group mb-3">
                <input type="text" id="email" class="form-control" placeholder="Auth Number">
                <button
                    class="btn btn-outline-primary"
                    type="button">확인</button>

              </div>
              <span class="auth_check_message auth_success">인증완료</span>
              <span class="auth_check_message auth_fail">인증실패</span>
            </div>

          </div>

          <!-- modal footer -->
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
            <button
                type="button"
                class="btn btn-primary">완료</button><!-- 인증완료 테이블에 true 면 오픈되게끔 -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "EmailModal",

}
</script>

<style scoped>

.formStyle {
  margin-bottom: 10px;
}

.formStyle > label {
  margin-bottom: 3px;
}

.auth_check_message {
  margin-top: -20px;
  font-size: 0.8rem;
}

.auth_success {
  color: forestgreen;
}

.auth_fail {
  color: red;
}
</style>