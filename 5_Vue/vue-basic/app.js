Vue.component('sibling-component',{
  props:['propsdata'],
  template:'<p>{{propsdata}}</p>'
})
var app = new Vue({
  el:'#app',
  data:{
    message:'hi is from parent'
  }
})
