<!-- 로그인 페이지 -->
<template>
    <div id="LoginPage">

        <div class="container">

            <!-- 로고 -->
            <div class="row justify-content-md-center" style="margin-top: 150px">
                <div class="col"></div>
                <div class="col" style="text-align: center; vertical-align: middle;">
                    <router-link to="/">
                        <img src="../assets/images/logoImg.png" alt="logo" style="width: 50%; height: 100%;"/>
                    </router-link>
                </div>
                <div class="col"></div>
            </div>


            <!-- 아이디 입력 -->
            <div class="d-grid gap-2 col-3 mx-auto">
              <input @input="setLoginEmail" value="" type="text" name="loginMember.email" class="form-control" id="exampleFormControlInput1" placeholder="ID">
            </div>

            <!-- 비밀번호 입력 -->
            <div class="d-grid gap-2 col-3 mx-auto" style="margin-top: 10px">
              <input @input="setLoginPassword" value="" type="password" name="loginMember.mmbrPw" class="form-control" id="exampleFormControlInput1" placeholder="Password">
            </div>


            <!-- 로그인 버튼 -->
            <div class="d-grid gap-2 col-3 mx-auto">

              <button @click="loginAction" class="btn btn-primary" type="button" style="margin-top: 20px; background: #224CE6; border: 1px solid #224CE6; font-weight: 600">
                로그인
              </button>
              <router-link to="/join" id="joinBtn">
                회원가입
              </router-link>

            </div>

        </div>

    </div>
</template>

<script>
import {mapGetters} from "vuex";

export default {
    name: "LoginPage"
    ,
    computed: {
      ...mapGetters({
        getLoginMember: 'getLoginMember',
        getLoginEmail: 'getLoginEmail',
        getLoginPw: 'getLoginPw'
      })
    }
    ,

    methods: {
      setLoginEmail(e) {
        this.$store.commit('setLoginEmail', e.target.value);
      }
      ,
      setLoginPassword(e) {
        this.$store.commit('setLoginPassword', e.target.value);
      }
      ,
      loginAction() {
        this.$store.dispatch('loginAction');
      }
      ,
    }
    ,
    action: {
      loginAction() {
        this.$store.dispatch('loginAction')

      }
    }

}
</script>

<style scoped>
#joinBtn {
  text-align: right;
  color: #333;
  text-decoration: none;

}
#joinBtn:hover {
  text-decoration: cornflowerblue wavy underline;
}
</style>