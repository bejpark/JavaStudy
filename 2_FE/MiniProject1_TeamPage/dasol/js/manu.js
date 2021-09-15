const toAboutme = document.querySelector('.btn-aboutme');
const toContact = document.querySelector('.btn-contact');
console.log(toAboutme);
toAboutme.addEventListener('click', function() {
    // 페이지 위치를 최상단으로 부드럽게(0.7초 동안) 이동.
    gsap.to(window, .7, {
        scrollTo: 700 // 최상단 px위치
    })
})

toContact.addEventListener('click', function() {
    // 페이지 위치를 최상단으로 부드럽게(0.7초 동안) 이동.
    gsap.to(window, .7, {
        scrollTo: 1000
    })
})

