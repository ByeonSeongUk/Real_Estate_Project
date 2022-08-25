import Vue from 'vue'
import App from './App.vue'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import router from './router/index.js'   // router
import { store } from './store/store.js' // vuex
import axios from 'axios';

Vue.config.productionTip = false;

Vue.prototype.$axios = axios // axios

new Vue({
  router: router,
  store: store,
  render: h => h(App)
}).$mount('#app')
