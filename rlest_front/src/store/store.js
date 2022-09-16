// Vuex 설정 파일
import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";
import router from "../router";


Vue.use(Vuex);

export const store = new Vuex.Store({

    // strict 모드 false
    strict: process.env.NODE_ENV !== 'production',

    // strict 모드 true
    // strict: true;

    // Data
    state: {

        // Data
        loginCheck: 1, // 로그인 체크
        loginId: '', // 로그인 되어 있는 아이디
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
        clickRlestNumber: 0
        ,
        // 매물 상세
        rlestDetail:[]
        ,
        // 불러온 위시리스트
        wishList: []
        ,
        // 위시리스트 상세
        wishListDetail: []
        ,
        // 위시리스트 상태
        wishListState: ''
        ,
        // 해당 매물의 옵션
        aboutOptions: []
        ,
        // 상세페이지의 주소(지도에 표시할 주소)
        detailPointer: ''
        ,
        // 현재 페이지 번호
        currentPage: 1
        ,
        // 총 불러온 개수
        listCount: 0
        ,
        // 페이징 처리 섹션의 개수
        pagingSection: 0
        ,
        // 페이징 정보
        paging: []
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
        // 로그인된 아이디
        getLoginId: (state) => {
            return state.loginId;
        }
        ,
        // 로그인 체크
        getLoginCheck: (state) => {
            return state.loginCheck;
        }
        ,
        // 위시리스트 상태
        getWishListState: (state) => {
            return state.wishListState;
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
            return state.rlestList;
        }
        ,
        // 클릭한 매물의 매물번호
        getClickRlestNumber: (state) => {
            return state.clickRlestNumber;
        }
        ,
        // 매물 상세 불러오기
        getRlestDetail: (state) => {
            return state.rlestDetail;
        }
        ,
        // 사용자의 위시리스트 불러오기
        getWishList: (state) => {
            console.log(state.wishList);
            return state.wishList;
        }
        ,
        // 사용자의 위시리스트 상세
        getWishListDetail: (state) => {
            console.log(state.wishListDetail);
            return state.wishListDetail
        }
        ,
        // 해당매물의 옵션
        getAboutOptions: (state) => {
            console.log(state.aboutOptions);
            return state.aboutOptions;
        }
        ,
        // 지도 마커
        getDetailPointer: (state) => {
            console.log(state.detailPointer);
            return state.detailPointer;
        }
        ,
        // 보여질 게시물
        getCurrentPage: (state) => {
            return state.currentPage
        }
        ,
        // 페이징 정보
        getPaging: (state) => {
            return state.paging
        }
        ,


    }
    ,

    // Setters
    mutations: {
        // 위시리스트 상태 변경
        setWishListState: (state, wishListState) => {
            state.wishListState = wishListState;
        }
        ,
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
        }
        ,
        // 회원가입시 비밀번호
        setJoinPassword: (state, password) => {
            state.member.mmbrPw = password;
        }
        ,
        // 로그인시 아이디(이메일)
        setLoginEmail: (state, email) => {
            state.loginMember.email = email;
        }
        ,
        // 로그인시 비밀번호
        setLoginPassword: (state, password) => {
            state.loginMember.mmbrPw = password;
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
        ,
        // DB에서 불러온 위시 리스트 저장
        setWishList: (state, wishList) => {
            console.log(wishList);
            state.wishList = wishList;
        }
        ,
        // 클릭한 위시리스트 상세 불러오기
        setWishListDetail: (state, wishListDetail) => {
            console.log(wishListDetail);
            state.wishListDetail = wishListDetail;
        }
        ,
        // 해당 매물의 옵션
        setAboutOptions: (state, aboutOptions) => {
            console.log(aboutOptions);
            state.aboutOptions = aboutOptions;
        }
        ,
        // 지도 마커
        setDetailPointer: (state, detailPointer) => {
            console.log('store: ' + detailPointer);
            state.detailPointer = detailPointer;
            console.log(state.detailPointer)
        }
        ,
        // 불러온 총 페이지의 개수
        setListCount: (state, listCount) => {
            state.listCount = listCount;
        }
        ,
        // 페이징 정보
        setPaging: (state, paging) => {
            state.paging = paging;
        }
        ,
        // 현재 페이지 번호 (Vue에서 받아오는 값)
        setCurrentPage: (state, currentPage) => {
            state.currentPage = currentPage;
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
        // 로그아웃 요청
        logoutAction: ({commit, state}) => {

            axios.post('/logout')
                 .then(res => {

                    commit(res.data)
                    state.loginCheck = 1;
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

                    commit(res.data)
                    state.loginCheck = 0;
                    let splitStr = res.data.split('@');

                    console.log(splitStr);
                    state.loginId = splitStr[0]; // 로그인 된 아이디가 들어옴

                    router.push({name: 'home'})

                })
                .catch((err) => {
                    alert('회원정보 불일치!');
                    console.log(err);
                });
        }
        ,
        // 로그인 체크(mounted)
        loginCheck: ({state}) => {

            axios.post('/loginCheck')
                .then(res => {

                    if(res.data == 1) {
                        console.log("1");
                        state.loginCheck = res.data; // 로그인이 안되어 있으면 1이 들어옴
                    }
                    else {
                        console.log("0");
                        state.loginCheck = 0;
                        let splitStr = res.data.split('@');

                        console.log(splitStr);
                        state.loginId = splitStr[0]; // 로그인 된 아이디가 들어옴
                    }

                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 전체 매물 불러오기
        getRlestList: ({commit, state}) => {

            axios.get('rlest/getRlestList', {
                    params: {
                        page: state.currentPage
                    }
                })
                .then(res  => {
                    console.log(res)
                    commit('setRlestList', res.data.list)
                    commit('setPaging', res.data.paging)
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 선택 매물 불러오기(매물 상세)
        rlestDetail: ({commit, state}) => {

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
        // 조건 검색 매물 불러오기(매물 검색)
        searchRlestList: ({commit, state}) => {

            axios.get('rlest/searchRlestList',{
                params: {
                    rlestAdr: state.searchAdr,
                    deposit: state.deposit,
                    monthlyRent: state.monthlyRent,
                    rlestSort: state.contract,
                    structure: state.structure,
                    page: state.currentPage
                }
            })
                .then(res  => {
                    console.log(res)
                    commit('setRlestList', res.data.list)
                    commit('setPaging', res.data.paging)
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 위시리스트 추가, 삭제
        wishListCtrDel: ({commit, state}) => {

            const params = new URLSearchParams();
            params.append('rlestNum', state.clickRlestNumber);

            axios.post('rlest/wishListCtrDel',params)
                .then(res  => {
                    console.log('axios : ' + res.data)
                    if(res.data == 0) {
                        alert('로그인 후 진행해주세요!');
                        router.push({name: 'login'});
                    }
                    else if(res.data == 1) {
                        alert('위시리스트에 추가 완료!');
                        commit('setWishListState', 1);

                    }
                    else if(res.data == 2) {
                        alert('위시리스트에서 삭제 완료!');
                        commit('setWishListState', 0)
                    }
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 내 위시리스트에 있는지 확인
        wishListCheck: ({commit, state}) => {

            const params = new URLSearchParams();
            params.append('rlestNum', state.clickRlestNumber);
            console.log(params);

            axios.post('rlest/wishListCheck',params)
                .then(res  => {
                    console.log('axios wish: ' + res.data);
                    commit('setWishListState', res.data);
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 사용자의 위시리스트 불러오기
        getMyWishList: ({commit, state}) => {

            axios.get('../rlest/getWishList')
                 .then(res => {
                     if(res.data.length != 0) {
                         commit('setWishList', res.data)
                     }
                     else if (state.loginCheck == 1) {
                         alert('로그인 후 위시리스트 접근 가능!');
                         router.push({name: 'login'});
                     }
                     else if(res.data.length == 0) {
                         alert('위시리스트 없음!');
                     }
                 })
                 .catch((err) => {
                   console.log(err);
                 })
        }
        ,

        // 선택 매물 불러오기(매물 상세)
        wishListDetail: ({commit, state}) => {

            axios.get('../rlest/getRlestDetail',{
                params: {
                    rlestNum: state.clickRlestNumber
                }
            })
                .then(res  => {
                    console.log('axios : ' + res.data)
                    commit('setWishListDetail', res.data)
                    console.log(state.wishListDetail)
                    router.push({name: 'wlDetail'})
                })
                .catch((err) => {
                    console.log(err);
                });
        }
        ,
        // 상세페이지 옵션 정보 불러오기
        aboutOptions: ({commit, state}) => {
            console.log('test test tes t : ' + state.clickRlestNumber)
            axios.get('rlest/getAboutOptions', {
                params: {
                    rlestNum: state.clickRlestNumber
                }
            })
                .then(res => {
                    // let optionBox = new Array;
                    //
                    // for(let i = 0; i < res.data.length; i++) {
                    //     optionBox.push(res.data[i].optNum);
                    // }
                    // commit('setAboutOptions', optionBox);
                    commit('setAboutOptions', res.data);
                })
                .catch((err) => {
                    console.log(err)
                });
        }
    }


})