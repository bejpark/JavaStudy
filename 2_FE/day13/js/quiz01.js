const ulEl = document.querySelector('ul')

for (let i = 1; i < 10; i++) {
    //document.write('<ddd');
    const ul = document.createElement('ul')
    ul.textContent = `***** ${i} 단***** `
    ulEl.appendChild(ul)
    for (let j = 1; j < 10; j++) {
        const li = document.createElement('li')
        li.textContent = `${i} X ${j} = ${i*j}`
            //console.log(li)
        ulEl.appendChild(li)
    }
}