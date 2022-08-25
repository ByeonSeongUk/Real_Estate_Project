import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../views/LoginView.vue'
import Join from '../views/JoinView'
import Registration from '../views/RegistrationView'
import HouseBox from "@/components/HouseBox";
import HouseDetails from "@/components/HouseDetails";


Vue.use(VueRouter);

export default new VueRouter({
  mode: 'history', // 해쉬값 제거 방식
  routes : [
    {path: '/', redirect: '/main/HouseBox'},
    {path: '/main', redirect: '/main/HouseBox'},
    {
      path: '/main', component: () => import('../views/MainView'),
      children: [
        {path: '/main/houseBox', component: HouseBox},
        {path: '/main/houseDetails', component: HouseDetails}
      ]
    },
    {path: '/login', component: Login},
    {path: '/join', component: Join},
    {path: '/registration', component: Registration},

  ]
})

