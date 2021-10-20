<template>
  <div class="header">
    <ul class="header-button-left">
      <li>Cancel</li>
    </ul>
    <ul class="header-button-right">
      <li v-if="step == 1" @click="step++">Next</li>
      <li v-if="step == 2" @click="publish">Upload</li>
    </ul>
    <img src="./assets/logo.png" class="logo" />
  </div>

  <h4>방갑다 {{ $store.state.name }}</h4>
  <h3>나이 : {{ $store.state.age }}</h3>
  <button @click="$store.commit('namechange')">이름변경</button>
  <button @click="$store.commit('ageup')">나이증가</button>

  <!-- <button @click="$store.state.name='박병제'">이름변경</button> -->
  <!-- 기능은 되지만 이런식으로 하면안됨 -->


  <p>{{$store.state.more}}</p>
  <button @click="$store.dispatch('getMore')">store더보기</button>
  <p>{{nowMet()}}{{count}}</p>
  <p>{{nowCom}}{{count}}</p>
  <button @click="count++">날씨</button>
  <p>{{name}}</p>
  <p>{{gender}}</p>
  <Container
    @mywrite="mywrite = $event"
    :choicefilter="choicefilter"
    :postdata="postdata"
    :step="step"
    :myimage="myimage"
  />

  <button v-if="step == 0" @click="more">더보기</button>

  <!-- @이벤트명="mywrite= $event" -->
  <div class="footer">
    <ul class="footer-button-plus">
      <input
        @change="upload"
        multiplc
        accept="image/*"
        type="file"
        id="file"
        class="inputfile"
      />
      <label for="file" class="input-plus">+</label>
    </ul>
  </div>
  <!-- <div v-if="step == 0">content0</div>
  <div v-if="step == 1">content1</div>
  <div v-if="step == 2">content2</div>
  <button @click="step = 0">button0</button>
  <button @click="step = 1">button1</button>
  <button @click="step = 2">button2</button>
  <div style="margin-top:500px;"></div> -->
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import Container from "./components/Container";
import postdata from "./assets/postdata";
import axios from 'axios';
import {mapState} from 'vuex';

//const axios = require("axios");

export default {
  name: "App",
  data() {
    return {
      postdata: postdata,
      morecount: 0,
      step: 0,
      myimage: "",
      mywrite: "",
      choicefilter: "",
      count:0,
    };
  },
  components: {
    Container,
    //HelloWorld
  },
  mounted() {
    //filter에서 보낸 name에서 받아옴
    this.emitter.on("boxclick", (a) => {
      this.choicefilter = a;
    });
  },
  computed:{
    nowCom(){
      return new Date();
    },
    // name(){
    //   return this.$store.state.name
    // },
    ...mapState(['name','age','likes','gender']),
    ...mapState({namechange:'kim'})
    //...mapState({naming:'name'})
  },
  methods: {
    nowMet(){
      return new Date();
    },
    publish() {
      var myboard = {
        name: "Kim Hyun",
        userImage: "https://placeimg.com/100/100/arch",
        postImage: this.myimage,
        likes: 36,
        date: "May 15",
        liked: false,
        content: this.mywrite, //내가쓴글
        filter: this.choicefilter,
      };
      this.postdata.unshift(myboard);
      this.step = 0;
    },
    upload(e) {
      let file = e.target.files;
      //console.log(file[0]);
      this.step++;
      let url = URL.createObjectURL(file[0]);
      console.log(url);
      this.myimage = url;
    },
    more() {
      axios
        .get(
          `https://raw.githubusercontent.com/ai-edu-pro/busan/main/more${this.morecount}.json`
        )
        //.then(function(result){
        .then((result) => {
          this.morecount++;
          if (this.morecount > 1) {
            this.morecount = 0;
          }
          console.log(result.data);
          this.postdata.push(result.data);
          //정상처리되면 처리할 내용
        });
    },
  },
};
</script>

<style>
body {
  margin: 0;
}
ul {
  padding: 5px;
  list-style-type: none;
}
.logo {
  width: 22px;
  margin: auto;
  display: block;
  position: absolute;
  left: 0;
  right: 0;
  top: 13px;
}
.header {
  width: 100%;
  height: 40px;
  background-color: white;
  padding-bottom: 8px;
  position: sticky;
  top: 0;
}
.header-button-left {
  color: skyblue;
  float: left;
  width: 50px;
  padding-left: 20px;
  cursor: pointer;
  margin-top: 10px;
}
.header-button-right {
  color: skyblue;
  float: right;
  width: 50px;
  cursor: pointer;
  margin-top: 10px;
}
.footer {
  width: 100%;
  position: sticky;
  bottom: 0;
  padding-bottom: 10px;
  background-color: white;
}
.footer-button-plus {
  width: 80px;
  margin: auto;
  text-align: center;
  cursor: pointer;
  font-size: 24px;
  padding-top: 12px;
}
.sample-box {
  width: 100%;
  height: 600px;
  background-color: bisque;
}
.inputfile {
  display: none;
}
.input-plus {
  cursor: pointer;
}
#app {
  box-sizing: border-box;
  font-family: "consolas";
  margin-top: 60px;
  width: 100%;
  max-width: 460px;
  margin: auto;
  position: relative;
  border-right: 1px solid #eee;
  border-left: 1px solid #eee;
}
</style>
