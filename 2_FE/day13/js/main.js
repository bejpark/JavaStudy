//html요소(element) 1개 검색/찾기
//document.getElementById
let boxEl = document.querySelector('.box');
let boxE = document.querySelectorAll('.box');
console.log(boxEl);
boxE.forEach(function(boxEl, index) {
    boxEl.classList.add(`order-${index+1}`);
    console.log(index, boxEl);
})


//html요소에 적용하는 메소드
//boxE1.addEventListener();

//argument 추가
//boxE1.addEventListener(1, 2);

// 1 - 이벤트
//boxE1.addEventListener('click', 2);

// 2 - 핸들러(handler,실행함수)
boxEl.addEventListener('click', function() {
    alert('clicked');
    console.log('click');
    // boxE1.classList.add('active');
});

//요소의 클래스 정보 객체 활용
boxEl.classList.add('active');
console.log(
    boxEl.classList.contains('active')
)

boxEl.classList.remove('active');
let isContains = boxEl.classList.contains('active');
console.log(isContains);

const boxEl2 = document.querySelector('.box');

//Getter 받는 용도
console.log(boxEl2.textContent);
//Setter 값 지정
boxEl2.textContent = '덮어쓰기';
console.log(boxEl2.textContent);

const str1 = 'I-ON';
//split : 인수 기준으로 쪼개서 배열로 반환
//reverse : 뒤집기
//join : 인수 기준으로 병합
const str2 = str1.split('').reverse().join('');
console.log(str1)
console.log(str2)