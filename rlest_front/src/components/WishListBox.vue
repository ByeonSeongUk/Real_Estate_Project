<template>
  <div id="WishListBox">
    <div to="myListDetails" class="houseList" @click="wishListDetail">
      <WishList :getWishList="getWishList[i]" v-for="(wishList, i) in getWishList" :key="i" class="HouseList"/>
    </div>
  </div>
</template>

<script>
import { mapGetters } from "vuex";
import WishList from "@/components/WishList";

export default {
  name: "WishListBox",

  computed:
    mapGetters({
      getWishList: 'getWishList'
    }),

  components: {
    WishList
  }
  ,

  methods: {
    getWishList() {
      this.$store.dispatch('getRlestList')

    }
    ,
    getWishListDetails() {
      this.$store.dispatch('rlestDetail')
    }
    ,
    wishListDetail() {
      this.$store.dispatch('wishListDetail')
    }
    ,
    // 무한스크롤 정의
    handleNotificationListScroll : function() {
      console.log("작동체크")
      const {scrollHeight, scrollTop, clientHeight} = this.$refs.scrollTarget//e.target;//
      const isAtTheBottom = scrollHeight === scrollTop + clientHeight;
      console.log(scrollHeight, scrollTop, clientHeight, isAtTheBottom)
      // 일정 한도 밑으로 내려오면 함수 실행
      if (isAtTheBottom) this.getData();
    }
  }

  ,
  action: {
    getWishList() {
      this.$store.dispatch('getRlestList')

    }
    ,
    getWishListDetails() {
      this.$store.dispatch('rlestDetail')
    }
    ,
    wishListDetail() {
      this.$store.dispatch('wishListDetail')
    }
  }
  ,
  mounted() {
    // 무한 스크롤
    window.addEventListener('scroll', this.handleNotificationListScroll)
  }

}
</script>

<style scoped>
a {
  text-decoration: none;
  color: #333333;
  display: block;
}

.houseList {
  box-shadow: 0 2px 3px 0 rgba(0, 0, 0, 0.1);
  border-top: 0.5px solid rgb(225, 225, 225);
  box-sizing: border-box;
}
</style>