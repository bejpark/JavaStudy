import { createWebHashHistory, createRouter } from "vue-router";
import List from '../components/List.vue';
import Home from '../components/Home.vue';
import Detail from '../components/Detail.vue';
import Author from '../components/Author.vue';
import Comment from '../components/Comment.vue';
const routes = [{
        path: "/list",
        component: List,
        Home
    },
    {
        path: "/detail",
        component: Detail,
    },
    {
        //path:"/detail/:id(\\d+)", //정규식 표현도 가능, 숫자만
        //path:"/detail/:id/:id2/:id3",
        path: "/detail/:id",
        component: Detail,
        children: [{
                path: "author", //상대경로 
                component: Author
            },
            {
                path: "comment",
                component: Comment
            }
        ]
    },
    {
        path: "/:anything(.*)", //모든문자가 들어오면 (모든 문자라는 경규식임)
        component: Home,
    },

    //path: "/경로",
    //component:import 해온 컴포넌트,
];

const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

export default router;