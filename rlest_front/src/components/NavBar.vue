<!-- 네비게이션 바 -->
<template>
    <div id="nav">
        <!-- 로고 버튼 -->
        <div id="logo">
            <a href="/">
                <img src="../assets/images/logoImg.png" id="logoImg" alt=""/>
            </a>
        </div>

        <!-- 메뉴 선택 -->
        <div>
            <ul id="navList">

                <!-- 메뉴 한칸 기준 -->
                <li>
                    <div class="dropdown">
                        <ul class="dropdown-toggle dropdown-remove-content" data-bs-toggle="dropdown" aria-expanded="false">
                            <li>원룸</li>
                            <li>전월세</li>        
                        </ul>
                
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                            <li><router-link class="dropdown-item dropdown-style" to="/">방 찾기</router-link></li>
                            <li><router-link class="dropdown-item dropdown-style" to="/myList">찜한 매물</router-link></li>
                            <li><router-link class="dropdown-item dropdown-style" to="/registration">방 내놓기&#40;전월세만&#41;</router-link></li>
                        </ul>
                    </div>
                </li>

            </ul>

            
        </div>


        <!-- 로그인 / 회원가입 버튼 -->
        <div class="form-group loginBtn">
            <!-- 로그인전 보이는 버튼 -->
            <router-link v-if="getLoginCheck == 1" to="/login" class="btn btn-outline-primary btnStyle">로그인 및 회원가입</router-link>

            <!-- 로그인시 보이는 버튼 -->
            <div v-if="getLoginCheck == 0" class="dropdown" aria-labelledby="dropdownMenuButton1">
              <button class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                {{ getLoginId }}
              </button>

              <ul class="dropdown-menu">
                <li>
                  <router-link to="/authCheck" class="dropdown-item dropdown-style">회원정보 수정</router-link>
                </li>
                <li>
                  <button @click="logoutAction" class="dropdown-item dropdown-style">로그아웃</button>
                </li>
              </ul>
            </div>



        </div>
    </div>
</template>

<script>
import { mapGetters } from 'vuex'

export default {
    name: "navBar",

    computed: mapGetters({
      getLoginCheck: 'getLoginCheck',
      getLoginId: 'getLoginId'
    })
    ,
    methods: {
      logoutAction() {
        this.$store.dispatch('logoutAction');
      }
      ,
      loginCheck() {
        this.$store.dispatch('loginCheck');
      }
    }
    ,
    action: {
      logoutAction() {
        this.$store.dispatch('logoutAction');

      }
      ,
      loginCheck() {
        this.$store.dispatch('loginCheck');
      }
    }
    ,
    mounted() {
        this.loginCheck();
    }


}
</script>

<style scoped>
#nav{
    width: 100%;
    height: 80px;
    margin-top: -20px;
    border-bottom: 0.5px solid RGB(225, 225, 225);
}

a {
    text-decoration: none;
    font-weight: 600;
}


ul, li {
    list-style: none;

}

#logo {
    text-align: center;
    float: left;
    width: 130px;
    height: 73px;
}

#logoImg {
  width: 80px;
  height: 73px;
  margin-top: 5px;
}

#navList > li {
    display: block;
    float: left;
    height: 50px;
    margin: 20px 20px 0 0;
    text-align: center;
}

#navList > li > div > ul > li:hover {
    cursor: pointer;
}

.loginBtn {
    float: right;
    line-height: 80px;
    margin-right: 50px;
}

/* 부트스트랩 수정 */
.dropdown-remove-content::after {
    content: none
}

.dropdown-remove-content > li:first-child {
    font-weight: bold;
    font-size: 18px
}

.dropdown-remove-content > li:last-child {
    font-size: 12px
}

.dropdown-style {
    font-size: 0.8rem;
    font-weight: 600;
    color: #333;
}
.dropdown-item {
  height: 50px;
  line-height: 48px;
}
</style>