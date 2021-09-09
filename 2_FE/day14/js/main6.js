const result = 'Hello World'.indexOf('orld')
console.log(result)


const str = 'bejpark@naver.com'
console.log(str.match(/.+(?=@)/))


const msg = '   Hello world     '
console.log(msg.length);
const count = msg.trim();
console.log(count.length);

const p = 'the quick brown for jumps over the lazy dog.'
console.log(p.replace('dog', 'cat'));
const regex = /CAT/i;
console.log(p.replace(regex))


const pi = 3.141592747

const s1 = pi.toFixed(2);
console.log(s1);
console.log(typeof s1)
const integer = parseInt(s1)
const float = parseFloat(s1)


console.log(integer)
console.log(float)
console.log(typeof integer, typeof float);


//Array
const cars = ["Saab", "Volvo", "BMW"];
const numbers = [1, 2, 3];
console.log(numbers);
console.log(cars);
const found = numbers.find(a => a > 1);
console.log(found);

const ages = [3, 10, 18, 20];

function checkAge(age) {
    return age > 18;
}

function myFunction() {
    document.getElementById("demo").innerHTML = ages.find(checkAge);
}
myFunction();
document.getElementById("demo").innerHTML += `<br>${ages}`;

cars.forEach(function(element, index) {
    console.log(element, index);
    console.log(`${element}-${index}`)
})



const arrAA = cars.forEach(function(car, i) {
    return `${car} : ${i}`;
})
console.log(arrAA)

//map()
const arrA = cars.map(function(car, i) {
    return `${car} : ${i}`;
})
console.log(arrA)