<!-- 로그인 페이지 컴포넌트 -->
<template>
    <div id="JoinPage">
        <div class="container">


            <!-- 상단부 -->
            <div class="row justify-content-md-center" style="margin-top: 50px">
                <div class="col"></div>
                <div class="col title">
                  <h4>회원가입</h4>
                </div>
                <div class="col"></div>
            </div>

            <!-- 이메일  -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="email" class="form-label">이메일</label>
              <div class="input-group mb-3">
                <input type="text" @input="setJoinEmail" id="email" class="form-control" name="member.email" placeholder="Email"  maxlength="50">

                    <!-- 이메일 인증 모달 -->
<!--                <button-->
<!--                    class="btn btn-outline-primary"-->
<!--                    type="button"-->
<!--                    data-bs-toggle="modal"-->
<!--                    data-bs-target="#emailModal">인증</button>-->

                <button @click = "doubleCheck" class="btn btn-outline-primary" type="button">중복확인</button>


              </div>
            </div>


            <!-- 비밀번호 입력 -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="password" class="form-label">비밀번호</label>
              <input type="password" @input="setJoinPassword" id="password" class="form-control" name="member.mmbrPw" placeholder="Password" maxlength="16">
              <p class="warningText" style="color: #224CE6">비밀번호 형식 : 8 ~ 16 자리, 영어, 숫자, 특수문자를 조합하여 사용</p>

              <p class="warningText" v-if ="PW_CHECK(getMember.mmbrPw) === true" style="color: darkseagreen">사용 가능한 비밀번호</p>
              <p class="warningText" v-else-if ="PW_CHECK(getMember.mmbrPw) === false" style="color: crimson">비밀번호 형식에 맞지 않습니다!</p>
            </div>


            <!-- 비밀번호 확인 -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="password2" class="form-label">비밀번호 확인</label>
              <input type="password" @input="setJoinPasswordCheck" id="password2" class="form-control" placeholder="Password Check" maxlength="16">

              <p class="warningText" v-if = "PW_COMPARE(getMember.mmbrPw , getMmbrPwCheck) === true" style="color: darkseagreen">비밀번호 일치!</p>
              <p class="warningText" v-else-if = "PW_COMPARE(getMember.mmbrPw , getMmbrPwCheck) === false" style="color: crimson">비밀번호 불일치!</p>
            </div>

            <!-- 로그인 버튼 -->
            <div class="d-grid gap-2 col-3 mx-auto" style="margin-bottom: 100px">

              <button @click="joinAction" class="btn btn-primary" type="button" id="join" style="margin-top: 20px; background: #224CE6; border: 1px solid #224CE6; font-weight: 600">
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

import { mapGetters } from "vuex";

export default {
    name: "JoinPage"
    ,
    data() {
      return {
        formCheck: false,
      }
    }
    ,
    computed: {
      ...mapGetters({
        getAuthEmail:"getAuthEmail",
        getMember:"getMember",
        getMmbrPwCheck: "getMmbrPwCheck",
        joinCheck: "joinCheck"
      }),

    }
    ,
    methods: {
      setJoinEmail(e) {
        this.$store.commit('setJoinEmail', e.target.value);
      }
      ,
      setJoinPassword(e) {
        this.$store.commit('setJoinPassword', e.target.value);
      }
      ,
      setJoinPasswordCheck(e) {
        this.$store.commit('setJoinPasswordCheck', e.target.value);
      }
      ,

      // 비밀번호 비교
      PW_COMPARE: (pw, pwC) => {
        if(pw === pwC) {
          return true;
        }
        else {
          return false;
        }
      }
      ,

      // 비밀번호 유효성 검사
      PW_CHECK: (e) => {
        const PWD_CHECK = /^(?=.*[a-zA-Z])((?=.*\d)(?=.*\W)).{8,16}$/

        console.log(e);

        if(!PWD_CHECK.test(e)) {
          return false;
        }
        else {
          return true;
        }
      }

      ,
      doubleCheck() {
        this.$store.dispatch('doubleCheck');
      }
      ,
      joinAction() {
          this.$store.dispatch('joinAction')

      }
    }
    ,
    action: {
      doubleCheck() {
        this.$store.dispatch('doubleCheck');
      }
      ,
      joinAction() {
        this.$store.dispatch('joinAction');
      }
    }


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

#warningText {
  font-size: 8px;
}

</style>