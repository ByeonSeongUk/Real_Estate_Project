import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '@/views/LoginView.vue'
import Join from '@/views/JoinView'
import Registration from '@/views/RegistrationView'
import ChangeInfo from "@/views/ChangeInfoView";
import AuthCheck from "@/views/AuthCheckView";
import HouseBox from "@/components/HouseBox";
import HouseDetails from "@/components/HouseDetails";
import WishListBox from "@/components/WishListBox";
import WishListDetails from "@/components/WishListDetails";

Vue.use(VueRouter);

export default new VueRouter({
  mode: 'history', // 해쉬값 제거 방식
  routes : [
    // redirect
    {path: '/',  name:'home', redirect: '/houseBox'},
    {path: '/main', redirect: '/houseBox'},
    {path: '/wishlist', redirect: 'wishlist/myList'},
    {path: '/detail', name:'detail', redirect: '/houseDetails'},
    {path: '/reLogin', name:'login', redirect: '/login'},
    {path: 'wlDetail', name:'wlDetail', redirect: '/myListDetails'},


    // View Import
    {path: '/login', component: Login},
    {path: '/join', component: Join},
    {path: '/registration', component: Registration},
    {path: '/changeInfo', component: ChangeInfo},
    {path: '/authCheck', component: AuthCheck},


    // Nested Router
    {
      path: '/', component: () => import('../views/MainView'),
      children: [
        {path: '/houseBox', component: HouseBox},
        {path: '/houseDetails', component: HouseDetails}
      ]
    },
    {
      path: '/wishlist', component: () => import('../views/WishListView'),
      children: [
        {path: '/myList', component: WishListBox},
        {path: '/myListDetails', component: WishListDetails}
      ]
    },

  ]
})

