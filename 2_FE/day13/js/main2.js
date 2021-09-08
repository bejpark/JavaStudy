import random from "./test2.js"


const a = 1
const b = '1'
console.log(a == b)

function isEqual(x, y) {
    return x === y
}

console.log(isEqual(1, 1))
console.log(isEqual(2, '2'))

const aa = 1 === 1
const bb = 'AB' === 'AB'
const cc = false
console.log(aa === bb)
console.log(aa !== bb)

console.log(a ? '참' : '거짓')
let rand = Math.floor(Math.random() * 10) //floor로 정수로 
console.log('rand: ', rand);
console.log(Math.floor(Math.random() * 10))
const e = random();
if (e === 0) {
    console.log("e is 0")
} else {
    console.log(e + ' rest..')
}

for (let i = 0; i < 3; i++)
    console.log(i)


const ulEl = document.querySelector('ul')

for (let i = 0; i < 10; i += 1) {
    const li = document.createElement('li')
    li.textContent = `list-${i+1}`
    ulEl.appendChild(li)
    li.addEventListener('click', function() {
        if ((i + 1) % 2 == 0)
            console.log(li.textContent)
    })
    ulEl.appendChild(li)
}