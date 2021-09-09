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

function person(first, last) {
    this.firstName = first;
    this.lastName = last;
    // this.getFullName=()=>{
    //     return `${this.firstName} ${this.lastName}`;
    // }
    //return 타입만 있는경우
    //this.getFullName=()=>`${this.firstName} ${this.lastName}`
}

person.prototype.getFullName = function() {
    return `${this.firstName} ${this.lastName}`;
}

const person1 = new person('yuna', 'kim');
const person2 = new person('yuna2', 'kim2');
const person3 = new person('yuna3', 'kim3');


console.log(person)
console.log(person1.firstName)
console.log(person1.getFullName())


class Vehicle {
    constructor(name, whell) {
        this.name = name
        this.whell = whell
    }
}
const myVehicle = new Vehicle('운송수단', 2)

class Bicycle extends Vehicle {
    constructor(name, wheel) {
        super(name, wheel);
    }
}

class Car extends Vehicle {
    constructor(name, wheel, license) {
        super(name, wheel);
        this.license = license;
    }
}