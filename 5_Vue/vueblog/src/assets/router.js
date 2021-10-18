import { createWebHashHistory, createRouter } from "vue-router";
import List from '../components/List.vue'
const routes = [{
        path: "/list",
        component: List,
    },
    //path: "/경로",
    //component:import 해온 컴포넌트,
];

const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

export default router;