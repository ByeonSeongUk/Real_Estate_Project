<!-- 검색 컴포넌트 -->
<template>
    <div id="searchBox">

        <!-- 검색 칸 -->
        <div class="input-group mb-3 searchInput">
            <input @input="setSearchAdr" type="text" class="form-control input-style" placeholder="지역명 검색(OO구, OO동, 번지수)">
            <button @click="searchRlestList" class="btn btn-outline-secondary btn-style" type="button">
                <i class="fa-solid fa-magnifying-glass"></i>
            </button>
        </div>

        <!-- 선택 조건 검색 -->
        <div class="container">
            <div class="row">

                <div class="col">
                    <div class="dropdown" style="text-align: center">
                        <button v-if="getContract===''" class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                            전체
                        </button>
                        <button v-else-if="getContract==='전세'" class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                          전세
                        </button>
                        <button v-else-if="getContract==='월세'" class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                          월세
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                            <li>
                              <input @input="setContract" type="radio" class="btn-check" name="payment" id="contractAll" autocomplete="on" value="">
                              <label class="dropdown-item" for="contractAll">전체</label>
                            </li>
                            <li>
                              <input @input="setContract" type="radio" class="btn-check" name="payment" id="charter" autocomplete="off" value="전세">
                              <label class="dropdown-item" for="charter">전세</label>
                            </li>
                            <li>
                              <input @input="setContract" type="radio" class="btn-check" name="payment" id="monthlyRent" autocomplete="off" value="월세">
                              <label class="dropdown-item" for="monthlyRent">월세</label>
                            </li>
                        </ul>
                    </div>
                </div>

                <!-- 보증금, 월세 지정 -->
                <div class="col">
                  <div class="dropdown">
                    <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                      금액지정
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                      <!-- 보증금 지정 -->
                      <li>
                        <label for="customRange3" class="form-label labelStyle">보증금&#160;<br>&#160;{{numberToKorean(getDeposit)}}&#160;</label>
                        <input type="range" @input="setDeposit" class="form-range dropdown-item" min="0" max="500000000" step="50000000" id="customRange2">
                        <!-- <input type="range" @input="setDeposit" class="form-range dropdown-item" min="0" max="500000000" step="50000000" id="customRange2">-->
                      </li>

                      <!-- 월세 지정 -->
                      <li v-if="getContract==='charter'">
                        <label for="customRange3" class="form-label labelStyle">월세&#160;<br>&#160;0원</label>
                        <input type="range" @input="setMonthlyRent" class="form-range dropdown-item" min="0" max="0" id="disabledRange" value=0 disabled>
                      </li>
                      <li v-else>
                        <label for="customRange3" class="form-label labelStyle">월세&#160;<br>&#160;{{numberToKorean(getMonthlyRent)}}&#160;</label>
                        <input type="range" @input="setMonthlyRent" class="form-range dropdown-item" min="0" max="5000000" step="500000" id="customRange2">
                      </li>

                    </ul>
                  </div>
                </div>


                <!-- 방 구조 선택 -->
                <div class="col">
                    <div class="dropdown">
                        <button v-if="getStructure===''" class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                          방구조
                        </button>
                        <button v-else-if="getStructure==='오픈형'" class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                          오픈형
                        </button>
                        <button v-else-if="getStructure==='분리형'" class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                          분리형
                        </button>
                        <button v-else-if="getStructure==='복층형'" class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                          복층형
                        </button>

                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                          <li>
                            <input @input="setStructure" type="radio" class="btn-check" name="structure" id="structureAll" autocomplete="on" value="">
                            <label class="dropdown-item" for="structureAll">전체</label>
                          </li>
                          <li>
                            <input @input="setStructure" type="radio" class="btn-check" name="structure" id="open" autocomplete="on" value="오픈형">
                            <label class="dropdown-item" for="open">오픈형</label>
                          </li>
                          <li>
                            <input @input="setStructure" type="radio" class="btn-check" name="structure" id="detachable" autocomplete="on" value="분리형">
                            <label class="dropdown-item" for="detachable">분리형</label>
                          </li>
                          <li>
                            <input @input="setStructure" type="radio" class="btn-check" name="structure" id="duplex" autocomplete="on" value="복층형">
                            <label class="dropdown-item" for="duplex">복층형</label>
                          </li>
                        </ul>
                    </div>
                </div>

                
            </div>
        </div>

    </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {

    computed:{
        ...mapGetters({
            getDeposit: 'getDeposit',
            getMonthlyRent: 'getMonthlyRent',
            getContract: 'getContract',
            getStructure: 'getStructure',
            getCurrentPage: 'getCurrentPage'
        })
    }
    ,

    methods: {
      setSearchAdr(e) {
        this.$store.commit('setSearchAdr', e.target.value);
      }
      ,
      setDeposit(e) {
        this.$store.commit('setDeposit',e.target.value);
      }
      ,
      setMonthlyRent(e) {
        this.$store.commit('setMonthlyRent', e.target.value);
      }
      ,
      setContract(e) {
        this.$store.commit('setContract', e.target.value)
      }
      ,
      setStructure(e) {
        this.$store.commit('setStructure', e.target.value)
      }
      ,
      searchRlestList() {
        this.$store.dispatch('searchRlestList')
      }
      ,
      // 받아온 금액을 한글로 변환
      numberToKorean(number){
        let inputNumber  = number < 0 ? false : number;
        let unitWords    = ['', '만원', '억', '조', '경'];
        let splitUnit    = 10000;
        let splitCount   = unitWords.length;
        let resultArray  = [];
        let resultString = '';

        for (let i = 0; i < splitCount; i++){
          let unitResult = (inputNumber % Math.pow(splitUnit, i + 1)) / Math.pow(splitUnit, i);
          unitResult = Math.floor(unitResult);
          if (unitResult > 0){
            resultArray[i] = unitResult;
          }
        }

        for (let i = 0; i < resultArray.length; i++){
          if(!resultArray[i]) continue;
          resultString = String(resultArray[i]) + unitWords[i] + resultString;
        }

        return resultString;
      }

    }
    ,
    action: {
      searchRlestList() {
        this.$store.dispatch('searchRlestList')
      }
    }
    ,

    mounted() {
      this.searchRlestList();
    }
    ,
    // 페이징 처리 번호를 받아옴
    watch: {
      getCurrentPage: function() {
        console.log('watcher')
        this.searchRlestList();
      }
    }

}
</script>

<style scoped>
#searchBox{
    position: fixed;
    top: 110px;
    left: 30px;
    width: 360px;
    height: 100px;
    background: white;
    box-shadow: 0 5px 18px -7px rgba(0,0,0,1);
    border-radius: 5px;
    z-index: 2;
}

i {
    color: white;
}

.btn-style {
    border: 0.5px solid #224CE6;
    box-sizing: border-box;
    background: #224CE6;
}

.input-style {
    border: 0.5px solid #224CE6;
    box-sizing: border-box;
    
}

.labelStyle{
  padding: 15px 0 0 10px;
}

</style>