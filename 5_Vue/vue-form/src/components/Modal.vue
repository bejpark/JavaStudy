<template>
    <div class="black-bg">
        <div class="white-bg">
            <h4>{{room.title}}</h4>
            <img class="img" :src="room.image">
            <p>{{room.content}}</p>
            <button v-on:click="onEmit()">닫기</button>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'Modal',
        props: {
            room: JSON
        },
        methods: {
            onEmit() {
                this.$emit("modalClose", false);
            }
        }
    }
</script>

<style scoped>
    .black-bg {
        width: 100%;
        height: 100%;
        background: rgba(0, 0, 0, 0.5);
        position: fixed;
        padding: 20px;
    }

    .white-bg {
        width: 100%;
        background: white;
        border-radius: 8px;
        padding: 20px;
    }
</style>