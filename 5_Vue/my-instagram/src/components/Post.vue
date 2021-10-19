<template>
  <div class="post">
    <div class="post-header">
      <div class="profile"></div>
      <span class="profile-name">{{ postdata.name }}</span>
    </div>
    <div
      :class="postdata.filter"
      class="post-body"
      :style="{ backgroundImage: `url(${postdata.postImage})` }"
    ></div>
    <div class="post-content">
      <p>
        {{ postdata.likes + $store.state.likes[index] }} likes
        <span :class="likedclass" @click="likeClick">like!</span>
      </p>
      <!-- <p @click="$store.commit('like')">
        {{postdata.likes+$store.state.likess}} Likes
      </p> -->
      <p>
        <strong>{{ postdata.name }}</strong> {{ postdata.content }}
      </p>
      <p class="date">May 15</p>

    </div>
  </div>
</template>

<script>
export default {
  name: "Post",
  data() {
    return {
      likess: 0,
      likedclass: 'notliked',
    };
  },
  props: {
    postdata: Array,
    index:Number
  },
  methods: {
    likeClick() {
      if (this.likess == 0) {
        this.$store.commit('liked',this.index)
        this.likess = 1;
        this.likedclass = 'liked';
      } else {
        this.$store.commit('liked',this.index)
        this.likess = 0;
        this.likedclass = 'notliked';
      }
    },
  },
};
</script>

<style scoped>
@import "../css/post.css";
.liked {
  background-color: red;
}
</style>
