<template>
  <div class="post">
    <div class="post-header">
      <div class="profile"></div>
      <span class="profile-name">{{postdata.name}}</span>
    </div>
    <div class="post-body" :style="{backgroundImage:`url(${postdata.postImage})`}"></div>
    <div class="post-content">
      <p>{{postdata.likes}} likes</p>
      <p><strong>{{postdata.name}}</strong> {{postdata.content}}</p>
      <p class="date">May 15</p>
    </div>
  </div>
</template>

<script>
export default {
    name:'Post',
  props:{
      postdata:Array
  }
};
</script>

<style scoped>
@import '../css/post.css'
</style>
