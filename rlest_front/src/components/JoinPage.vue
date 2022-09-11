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

<!--            <form method="post" action="/api/join">-->
<!--              &lt;!&ndash; 이메일  &ndash;&gt;-->
<!--              <div class="d-grid gap-2 col-3 mx-auto formStyle">-->
<!--                <label for="email" class="form-label">이메일</label>-->
<!--                <div class="input-group mb-3">-->
<!--                  <input type="text" id="email" class="form-control" name="email" :value="getAuthEmail" placeholder="Email">-->
<!--                  <button-->
<!--                      class="btn btn-outline-primary"-->
<!--                      type="button"-->
<!--                      data-bs-toggle="modal"-->
<!--                      data-bs-target="#emailModal">인증</button>-->
<!--                </div>-->
<!--              </div>-->


<!--              &lt;!&ndash; 비밀번호 입력 &ndash;&gt;-->
<!--              <div class="d-grid gap-2 col-3 mx-auto formStyle">-->
<!--                <label for="password" class="form-label">비밀번호</label>-->
<!--                <input type="password" id="password" class="form-control" name="mmbrPw" placeholder="Password">-->
<!--              </div>-->


<!--              &lt;!&ndash; 비밀번호 확인 &ndash;&gt;-->
<!--              <div class="d-grid gap-2 col-3 mx-auto formStyle">-->
<!--                <label for="password2" class="form-label">비밀번호 확인</label>-->
<!--                <input type="password" id="password2" class="form-control" placeholder="Password Check">-->
<!--              </div>-->


<!--              &lt;!&ndash; 이름 입력 &ndash;&gt;-->
<!--              <div class="d-grid gap-2 col-3 mx-auto formStyle">-->
<!--                <label for="name" class="form-label">이름</label>-->
<!--                <input type="text" id="name" class="form-control" name="mmbrName"  placeholder="Name">-->
<!--              </div>-->


<!--              &lt;!&ndash; 로그인 버튼 &ndash;&gt;-->
<!--              <div class="d-grid gap-2 col-3 mx-auto" style="margin-bottom: 100px">-->

<!--                <button class="btn btn-primary" type="submit" id="join" style="margin-top: 20px; background: #224CE6; border: 1px solid #224CE6; font-weight: 600">-->
<!--                  회원가입-->
<!--                </button>-->


<!--                <router-link to="/" id="joinBtn">-->
<!--                  홈으로-->
<!--                </router-link>-->

<!--              </div>-->
<!--            </form>-->


            <!-- 이메일  -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="email" class="form-label">이메일</label>
              <div class="input-group mb-3">
                <input type="text" @input="setJoinEmail" id="email" class="form-control" name="member.email" placeholder="Email">
                <button
                    class="btn btn-outline-primary"
                    type="button"
                    data-bs-toggle="modal"
                    data-bs-target="#emailModal">인증</button>
              </div>
            </div>


            <!-- 비밀번호 입력 -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="password" class="form-label">비밀번호</label>
              <input type="password" @input="setJoinPassword" id="password" class="form-control" name="member.mmbrPw" placeholder="Password">
            </div>


            <!-- 비밀번호 확인 -->
            <div class="d-grid gap-2 col-3 mx-auto formStyle">
              <label for="password2" class="form-label">비밀번호 확인</label>
              <input type="password" id="password2" class="form-control" placeholder="Password Check">
            </div>


<!--            &lt;!&ndash; 이름 입력 &ndash;&gt;-->
<!--            <div class="d-grid gap-2 col-3 mx-auto formStyle">-->
<!--              <label for="name" class="form-label">이름</label>-->
<!--              <input type="text" @input="setJoinName" id="name" class="form-control" name="member.mmbrName"  placeholder="Name">-->
<!--            </div>-->


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
    name: "JoinPage",
    computed: {
      ...mapGetters({
        getAuthEmail:"getAuthEmail",
        getJoinPassword:"getJoinPassword"
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
      setJoinName(e) {
        this.$store.commit('setJoinName', e.target.value);
      }
      ,
      // 비밀번호 유효성 검사
      PW_CHECK: (e) => {
        const PWD_CHECK = /^(?=.*[a-zA-Z])((?=.*\d)(?=.*\W)).{8,16}$/

        console.log(e);

        if(!PWD_CHECK.test(e)) {
          console.log('비밀번호 형식에 맞지 않습니다!')
          console.log("input : " + e);
          return false;
        }
        else {
          console.log('사용 가능한 비밀번호')
          console.log("input : " + e);
          return true;
        }
      }

      ,
      joinAction() {
        // let check = this.PW_CHECK(this.getJoinPassword);
        // console.log(check);

        this.$store.dispatch('joinAction')

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

</style>