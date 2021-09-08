const ulEl = document.querySelector('.blank');

for (let i = 0; i < 10; i += 1) {
    const li = document.createElement('li')
    li.textContent = `list-${i+1}`
    ulEl.appendChild(li)
}