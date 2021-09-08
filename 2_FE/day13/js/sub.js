import getType from './test.js';

console.log(typeof('Hello World'));
console.log(typeof 123);
console.log(typeof {});
console.log(typeof []);

// function getType(data) {
//     return Object.prototype.toString.call(data).slice(8, -1)
// }

console.log(getType(123));
console.log(getType(false));