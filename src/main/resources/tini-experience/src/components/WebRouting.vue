<script>
import { createWebHistory, createRouter } from "vue-router";
import FestivalViewVue from "./routeComponents/FestivalView.vue";
import HomeViewVue from './routeComponents/HomeView.vue';
import LivestreamViewVue from "./routeComponents/LivestreamView.vue";
import MusikViewVue from "./routeComponents/MusikView.vue";
import SonstigesViewVue from "./routeComponents/SonstigesView.vue";
import VideosViewVue from "./routeComponents/VideosView.vue";

// Define some routes

const routes = [
    {
        path: '/', 
        name: "Home",
        component: HomeViewVue
    },
    {
        path: '/musik',
        name: "Musik", 
        component: MusikViewVue
    },
    {
        path: '/videos', 
        name: "Videos",
        component: VideosViewVue
    },
    {
        path: '/livestream',
        name: "Livestreams",
        component: LivestreamViewVue
    },
    {
        path: '/festival', 
        name: "Festival",
        component: FestivalViewVue},
    {
        path: '/sonstiges',
        name: "Sonstiges", 
        component: SonstigesViewVue}
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router;
</script>