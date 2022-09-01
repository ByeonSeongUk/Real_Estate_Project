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
        deposit: 0, // 보증금
        monthlyRent: 0, // 월세
        contract: 'contractAll', // 계약 방법(전체, 전세, 월세)
        structure: 'structureAll', // 방구조
        authEmail: '', // 인증용 이메일,
        member:[
            {
                email: '',
                mmbrPw: '',
                mmbrName: ''
            }
        ],
        loginMember:[
            {
                email: '',
                mmbrPw: '',
            }
        ],




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
        getELEST: (state) => {
            console.log('getter');
            console.log(state.ELEST.structure);
            console.log(state.ELEST)
            return state.ELEST;
        }
        ,
        /////////////////
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
        getJoinPassword: (state) => {
            return state.member.mmbrPw;
        }
        ,

    }
    ,

    // Setters
    mutations: {

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
        // 회원가입시 이름
        setJoinName: (state, name) => {
            state.member.mmbrName = name;
            console.log(state.member.mmbrName);
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
    }
    ,

    // Async
    actions: {
        // 회원가입 요청
        joinAction: ({commit, state}) => {

            // 정규식
            // const reg = /^[0-9]+/g; // 숫자만 입력
            const PWD_CHECK = /^(?=.*[a-zA-Z])((?=.*\d)(?=.*\W)).{8,16}$/

            const params = new URLSearchParams();


            // 비밀번호 유효성 검사
            if(PWD_CHECK.test(state.member.mmbrPw)) {

                params.append('email', state.member.email);
                params.append('mmbrPw', state.member.mmbrPw);
                params.append('mmbrName', state.member.mmbrName);

                axios.post('/api/join', params)
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
        loginAction: ({commit, state}) => {

            const params = new URLSearchParams();

            params.append('email', state.loginMember.email);
            params.append('mmbrPw', state.loginMember.mmbrPw);


            axios.post('/api/login', params)
                 .then(res => {
                     const PWD_CHECK = /^(?=.*[a-zA-Z])((?=.*\d)(?=.*\W)).{8,16}$/

                     let check = PWD_CHECK.test(res.data.mmbrPw);
                        console.log("axios : " + check);
                     if(check) {
                        commit(res.data)
                        router.push({name: 'home'})
                     }
                     else{
                         alert('비밀번호 다시 입력!');
                     }
                 })
                 .catch((err) => {
                    console.log(err);
                 });
        }
    }


})