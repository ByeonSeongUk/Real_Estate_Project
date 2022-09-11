// Vuex 설정 파일
import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";
import router from "../router";
import ELEST from '../assets/dummy-data/Real_estate';

Vue.use(Vuex);

export const store = new Vuex.Store({

    // strict 모드 false
    strict: process.env.NODE_ENV !== 'production',

    // strict 모드 true
    // strict: true;

    // Data
    state: {
        // Dummy
        ELEST: [...ELEST],

        // Data
        loginCheck: false, // 로그인 체크
        wishList: true, // 위시리스트
        searchAdr: '', // 검색한 주소
        deposit: 0, // 보증금
        monthlyRent: 0, // 월세
        contract: '', // 계약 방법(전체, 전세, 월세)
        structure: '', // 방구조
        authEmail: '' // 인증용 이메일,
        , // 사용자
        member:[
            {
                email: ''
              , mmbrPw: ''
            }
        ]
        ,// 사용자 로그인시
        loginMember:[
            {
                email: ''
              , mmbrPw: ''
            }
        ]
        ,
        // 매물 목록
        rlestList:[]
        ,
        // 클릭한 매물의 리스트 번호
        clickRlestNumber: 11211212
        ,
        // 매물 목록
        rlestDetail:[]
        ,





        //////////////////////////////// Test ///////////////////////////////
        currentIndex: 0,
        oneroomsImgs: [
            {title:'대표사진', url: require('../assets/images/oneroomImg1.png')},
            {title:'화장실',  url: require('../assets/images/oneroomImg2.png')},
            {title:'주방',    url: require('../assets/images/oneroomImg3.png')},
            {title:'방사진1', url: require('../assets/images/oneroomImg4.png')},
            {title:'방사진2', url: require('../assets/images/oneroomImg5.png')},
            {title:'방사진3', url: require('../assets/images/oneroomImg6.png')},
            {title:'방사진4', url: require('../assets/images/oneroomImg7.png')},
            {title:'방사진5', url: require('../assets/images/oneroomImg8.png')},
            {title:'방사진6', url: require('../assets/images/oneroomImg9.png')},
            {title:'방사진7', url: require('../assets/images/oneroomImg10.png')},
        ]
        ////////////////////////////////////////////////////////////////////
    },

    // Getters
    getters: {

        // 로그인 체크
        getLoginCheck: (state) => {
            return state.loginCheck;
        }
        ,
        // 위시리스트
        getWishList: (state) => {
            return state.wishList;
        }
        ,
        // 검색한 단어(주소)
        getSearchAdr: (state) => {
            return state.searchAdr;
        }
        ,
        // 보증금
        getDeposit: (state) => {
            return state.deposit;
        }
        ,
        // 월세
        getMonthlyRent: (state) => {
            return state.monthlyRent;
        }
        ,
        // 계약 방법(전체, 전세, 월세)
        getContract: (state) => {
            return state.contract;
        }
        ,
        // 방구조
        getStructure: (state) => {
            return state.structure;
        }
        ,
        // 이미지의 현재 번호
        getCurrentIndex: (state) => {
            return state.currentIndex;
        }
        ,
        // 이미지 슬라이더 출력값
        getCurrentImg: (state) => {
            return state.oneroomsImgs[Math.abs(state.currentIndex) % state.oneroomsImgs.length].url;
        }
        ,
        getAuthEmail: (state) => {
            return state.authEmail;
        }
        ,
        getMember: (state) => {
            return state.member;
        }
        ,
        // 불러온 매물 리스트
        getRlestListAll: (state) => {
            console.log(state.rlestList)
            return state.rlestList;
        }
        ,
        // 클릭한 매물의 매물번호
        getClickRlestNumber: (state) => {
            console.log(state.clickRlestNumber);
            return state.clickRlestNumber;
        }
        ,
        // 매물 상세 불러오기
        getRlestDetail: (state) => {
            console.log(state.rlestDetail);
            return state.rlestDetail;
        }

    }
    ,

    // Setters
    mutations: {
        // 검색한 단어(주소)
        setSearchAdr: (state, searchAdr) => {
            state.searchAdr = searchAdr;
        }
        ,
        // 검색 단위 전월세 선택
        setDeposit: (state, deposit) => {
            state.deposit = deposit;
        }
        ,
        // 검색 단위 전월세 선택
        setMonthlyRent: (state, monthlyRent) => {
            state.monthlyRent = monthlyRent;
        }
        ,
        // 검색 단위 전월세 선택
        setContract: (state, contract) => {
            state.contract = contract;
        }
        ,
        // 검색 단위 방구조 선택
        setStructure: (state, structure) => {
            state.structure = structure;
        }
        ,
        // 이미지 슬라이더(모달창) 이전 이미지
        setPrevImg: (state) => {
            state.currentIndex -= 1;
        }
        ,
        // 이미지 슬라이더(모달창) 다음 이미지
        setNextImg: (state) => {
            state.currentIndex += 1;
        }
        ,
        // 인증용 이메일
        setAuthEmail: (state, email) => {
            state.authEmail = email;
        }
        ,
        // 회원가입시 이메일
        setJoinEmail: (state, email) => {
            state.member.email = email;
            console.log(state.member.email);
        }
        ,
        // 회원가입시 비밀번호
        setJoinPassword: (state, password) => {
            state.member.mmbrPw = password;
            console.log(state.member.mmbrPw);
        }
        ,
        // 로그인시 아이디(이메일)
        setLoginEmail: (state, email) => {
            state.loginMember.email = email;
            console.log(state.loginMember.email);
        }
        ,
        // 로그인시 비밀번호
        setLoginPassword: (state, password) => {
            state.loginMember.mmbrPw = password;
            console.log(state.loginMember.mmbrPw);
        }
        ,
        // DB에서 불러온 매물 리스트 저장
        setRlestList: (state, rlestList) => {
            state.rlestList = rlestList;
        }
        ,
        // 클릭한 매물의 매물 번호
        setClickRlestNumber: (state, clickRlestNumber) => {
            console.log(clickRlestNumber);
            state.clickRlestNumber = clickRlestNumber;
        }
        ,
        // 매물 상세 불러오기
        setRlestDetail: (state, rlestDetail) => {
            console.log(rlestDetail);
            state.rlestDetail = rlestDetail;
        }


    }
    ,

    // Async
    actions: {
        // 회원가입 요청
        joinAction: ({commit, state}) => {

            // 정규식
            const PWD_CHECK = /^(?=.*[a-zA-Z])((?=.*\d)(?=.*\W)).{8,16}$/
            // const reg = /^[0-9]+/g; // 숫자만 입력

            const params = new URLSearchParams();


            // 비밀번호 유효성 검사
            if(PWD_CHECK.test(state.member.mmbrPw)) {

                params.append('email', state.member.email);
                params.append('mmbrPw', state.member.mmbrPw);

                axios.post('/join', params)
                    .then(res => {
                        commit(res.data)
                        router.push({name: 'home'})
                    })
                    .catch((err) => {
                        console.log(err);
                    });
            }
            else{
                alert('비밀번호 다시 입력!');
            }

        }
        ,
        // 로그인 요청
        logoutAction: ({commit, state}) => {

            axios.post('/logout')
                 .then(res => {

                    commit(res.data)
                    state.loginCheck = false;
                    router.push({name: 'home'})

                 })
                 .catch((err) => {
                    console.log(err);
                 });
        }
        ,
        // 로그인 요청
        loginAction: ({commit, state}) => {

            const params = new URLSearchParams();

            params.append('email', state.loginMember.email);
            params.append('mmbrPw', state.loginMember.mmbrPw);


            axios.post('/login', params)
                .then(res => {

                    let check = true;
                    console.log("axios : " + check);
                    if(check) {
                        commit(res.data)
                        state.loginCheck = true;
                        router.push({name: 'home'})
                    }
                    else{
                        alert('회원정보 불일치!');
                    }
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 전체 매물 불러오기
        getRlestList: ({commit}) => {

            axios.get('rlest/getRlestList')
                .then(res  => {
                    console.log('axios : ' + res.data)
                    commit('setRlestList', res.data)

                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 선택 매물 불러오기(매물 상세)
        rlestDetail: ({commit, state}) => {

            // post 으로 form 전송 방식
            // const params = new URLSearchParams();
            // params.append('rlestNum', state.clickRlestNumber);

            // get 으로 Params 넘길때 하는 방법!
            axios.get('rlest/getRlestDetail',{
                    params: {
                        rlestNum: state.clickRlestNumber
                    }
                 })
                 .then(res  => {
                    console.log('axios : ' + res.data)
                    commit('setRlestDetail', res.data)
                    router.push({name: 'detail'})
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 선택 매물 불러오기(매물 상세)
        searchRlestList: ({commit, state}) => {

            // post 으로 form 전송 방식
            // const params = new URLSearchParams();
            // params.append('rlestNum', state.clickRlestNumber);

            // get 으로 Params 넘길때 하는 방법!
            axios.get('rlest/searchRlestList',{
                params: {
                    rlestAdr: state.searchAdr,
                    deposit: state.deposit,
                    monthlyRent: state.monthlyRent,
                    rlestSort: state.contract,
                    structure: state.structure
                }
            })
                .then(res  => {
                    console.log('axios : ' + res.data)
                    commit('setRlestList', res.data)
                    router.push({name: 'home'})
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
    }


})