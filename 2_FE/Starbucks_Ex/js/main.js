const searchE1 = document.querySelector('.search');
const searchInputE1 = searchE1.querySelector('input');

searchE1.addEventListener('click', function() {
    searchInputE1.focus();
})

searchInputE1.addEventListener('focus', function() {
    searchE1.classList.add('focused');
    searchInputE1.setAttribute('placeholder', '통합검색');
})
searchInputE1.addEventListener('blur', function() {
    searchE1.classList.remove('focused');
    searchInputE1.setAttribute('placeholder', '');
})



/**
 * 페이지 스크롤에 따른 요소 제어
 */
// 페이지 스크롤에 영향을 받는 요소들을 검색!
const badgeEl = document.querySelector('header .badges')
const toTopEl = document.querySelector('#to-top')
    // 페이지에 스크롤 이벤트를 추가!
    // 스크롤이 지나치게 자주 발생하는 것을 조절(throttle, 일부러 부하를 줌)
window.addEventListener('scroll', _.throttle(function() {
        // 페이지 스크롤 위치가 500px이 넘으면.
        if (window.scrollY > 500) {
            // Badge 요소 숨기기!
            gsap.to(badgeEl, .6, {
                    opacity: 0,
                    display: 'none'
                })
                // 상단으로 스크롤 버튼 보이기!
            gsap.to(toTopEl, .2, {
                x: 0
            })

            // 페이지 스크롤 위치가 500px이 넘지 않으면.
        } else {
            // Badge 요소 보이기!
            gsap.to(badgeEl, .6, {
                    opacity: 1,
                    display: 'block'
                })
                // 상단으로 스크롤 버튼 숨기기!
            gsap.to(toTopEl, .2, {
                x: 100
            })
        }
    }, 300))
    // 상단으로 스크롤 버튼을 클릭하면,
toTopEl.addEventListener('click', function() {
    // 페이지 위치를 최상단으로 부드럽게(0.7초 동안) 이동.
    gsap.to(window, .7, {
        scrollTo: 0
    })
})

//메인화면 순서대로 나타나는 기능
const fadeEls = document.querySelectorAll('.visual .fade-in');
fadeEls.forEach(function(fadeEl, index) {
    gsap.to(fadeEl, 1, {
        delay: (index + 1) * .7,
        opacity: 1
    })
})