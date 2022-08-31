<template>
  <div id="HouseBoxInfo">
    <div class="hb_list">
      <span>목록 OO 개</span>
    </div>
    <div class="hb_unit">
      <a href=""><img src="../assets/images/unitChangeBtn.png"></a>
    </div>
  </div>
</template>

<script>
export default {
  name: "HouseBoxInfo"
}
</script>

<style scoped>

#HouseBoxInfo {
  display: flex;
  width: 100%;
  height: 50px;
  border: 1px solid rgb(225, 225, 225);
  background: white;
}

.hb_list {
  padding-left: 10px;
  width: 80%;
  height: 100%;
  line-height: 50px;
  background: #FFFFFF;
}

.hb_list > span {
  font-weight: 600;
  margin-left: 10px;
}

.hb_unit {
  text-align: right;
  width: 20%;
  height: 100%;
  padding-right: 1%;
  line-height: 50px;
  /*text-align: center;*/
  background: #FFFFFF;
}
</style>