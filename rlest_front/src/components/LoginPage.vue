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
              <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="ID">
            </div>


            <!-- 비밀번호 입력 -->
            <div class="d-grid gap-2 col-3 mx-auto" style="margin-top: 10px">
              <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="Password">
            </div>


            <!-- 로그인 버튼 -->
            <div class="d-grid gap-2 col-3 mx-auto">

              <button class="btn btn-primary" type="button" style="margin-top: 20px; background: #224CE6; border: 1px solid #224CE6; font-weight: 600">
                로그인
              </button>

              <router-link to="/join" id="joinBtn">
                회원가입
              </router-link>

              <button @click="getMemberList()" class="btn btn-primary" type="button" style="margin-top: 20px; background: #224CE6; border: 1px solid #224CE6; font-weight: 600">
                axios
              </button>
              <span>
                {{connectData}}
              </span>
            </div>

        </div>

    </div>
</template>

<script>
export default {
    name: "LoginPage",
    data() {
      return {
        connectData: ""
      }
    }
    ,
    methods: {
      getMemberList() {
        this.$axios.get("localhost:8081/api/memberList").then((res) => {console.log(res)})
        console.log(this.connectData);
      }
    },
    mounted() {
      this.getMemberList();
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