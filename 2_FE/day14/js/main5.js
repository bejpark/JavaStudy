/*
1)프로퍼티 방식
const 인스턴스 ={
    프로퍼티1:초기값,
    프로퍼티2:초기값,
    메소드1:function(){

    },
    메소드2:function(){

    }
}

2)함수 방식
function 클래스명(){
    this.프로퍼티1=초기값;
    this.프로퍼티2=초기값;
    this.메소드1=function(){

    }
    this.메소드2=function(){

    }
}

3)프로토타입 방식
const 인스턴스 = new 클래스명();

function 클래스이름(){
    this.프로퍼티1 = 초기값;
    this.프로퍼티2 = 초기값;

    클래스이름.prototype.메소드1 = function(){

    }
}
*/


const bejpark = {
    firstName: 'BJ',
    lastName: "Park",
    getFullName: function() {
        return `${this.firstName} ${this.lastName}`;
    }
}
console.log(bejpark.getFullName())
console.log('------------------------')

function user(first, last) {
    this.firstName = first
    this.lastName = last
    this.getFullName = function() {
        return `${this.firstName} ${this.lastName}`;
    }
}
const yuna = new user('yuna', 'kim');
console.log(yuna)
console.log(yuna.firstName)