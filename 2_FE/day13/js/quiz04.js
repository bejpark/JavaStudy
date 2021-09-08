function line() {
    document.getElementById("line").innerHTML += '<hr width = "100%" color = "black" size = "3"><br>'
}

function clicked() {
    var inputNum = prompt('숫자를 입력하세요');
    doubleFunc(inputNum)
}

function doubleFunc(input) {
    input = input * 2
    alert(`결과 : ${input}`)
}