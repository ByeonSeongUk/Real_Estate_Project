<template>
  <div id="WishListView">
    <ImgModal></ImgModal>


    <div v-if="getLoginCheck === 1" class="wishListBox">
      <h3 class="wish_header">내 위시리스트</h3>
      <div class="houseList">
        <div>
          <span>로그인 후 접근 가능!</span>
        </div>
      </div>
    </div>

    <div v-else-if="getWishList.length == 0" class="wishListBox">
      <h3 class="wish_header">내 위시리스트</h3>
      <div class="houseList">
        <div>
          <span>위시리스트가 없습니다.</span>
        </div>
      </div>
    </div>


    <div v-else class="wishListBox">
      <h3 class="wish_header">내 위시리스트</h3>
      <router-view></router-view>
    </div>


  </div>
</template>

<script>
import {mapGetters} from "vuex";
import ImgModal from "@/components/ImgModal";

export default {
  name: "WishListView",

  computed: mapGetters({
    getWishList: 'getWishList',
    getLoginCheck: 'getLoginCheck'
  }),

  components: {
    ImgModal
  }
  ,

  methods: {
    loginCheck() {
      this.$store.dispatch('loginCheck')
    }
    ,
    getMyWishList() {
      this.$store.dispatch('getMyWishList')
    }

  }

  ,
  action: {
    loginCheck() {
      this.$store.dispatch('loginCheck')
    }
    ,
    getMyWishList() {
      this.$store.dispatch('getMyWishList')
    }

  }
  ,

  mounted() {
    this.loginCheck();
    this.getMyWishList();
  }

}

</script>

<style scoped>
.wish_header {
  width: 100%;
  padding-left: 10px;
  font-size: 1.3rem;
  font-weight: bold;
}
.wishListBox {
  margin: 0 auto;
  padding-top: 50px;
  width: 50%;
}
.houseList > div {
  height: 200px;
  text-align: center;
  box-shadow: 0 2px 3px 0 rgba(0, 0, 0, 0.1);
}

.houseList > div > span {
  line-height: 200px;
  font-weight: 600;
}


</style>