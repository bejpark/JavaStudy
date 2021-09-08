var inputNum = prompt('숫자를 입력하세요');
if (inputNum % 2 == 0) {
    alert(`결과 :  ${eval(inputNum +'+ 77')}`)
} else {
    alert(`결과 :  ${eval(inputNum +'+ 55')}`)
}