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
    getMyWishList() {
      this.$store.dispatch('getMyWishList')
    }
    ,

  }


  ,
  action: {
    getMyWishList() {
      this.$store.dispatch('getMyWishList')
    }
    ,
  }
  ,

  mounted() {
    this.getMyWishList();
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