// Vuex 설정 파일
import Vue from "vue";
import Vuex from "vuex";
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
        wishList: 1, // 위시리스트
        deposit: 0, // 보증금
        monthlyRent: 0, // 월세
        contract: 'contractAll', // 계약 방법(전체, 전세, 월세)
        structure: 'structureAll', // 방구조
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
        //
    },

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
    },

    // Async
    actions: {

    }


})