//store.js
import { createStore } from 'vuex';

const store = createStore({
    state() { //데이너보관하는곳
        return {
            name: 'doyeon',
            age: '20',
            likes: [0, 0, 0],
            likess: 0,
            isLike: false,
        }
    },

    mutations: { //변경 원하는 것들 이곳에 적음
        namechange(state) {
            state.name = 'newname'
        },
        ageup(state) {
            state.age++;
        },
        liked(state, idx) {
            if (state.likes[idx] == 0) {
                state.likes[idx]++;
            } else {
                state.likes[idx]--;
            }
        },
        like(state) {
            if (state.isLike == false) {
                state.likess++;
                state.isLike = true;
            } else {
                state.likess--;
                state.isLike = false;
            }
        }


    }
})

export default store;