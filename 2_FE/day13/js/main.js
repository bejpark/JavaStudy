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
console.log(
    boxEl.classList.contains('active')
)