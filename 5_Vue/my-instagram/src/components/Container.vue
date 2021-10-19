<template>
  <div v-if="step == 0">
    <Post :postdata="postdata[i]" v-for="(p, i) in postdata" :key="i" />
  </div>

  <!-- 필터선택페이지 -->
  <div v-if="step == 1">
    <div :class="choicefilter" class="upload-image" :style="`background-image:url(${myimage})`"></div>
    <div class="filters">
      <FilterBox v-for="f in filters" :key="f" :filter="f" :myimage="myimage">
        <span class="filtername">{{f}}</span>
        <!-- <template v-slot:x>데이러x</template>
        <template v-slot:y>데이러y</template> -->

        <!-- 부모는 {{자식데이터}} 형식으로 사용 -->
        <!-- <template v-slot:default="Naming">{{Naming.msg}}</template> -->

        </FilterBox>
    </div>
  </div>

  <div v-if="step == 2">
    <div :class="choicefilter" class="upload-image" :style="`background-image:url(${myimage})`"></div>
    <div class="write">
    <textarea @input="$emit('mywrite', $event.target.value)" class="write-box">글쓰는곳</textarea>
    </div>
  </div>
</template>

<script>
import Post from "./Post";
import FilterBox from "./FilterBox";
export default {
  name: "Container",
  data(){
    return{
      filters:[ "aden", "_1977", "brannan", "brooklyn", "clarendon", "earlybird", "gingham", "hudson",
                "inkwell", "kelvin", "lark", "lofi", "maven", "mayfair", "moon", "nashville", "perpetua",
                "reyes", "rise", "slumber", "stinson", "toaster", "valencia", "walden", "willow", "xpro2"]
    }
  },
  props: {
    postdata: Array,
    step: Number,
    myimage: String,
    choicefilter:String,
  },
  components: {
    Post,FilterBox,
  },
};
</script>

<style>
.filtername{
  padding: 2px;
  background-color: #000;
  font-weight: bold;
}
.upload-image {
  width: 100%;
  height: 450px;
  background: cornflowerblue;
  background-size: cover;
}
.filters {
  overflow-x: scroll;
  white-space: nowrap;
}
.filter-1 {
  width: 100px;
  height: 100px;
  background-color: cornflowerblue;
  margin: 10px 10px 10px auto;
  padding: 8px;
  display: inline-block;
  color: white;
  background-size: cover;
}
.filters::-webkit-scrollbar {
  height: 5px;
}
.filters::-webkit-scrollbar-track {
  background: #f1f1f1;
}
.filters::-webkit-scrollbar-thumb {
  background: #888;
  border-radius: 5px;
}
.filters::-webkit-scrollbar-thumb:hover {
  background: #555;
}
.write-box {
  border: none;
  width: 90%;
  height: 100px;
  padding: 15px;
  margin: auto;
  display: block;
  outline: none;
}
</style>
