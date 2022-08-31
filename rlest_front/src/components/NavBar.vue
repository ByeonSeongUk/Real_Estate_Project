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
                            <li><router-link class="dropdown-item dropdown-style" to="/wishlist">찜한 매물</router-link></li>
                            <li><router-link class="dropdown-item dropdown-style" to="/registration">방 내놓기&#40;전월세만&#41;</router-link></li>
                        </ul>
                    </div>
                </li>

            </ul>

            
        </div>


        <!-- 로그인 / 회원가입 버튼 -->
        <div class="form-group loginBtn">
            <router-link v-if="getLoginCheck == false" to="/login" class="btn btn-outline-primary btnStyle">로그인 및 회원가입</router-link>

            <button v-if="getLoginCheck == true" type="button" class="btn btn-outline-primary">회원명</button>
        </div>
    </div>
</template>

<script>
import { mapGetters } from 'vuex'

export default {
    name: "navBar",

    computed: mapGetters({
      getLoginCheck: 'getLoginCheck'
    }),


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
/*.btn-secondary { */
/*    background: #224CE6;*/
/*    border: 1px solid #224CE6;*/
/*}*/
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
    font-size: 12px;
    color: #333;
}
</style>