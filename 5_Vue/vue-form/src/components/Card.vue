<template>
    <div>
        <div v-for="(room, i) in rooms" :key="i">
            <img class="img" :src="room.image">
            <h4 v-on:click="showModal(i)">{{room.title}} 원룸</h4>
            <p>{{room.price}} 만원</p>
            <!-- <button v-on:click="increase(i)">허위매물신고</button> -->
            <button @click="countsUp(i)">허위매물신고</button>
            <span> 신고수 : {{counts[i]}}</span>
            <br><br>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'Card',
        props: {
            rooms: Array,
            counts:Array
        },
        methods: {
            increase(i) {
                this.rooms[i].counts += 1;                
            },
            showModal(i) {
                this.$emit("modalOpen", true, i);
            },
            countsUp(i) {
                this.$emit("countsUp", i)
            },
        }
    }
</script>

<style scoped>

</style>