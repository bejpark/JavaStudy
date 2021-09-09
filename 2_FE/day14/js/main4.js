//타이머 함수
// setTimeout(함수,시간): 일정 시간 후 함수 실행
// setInterval(함수,시간): 시간 간격마다 함수 실행
// clearTimeout(): 설정된 Timeout함수를 종료
// clearInterval(): 설정된 Interval함수를 종료
// 1/1000 <== 1초
setTimeout(() => {
    console.log('bejpark')
}, 3000);
setTimeout(function a() {
    console.log('bejpark2')
}, 3000);
const timer = setTimeout(() => {
    console.log('3000sec')
}, 3000);

const h1E1 = document.querySelector('h1')
h1E1.addEventListener('click', () => {
    console.log('timer stop')
    clearTimeout(timer)
})

function timeout(call) {
    setTimeout(() => {
        console.log('park')
        call()
    }, 1000);
}
timeout(() => {
    console.log('done');
})