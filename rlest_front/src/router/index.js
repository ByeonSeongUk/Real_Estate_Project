import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../views/LoginView.vue'
import Join from '../views/JoinView'
import Registration from '../views/RegistrationView'
import HouseBox from "@/components/HouseBox";
import HouseDetails from "@/components/HouseDetails";
import WishListBox from "@/components/WishListBox";
import WishListDetails from "@/components/WishListDetails";

Vue.use(VueRouter);

export default new VueRouter({
  mode: 'history', // 해쉬값 제거 방식
  routes : [
    {path: '/',  name:'home', redirect: '/main/HouseBox'},
    {path: '/main', redirect: '/main/HouseBox'},
    {path: '/wishlist', redirect: 'wishlist/myList'},
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
    {
      path: '/wishlist', component: () => import('../views/WishListView'),
      children: [
        {path: '/wishlist/myList', component: WishListBox},
        {path: '/wishlist/myListDetails', component: WishListDetails}
      ]
    }

  ]
})

