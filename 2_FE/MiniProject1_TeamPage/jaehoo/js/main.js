const toAboutme = document.querySelector('.btn-aboutme');
const toContact = document.querySelector('.btn-contact');
console.log(toAboutme);
toAboutme.addEventListener('click', function() {
    // 페이지 위치를 최상단으로 부드럽게(0.7초 동안) 이동.
    gsap.to(window, .7, {
        scrollTo: 700
    })
})

var ul = document.querySelector('.slide_wrap');
var firstItemClone = ul.firstElementChild.cloneNode(true);
ul.appendChild(firstItemClone);
        function move(){
 
            var curIndex = 0;
 
            setInterval(function(){
                ul.style.transition = '0.2s';
                ul.style.transform = "translate3d(-"+720*(curIndex+1)+"px, 0px, 0px)";
 
                curIndex++;
 
                if(curIndex === 4){
                    setTimeout(function(){
                        ul.style.transition = '0s';
                        ul.style.transform = "translate3d(0px, 0px, 0px)";
                    },201)
                    curIndex = 0;
                }
 
            },3000);
        }
        
        document.addEventListener("DOMContentLoaded",function(){
            move();
        });
