<template>
  <div id="app">
    <div class="menu">
      <a v-for="menu in menus" :key="menu">{{menu}}</a>
    </div>

    <Discount></Discount>

    <h1 class="h1">Land World에 오신걸 환영합니다</h1>
    <img alt="Vue logo" src="./assets/logo.png">

    <Modal :room="rooms[roomNo]" @modalClose="modalClose" v-if="isModalOpen"></Modal>

    <Card :rooms="rooms" @countsUp="countsUp" :counts="this.counts" @modalOpen="modalOpen"></Card>
  </div>
</template>

<script>
  import data from './assets/roomdata.js';
  import Discount from './components/Discount.vue';
  import Modal from './components/Modal.vue';
  import Card from './components/Card.vue';

  export default {
    components: {
      Discount,
      Modal,
      Card
    },
    name: 'App',
    data() {
      return {
        rooms: data,
        menus: ['Home', 'Shop', 'Products', 'About'],
        isModalOpen: false,
        roomNo: 0,
        counts:[0,0,0,0,0,0]
      }
    },
    methods: {
      countsUp(num){
        this.$set(this.counts, num, this.counts[num] + 1);
      },
      modalClose(isModalOpen) {
        this.isModalOpen = isModalOpen;
      },
      modalOpen(isModalOpen, roomNo) {
        this.isModalOpen = isModalOpen;
        this.roomNo = roomNo;
      }
    }
  }
</script>

<style>
  body {
    margin: 0;
  }

  div {
    box-sizing: border-box;
  }

  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    text-align: center;
    color: #2c3e50;
  }

  .img {
    width: 250px;
    height: 250px;
    border: 1px solid blue;
  }

  .menu {
    background: darkslateblue;
    padding: 15px;
    border-radius: 5px;
  }

  .menu a {
    color: white;
    padding: 10px;
  }

  .h1 {
    color: blue;
    font-family: 맑은 고딕, 궁서체, 바탕체;
  }
</style>