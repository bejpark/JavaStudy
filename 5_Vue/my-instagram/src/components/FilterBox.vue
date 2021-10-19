<template>
  <div @click="fire" :class="filter+' filter-item'" :style="`background-image:url(${myimage})`">
      <slot></slot>
      <!-- <slot :msg="msg"></slot> -->
      <!-- :보낼변수="자식변수" -->
      <!-- <slot name="y"></slot> -->
      
<!-- 
      mitt로 데이터 전송 방법
      1.this.emitter.emit()으로 보내고
      2.this.emitter.on()수신함 -->
  </div>
</template>

<script>
export default {
    name:'FilterBox',
    data(){
        return{
            msg:'hi from filterbox' //자손의 데이터를 부모로 보내기
        }
    },
    props:{
        myimage:String,
        filter:String,
    },
    methods: {
        fire(){
            this.emitter.emit('boxclick',this.filter);
        }
    },

}
</script>

<style>
.filter-item {
  width: 100px;
  height: 100px;
  margin: 10px 10px 10px auto;
  padding: 8px;
  display: inline-block;
  color : white;
  background-size: cover;
  background-position : center;
}
</style>